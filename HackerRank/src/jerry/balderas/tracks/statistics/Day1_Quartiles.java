package jerry.balderas.tracks.statistics;

import java.util.Arrays;
import java.util.Scanner;

public class Day1_Quartiles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numbers = new int[n];
		for (int a0 = 0; a0 < n; a0++) {
			int num = in.nextInt();
			numbers[a0] = num;
		}
		int[] quartiles = getQuartiles(numbers);
		for (int i = 0; i < 3; i++) {
			System.out.println(quartiles[i]);
		}
		in.close();
	}

	static int[] getQuartiles(int[] numbers) {
		Arrays.sort(numbers);
		int[] result = new int[3];

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

	private static int getMedian(int[] numbers, int start, int end) {
		int n = end - start;
		int index = (start + end) / 2;
		int median = numbers[index];
		if (n % 2 == 0) {
			median = (median + numbers[index - 1]) / 2;
		}
		return median;
	}
}
