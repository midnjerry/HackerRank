package jerry.balderas.arrayManipulation;

import java.util.HashMap;
import java.util.TreeSet;

public class Tracker {
	private int size;
	private long max = 0;
	private TreeSet<Integer> mSortedMinValues = new TreeSet<Integer>();
	private HashMap<Integer, Range> mTracker = new HashMap<Integer, Range>();

	public Tracker(int n) {
		size = n;
		Range range = new Range(1, n, 0);
		insert(range);
	}

	public void addRange(Range range) {
		Range prevRange = getFloor(range);
		// System.out.println(prevRange.low + "|" + prevRange.high + "|" +
		// prevRange.sum);
		combineRanges(prevRange, range);

	}

	private void combineRanges(Range floor, Range mergeInput) {
		if (doRangesOverlap(floor, mergeInput)) {
			if (floor.low < mergeInput.low) {
				int originalHigh = floor.high;
				floor.high = mergeInput.low - 1;
				floor = new Range(mergeInput.low, originalHigh, floor.sum);
				insert(floor);
			}
			if (floor.low == mergeInput.low) {
				if (floor.high < mergeInput.high) {
					floor.sum += mergeInput.sum;
					if (floor.sum > max)
						max = floor.sum;
					Range nextRange = mTracker.get(floor.high + 1);
					mergeInput.low = floor.high + 1;
					combineRanges(nextRange, mergeInput);
				} else {
					int originalHigh = floor.high;
					long originalSum = floor.sum;
					floor.high = mergeInput.high;
					floor.sum += mergeInput.sum;
					if (floor.sum > max)
						max = floor.sum;
					if (originalHigh > floor.high) {
						floor = new Range(floor.high + 1, originalHigh, originalSum);
						insert(floor);
					}

				}
			}
		}

	}

	private boolean doRangesOverlap(Range rangeA, Range rangeB) {
		return rangeA.low <= rangeB.high && rangeB.low <= rangeA.high;
	}

	private void insert(Range range) {
		mTracker.put(range.low, range);
		mSortedMinValues.add(range.low);
	}

	public Range getFloor(Range input) {
		Integer key = mSortedMinValues.floor(input.low);
		return mTracker.get(key);
	}

	public long getMax() {
		return max;
	}

	public long[] getValues() {
		long[] result = new long[size + 1];

		for (int key : mTracker.keySet()) {
			Range range = mTracker.get(key);
			for (int i = range.low; i <= range.high; i++) {
				result[i] = range.sum;
			}
		}
		return result;
	}


}
