package jerry.balderas.dataStructures.arrays.arrayManipulation;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import jerry.balderas.dataStructures.arrays.arrayManipulation.Range;
import jerry.balderas.dataStructures.arrays.arrayManipulation.Tracker;

public class TrackerTest {
	private Tracker tracker;

	@Before
	public void setup() {
		tracker = new Tracker(10);
	}

	private void verify(long[] result, long... numbers) {
		for (int i = 1; i <= numbers.length; i++) {
			assertEquals(numbers[i - 1], result[i]);
		}

	}

	@Test
	public void addRangeInsideOtherRange() {
		tracker.addRange(new Range(3, 8, 10));
		tracker.addRange(new Range(4, 7, 10));
		tracker.addRange(new Range(4, 5, 10));
		
		long[] result = tracker.getValues();		
		verify(result, 0, 0, 10, 30, 30, 20, 20, 10, 0, 0);
		assertEquals(30, tracker.getMax());
	}
	
	@Test
	public void addRangeOnTopOfOtherRange() {
		tracker.addRange(new Range(1, 10, 10));
		tracker.addRange(new Range(9, 10, 10));
		tracker.addRange(new Range(9, 10, 10));
		tracker.addRange(new Range(8, 10, 10));
		long[] result = tracker.getValues();		
		verify(result, 10, 10, 10, 10, 10, 10, 10, 20, 40, 40);
		assertEquals(40, tracker.getMax());
	}

}
