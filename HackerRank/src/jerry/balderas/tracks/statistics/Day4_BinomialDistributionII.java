package jerry.balderas.tracks.statistics;

import java.util.Scanner;

public class Day4_BinomialDistributionII {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double probRejects = in.nextDouble() / 100;
		int totalPistons = in.nextInt();

		int rejects = 2;
		System.out.println(String.format("%.3f", findProbabilityforAtMostXOutOfN(rejects, totalPistons, probRejects)));
		System.out.println(String.format("%.3f", findProbabilityforAtLeastXOutOfN(rejects, totalPistons, probRejects)));

		in.close();
	}

	static double findProbabilityforAtLeastXOutOfN(int target, int trials, double p) {
		double totalProbability = 0;
		for (int success = target; success <= trials; success++) {
			totalProbability += binomialDistribution(success, trials, p);
		}
		return totalProbability;
	}

	static double findProbabilityforAtMostXOutOfN(int target, int trials, double p) {
		double totalProbability = 0;
		for (int success = 0; success <= target; success++) {
			totalProbability += binomialDistribution(success, trials, p);
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
