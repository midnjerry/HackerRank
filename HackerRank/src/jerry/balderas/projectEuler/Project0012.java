package jerry.balderas.projectEuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Project0012 {
	static int P = 100000;
	static int N = 1100;

	static Long[] cache = new Long[N + 1];
	static HashMap<Long, Integer> factorCache = new HashMap<Long, Integer>();
	static int cacheTop = 1;
	static boolean[] isPrime = new boolean[P + 1];
	static ArrayList<Integer> primes = new ArrayList<Integer>();

	static {
		Arrays.fill(isPrime, true);
		Arrays.fill(cache, null);
		cache[0] = 1L;
		for (int i = 2; i <= P; i++) {
			if (isPrime[i]) {
				for (long j = (long) i * i; j <= P; j += (long) i) {

					isPrime[(int) j] = false;
				}
				primes.add(i);

			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			System.out.println(getFirstTriangularNumberToHaveMoreThanNFactors(n));
		}
		in.close();
	}

	static int findNumFactors(long number) {

		if (factorCache.containsKey(number)) {
			return factorCache.get(number);
		}

		int product = 1;
		long num = number;
		int i = 0;
		Integer prime = primes.get(i);
		while (prime <= num) {
			int numPrimeFactors = 0;
			while (num % prime == 0) {
				numPrimeFactors++;
				num /= prime;
			}
			product *= (numPrimeFactors + 1);
			prime = primes.get(++i);
		}
		factorCache.put(number, product);

		return product;
	}

	static long getFirstTriangularNumberToHaveMoreThanNFactors(int n) {

		if (cache[n] != null) {
			return cache[n];
		}

		long triangularNum = 1;
		long i = 2;
		int numFactors = 1;
		while (numFactors <= n) {
			triangularNum += i;
			i++;
			numFactors = findNumFactors(triangularNum);
		}

		for (int j = n; j < numFactors && j <= 1000; j++) {
			cache[j] = triangularNum;
		}

		return triangularNum;
	}

}
