package jerry.balderas.projectEuler;

import java.util.Scanner;
import java.util.TreeSet;

public class Project0014 {

	static int N = 5 * 1000 * 1000;
	static Long[] chainLengthCache;
	static TreeSet<Integer> longestCache;

	static void prepareCache() {
		chainLengthCache = new Long[N + 1];
		longestCache = new TreeSet<Integer>();
		getLongestChain(N);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		prepareCache();
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			System.out.println(getLongestChain(n));
		}

		in.close();
	}

	static long getLongestChain(int n) {

		Integer cacheEntry = longestCache.floor(n);
		if (cacheEntry != null) {
			return cacheEntry;
		}

		int result = 0;
		long max = 0;

		for (int i = 1; i <= n; i++) {
			long length = getCollatzSequenceLength(i);
			if (length >= max) {
				max = length;
				result = i;
				if (!longestCache.contains(result)) {
					longestCache.add(result);
				}
			}

		}

		return result;
	}

	static long getCollatzSequenceLength(long n) {
		if (n == 1) {
			return 1;
		}

		if (n < chainLengthCache.length && chainLengthCache[(int) n] != null) {
			return chainLengthCache[(int) n];
		}

		long sum = 1;

		if (n % 2 == 0) {
			sum += getCollatzSequenceLength(n / 2);
		} else {
			sum += getCollatzSequenceLength(3 * n + 1);
		}

		if (n < chainLengthCache.length) {
			chainLengthCache[(int) n] = sum;
		}

		return sum;

	}

}
