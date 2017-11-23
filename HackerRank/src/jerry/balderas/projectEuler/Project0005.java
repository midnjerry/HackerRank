package jerry.balderas.projectEuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Project0005 {

	static int N = 40;
	static boolean[] isPrime = new boolean[41];
	static ArrayList<Integer> primes = new ArrayList<Integer>();

	static {
		Arrays.fill(isPrime, true);
		for (int i = 2; i <= 40; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= N; j += i) {
					isPrime[j] = false;
				}
				primes.add(i);
			}

		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			System.out.println(getMinimumProduct(n));
		}
		in.close();
	}

	static long getMinimumProduct(int n) {
		long result = 1;

		ArrayList<Integer> factors = new ArrayList<Integer>();

		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				factors.add(i);
				result *= i;
			} else {
				int leftOverFactor = i;
				for (Integer factor : factors) {
					if (leftOverFactor % factor == 0) {
						leftOverFactor /= factor;
					}
				}
				result *= leftOverFactor;
				factors.add(leftOverFactor);
			}

		}

		return result;
	}

	static boolean isPrime(int num) {
		return primes.contains(num);
	}

	// Too long for n = 40
	static long getMinimumProductBruteForce(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		if (result < 0) {
			return -1;
		}

		for (long i = 2; i <= result; i++) {
			boolean isMinimum = true;
			for (int j = n; j >= 2; j--) {
				if (i % j != 0) {
					isMinimum = false;
					break;
				}
			}
			if (isMinimum) {
				result = i;
				break;
			}
		}

		return result;
	}

}
