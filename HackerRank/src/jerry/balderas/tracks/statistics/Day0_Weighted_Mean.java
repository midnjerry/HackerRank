package jerry.balderas.tracks.statistics;

import java.util.Scanner;

public class Day0_Weighted_Mean {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numbers = new int[n];
		int[] weights = new int[n];
		for (int a0 = 0; a0 < n; a0++) {
			int num = in.nextInt();
			numbers[a0] = num;
		}
		for (int a0 = 0; a0 < n; a0++) {
			int num = in.nextInt();
			weights[a0] = num;
		}

		System.out.println(String.format("%.1f", getWeightedMean(numbers, weights)));
		in.close();
	}

	static double getWeightedMean(int[] numbers, int[] weights) {
		double weightedSum = 0;
		double sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			weightedSum += numbers[i] * weights[i];
			sum += weights[i];
		}

		if (sum > 0) {
			return weightedSum / sum;
		}
		return 0;
	}
}
