package jerry.balderas.projectEuler;

import java.util.Scanner;

public class Project0183 {
	static int N = 1 * 1000 * 1000;
	static long[] resultCache = new long[N + 1];
	static {

	}

	static boolean isFractionTerminating(int a, int b) {
		int gcf = GCD(a, b);
		int simplifiedTerm = b / gcf;

		while (simplifiedTerm > 1) {
			if (simplifiedTerm % 5 == 0) {
				simplifiedTerm /= 5;
			} else if (simplifiedTerm % 2 == 0) {
				simplifiedTerm /= 2;
			} else {
				return false;
			}
		}
		return true;
	}

	static public int GCD(int a, int b) {
		if (b == 0)
			return a;
		return GCD(b, a % b);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();

		for (int i = 0; i < q; i++) {
			int n = in.nextInt();
			System.out.println(getSumDofN(n));
		}
		in.close();
	}

	static long getSumDofN(int n) {
		long sum = 0;
		for (int i = 5; i <= n; i++) {
			sum += getDof(i);
		}
		return sum;
	}

	static int getDof(int n) {
		int d = 1;

		int k = findPMax(n);

		if (isFractionTerminating(n, k)) {
			d = -1;
		}

		int dValue = d * n;
		return dValue;
	}

	static int findPMax(int n) {
		int maxK = 1;
		double maxP = 0;

		for (int k = 1; k < n; k++) {
			double r = n / (double) k;

			double P = 1;
			for (int p = 1; p <= k; p++) {
				P *= r;
			}

			if (P > maxP) {
				maxP = P;
				maxK = k;
			} else {
				return maxK;
			}
		}

		return maxK;
	}

}
