package jerry.balderas.tracks.statistics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day1_Interquartile_Range {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int a0 = 0; a0 < n; a0++) {
			int num = in.nextInt();
			numbers.add(num);
		}

		for (int a0 = 0; a0 < n; a0++) {
			int count = in.nextInt();
			int num = numbers.get(a0);
			for (int i = 0; i < count - 1; i++) {
				numbers.add(num);
			}
		}

		double[] quartiles = getQuartiles(numbers.toArray(new Integer[numbers.size()]));
		System.out.println(String.format("%.1f", quartiles[2] - quartiles[0]));
		in.close();
	}
	
	static double[] getQuartiles(Integer[] numbers) {
			Arrays.sort(numbers);
			double[] result = new double[3];
	
			int n = numbers.length;
	
			int firstQuartileEnd = n / 2;
			int thirdQuartileStart = n / 2 + 1;
			if (n % 2 == 0) {
				// even, so adjust
				thirdQuartileStart--;
			}
	
			result[0] = getMedian(numbers, 0, firstQuartileEnd);
			result[1] = getMedian(numbers, 0, n);
			result[2] = getMedian(numbers, thirdQuartileStart, n);
			return result;
		}
	
	private static int getMedian(Integer[] numbers, int start, int end) {
			int n = end - start;
			int index = (start + end) / 2;
			int median = numbers[index];
			if (n % 2 == 0) {
				median = (median + numbers[index - 1]) / 2;
			}
			return median;
		}
}

