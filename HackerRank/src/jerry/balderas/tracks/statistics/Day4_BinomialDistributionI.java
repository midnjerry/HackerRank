package jerry.balderas.tracks.statistics;

import java.util.Scanner;

public class Day4_BinomialDistributionI {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double m = in.nextDouble();
		double f = in.nextDouble();

		System.out.println(String.format("%.3f", findProbabilityforAtLeastThreeBoysOutOfSixBirths(m, f)));

		in.close();
	}

	static double findProbabilityforAtLeastThreeBoysOutOfSixBirths(double m, double f) {
		double p = m / (m + f);

		double totalProbability = 0;
		int totalBirths = 6;
		for (int boysBorn = 3; boysBorn <= totalBirths; boysBorn++) {
			totalProbability += binomialDistribution(boysBorn, totalBirths, p);
		}
		return totalProbability;
	}

	static double binomialDistribution(int success, int totalTrials, double probability) {
		double q = 1 - probability;
		return getCombinations(totalTrials, success) * Math.pow(probability, success)
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
