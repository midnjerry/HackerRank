package jerry.balderas.projectEuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Project0012 {
	static int N = 100000;
	static boolean[] isPrime = new boolean[N + 1];
	static ArrayList<Integer> primes = new ArrayList<Integer>();

	static {
		Arrays.fill(isPrime, true);
		for (int i = 2; i <= N; i++) {
			if (isPrime[i]) {
				for (long j = (long) i * i; j <= N; j += (long) i) {

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
	}

	static long getFirstTriangularNumberToHaveMoreThanNFactorsBruteForce(int n) {
		if (n == 0) {
			return 1;
		}

		Long[] factors = new Long[0];
		int t = 1;
		long triangularSum = 0;
		while (factors.length <= n) {
			triangularSum = (t + 1) * t / 2;
			factors = findFactors(triangularSum);
			System.out.print(factors.length + " ");
			t++;
		}
		return triangularSum;
	}

	static Long[] findFactors(long number) {
		HashSet<Long> factors = new HashSet<Long>();
		factors.add(1L);
		factors.add(number);
		int primeIndex = 1;
		long prime = primes.get(primeIndex);
		while (prime < number) {
			primeIndex++;
			long factor = 1;
			while (number % prime == 0) {
				factor *= prime;
				factors.add(factor);
				number /= prime;
				factors.add(number);
			}
			prime = primes.get(primeIndex);
		}

		Long[] result = factors.toArray(new Long[factors.size()]);
		Arrays.sort(result);
		return result;
	}

	static long getFirstTriangularNumberToHaveMoreThanNFactors(int n) {

		if (n == 0) {
			return 1;
		}

		for (int i = 2; i <= 100000; i++) {
			long triangularNum = (i + 1) * i / 2;
			HashSet<Long> factors = new HashSet<Long>();
			factors.add(1L);
			factors.add(triangularNum);
			long num = triangularNum;
			for (int j = 2; j <= num; j++) {
				long factor = 1;
				while (num % j == 0) {
					factor *= j;
					factors.add(factor);
					num = num / j;
					factors.add(num);
				}
				if (factors.size() > n) {
					return triangularNum;
				}
			}
		}
		return 0;
	}

}
