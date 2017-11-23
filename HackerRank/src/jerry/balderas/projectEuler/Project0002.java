package jerry.balderas.projectEuler;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class Project0002 {

	/*
	 * By considering the terms in the Fibonacci sequence whose values do not
	 * exceed N, find the sum of the even-valued terms. Constraints 1 <= T <=
	 * 10^5 10 <= N <= 4 * 10^16
	 */

	static HashMap<Long, BigInteger> fibCache = new HashMap<Long, BigInteger>();
	static {
		fibCache.put(0L, BigInteger.ZERO);
		fibCache.put(1L, BigInteger.ONE);
		fibCache.put(2L, BigInteger.ONE);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			System.out.println(getEvenSum(n));
		}
		in.close();
	}

	static long getEvenSum(long n) {
		long sum = 0;

		long fib = 0;
		int i = 0;
		while (fib < n) {
			if (fib % 2 == 0) {
				sum += fib;
			}
			fib = getFib(i++).longValue();
		}
		return sum;
	}

	public static BigInteger getFib(long n) {
		BigInteger result = BigInteger.ONE;

		if (fibCache.containsKey(n)) {
			return fibCache.get(n);
		}

		long k = n / 2;

		if (n % 2 == 1) {
			result = getFib(k + 1).pow(2).add(getFib(k).pow(2));
		} else {
			result = getFib(k).multiply(BigInteger.valueOf(2).multiply(getFib(k + 1)).subtract(getFib(k)));
		}

		fibCache.put(n, result);

		return result;
	}

}
