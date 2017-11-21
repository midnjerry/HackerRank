package jerry.balderas.projectEuler;

import java.util.Scanner;

public class Project0006 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			System.out.println(getSumDifference(n));
		}
		in.close();
	}

	static long getSumDifference(long n) {
		// Use Faulhaber's Formula

		long sumSquared = (n + 1) * (n) / 2;
		sumSquared *= sumSquared;
		long squareSum = (2 * n * n * n + 3 * n * n + n) / 6;
		return sumSquared - squareSum;
	}
}
