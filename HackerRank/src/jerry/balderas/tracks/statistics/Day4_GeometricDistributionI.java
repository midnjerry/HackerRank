package jerry.balderas.tracks.statistics;

import java.util.Scanner;

public class Day4_GeometricDistributionI {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pNumerator = in.nextInt();
		int pDenominator = in.nextInt();
		int nTrial = in.nextInt();

		double p = pNumerator / (double) pDenominator;

		System.out.println(String.format("%.3f", getProbabilityOfXOnNthTrial(nTrial, p)));

		in.close();
	}

	static double getProbabilityOfXOnNthTrial(int n, double p) {
		return negativeBinomialDistribution(1, n, p);
	}

	static double negativeBinomialDistribution(int success, int totalTrials, double probability) {
		double q = 1 - probability;
		return getCombinations(totalTrials - 1, success - 1) * Math.pow(probability, success)
				* Math.pow(q, totalTrials - success);
	}

	static long getCombinations(int n, int r) {
		long product = 1;
		long divisor = 1;

		for (int i = 0; i < r; i++) {
			product *= n - i;
			divisor *= i + 1;
		}
		return product / divisor;
	}
}
