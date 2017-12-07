package jerry.balderas.projectEuler;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Project0021 {
	static int N = 100000;
	static int[] sumCache = new int[N + 1];
	static int[] amiableCache = new int[N + 1];
	static long[] cachedResults = new long[N + 1];

	static boolean[] isPrime = new boolean[N + 1];
	static ArrayList<Integer> primes = new ArrayList<Integer>();
	static TreeSet<Integer> amicablePairs = new TreeSet<Integer>();

	static {

		sumCache[1] = 1;
		for (int i = 2; i <= N; i++) {
			sumCache[i] = getDivisorsSum(i);
		}

		for (int i = 2; i <= N; i++) {
			int j = sumCache[i];
			if (j > i && j < N) {
				if (sumCache[j] == i) {
					amicablePairs.add(i);
					amicablePairs.add(j);
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int trials = in.nextInt();

		for (int t = 0; t < trials; t++) {
			int n = in.nextInt();
			System.out.println(getSumOfAmicableNumbers(n));
		}
		in.close();
	}

	static long getSumOfAmicableNumbers(int n) {
		if (cachedResults[n] > 0) {
			return cachedResults[n];
		}

		long sum = 0;
		Integer largestLowerAmicableNum = amicablePairs.lower(n);
		while (largestLowerAmicableNum != null) {
			sum += largestLowerAmicableNum;
			largestLowerAmicableNum = amicablePairs.lower(largestLowerAmicableNum);
		}
		cachedResults[n] = sum;
		return sum;
	}

	static int getDivisorsSum(int n) {
		if (n == 0 || n == 1) {
			return 0;
		}

		int sum = 1;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				sum = ((i * i == n) ? (sum + i) : (sum + i + n / i));
			}
		}
		return sum;
	}

}
