package jerry.balderas.projectEuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Project0007 {

	static int N = 150000;
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
			System.out.println(getPrime(n));
		}
	}

	static int getPrime(int n) {
		return primes.get(n - 1);
	}

}
