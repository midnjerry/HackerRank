package jerry.balderas.projectEuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Project0010 {

	static int N = 1000000;
	static boolean[] isPrime = new boolean[N + 1];
	static ArrayList<Integer> primes = new ArrayList<Integer>();

	static {
		Arrays.fill(isPrime, true);
		for (int i = 2; i <= N; i++) {
			if (isPrime[i]) {
				for (long j = (long) i * i; j <= N; j += i) {
					isPrime[(int) j] = false;
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
			System.out.println(getPrimeSumLessThan(n));
		}
		in.close();
	}

	// 1 <= N <= 10^6

	static long getPrimeSumLessThan(int n) {
		long sum = 0;

		Iterator<Integer> it = primes.iterator();

		int prime = it.next();
		while (it.hasNext() && prime <= n) {
			sum += prime;
			prime = it.next();
		}

		return sum;
	}
}
