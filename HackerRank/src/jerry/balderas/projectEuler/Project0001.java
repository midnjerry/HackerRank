package jerry.balderas.projectEuler;

import java.util.Scanner;

public class Project0001 {

	public static long getSum(int n) {
		long threes = (n - 1) / 3;
		long fives = (n - 1) / 5;
		long fifteens = (n - 1) / 15;
		long threeSum = (threes + 1) * threes * 3 / 2;
		long fiveSum = (fives + 1) * fives * 5 / 2;
		long fifteenSum = (fifteens + 1) * fifteens * 15 / 2;

		return threeSum + fiveSum - fifteenSum;
	}

	public static long bruteForce(int n) {
		long sum = 0;

		for (int i = 0; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;

	}

	/*
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
	 * we get 3,5,6 and 9. The sum of these multiples is 23. Find the sum of all
	 * the multiples of or below .
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			System.out.println(getSum(n));
		}
		in.close();
	}

}
