package jerry.balderas.tracks.statistics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Day0_Mean_Median_Mode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numbers = new int[n];
		for (int a0 = 0; a0 < n; a0++) {
			int num = in.nextInt();
			numbers[a0] = num;
		}

		System.out.println(String.format("%.1f", getMean(numbers)));
		System.out.println(String.format("%.1f", getMedian(numbers)));
		System.out.println(getMode(numbers));

		in.close();
	}

	static double getMedian(int[] numbers) {
		Arrays.sort(numbers);
		int n = numbers.length;
		double median = numbers[n / 2];
		if (n % 2 == 0) {
			median = (median + numbers[n / 2 - 1]) / (double) 2;
		}
		return median;
	}

	static double getMean(int[] numbers) {
		double average = 0;
		double sum = 0;
		if (numbers.length > 0) {
			for (int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}
			average = sum / (double) numbers.length;
		}
		return average;
	}

	static int getMode(int[] numbers) {
		int maxCount = 0;
		HashMap<Integer, Integer> modeCount = new HashMap<Integer, Integer>();
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			int count = 1;
			int value = numbers[i];
			if (modeCount.containsKey(value)) {
				count = modeCount.get(value) + 1;
			}
			modeCount.put(value, count);

			if (count == maxCount && value < result) {
				result = value;
			}
			if (count > maxCount) {
				result = value;
				maxCount = count;
			}

		}
		return result;
	}
}
