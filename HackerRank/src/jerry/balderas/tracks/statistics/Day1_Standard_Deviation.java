package jerry.balderas.tracks.statistics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Day1_Standard_Deviation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numbers = new int[n];
		for (int a0 = 0; a0 < n; a0++) {
			int num = in.nextInt();
			numbers[a0] = num;
		}

		System.out.println(String.format("%.1f", getStandardDeviation(numbers)));
		in.close();
	}

	/*
	 * Standard Deviation One Pass by: Mark Hoemmen
	 * http://suave_skola.varak.net/proj2/stddev.pdf
	 */

	static double getStandardDeviation(int[] numbers) {
		if (numbers.length > 0) {
			double m = numbers[0];
			double q = 0;
			int n = numbers.length;
			for (int i = 1; i < n; i++) {
				q += i * (numbers[i] - m) * (numbers[i] - m) / (double) (i + 1);
				m += ((numbers[i] - m) / (double) (i + 1));
			}

			double stdDev = Math.sqrt(q / (double) n);
			return stdDev;
		}
		return 0;
	}

	static double getStandardDeviationBruteForce(int[] numbers) {
		double average = Day0_Mean_Median_Mode.getMean(numbers);
		double differenceSum = 0;
		for (int i = 0; i < numbers.length; i++) {
			differenceSum += (numbers[i] - average) * (numbers[i] - average);
		}
		double stdDev = Math.sqrt(differenceSum / numbers.length);

		return stdDev;
	}

	static double getStandardDeviationBigDecimal(int[] numbers) {
		BigDecimal stdDeviation = BigDecimal.ZERO;

		BigDecimal sumSquared = BigDecimal.ZERO;
		BigDecimal sum = BigDecimal.ZERO;
		BigDecimal n = BigDecimal.valueOf(numbers.length);

		for (int i = 0; i < numbers.length; i++) {
			sumSquared = sumSquared.add(BigDecimal.valueOf(numbers[i] * numbers[i]));
			sum = sum.add(BigDecimal.valueOf(numbers[i]));
		}

		stdDeviation = sumSquared.subtract(sum.pow(2).divide(n, 500, RoundingMode.HALF_UP)).divide(n, 500,
				RoundingMode.HALF_UP);

		return Math.sqrt(stdDeviation.doubleValue());
	}

	static double getStandardDeviationDouble(int[] numbers) {

		double stdDev = 0;

		double sumSquared = 0;
		double sum = 0;
		double n = numbers.length;

		for (int i = 0; i < numbers.length; i++) {
			sumSquared += numbers[i] * numbers[i];
			sum += numbers[i];
		}

		stdDev = (sumSquared - (sum * sum) / n) / (n);

		return Math.sqrt(stdDev);
	}
}
