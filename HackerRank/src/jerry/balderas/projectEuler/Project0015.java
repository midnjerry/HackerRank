package jerry.balderas.projectEuler;

import java.util.Arrays;
import java.util.Scanner;

public class Project0015 {

	static final int MODULO = 1000 * 1000 * 1000 + 7;

	static int N = 500;
	static int M = 500;
	static long[][] cache = new long[N + 1][M + 1];
	static {
		for (int n = 0; n < N; n++) {
			Arrays.fill(cache[n], 0);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			System.out.println(getTotalCombinations(n, m));
		}

		in.close();
	}

	static long getTotalCombinations(int n, int m) {

		if (cache[n][m] > 0) {
			return cache[n][m];
		}

		if (n <= 0 || m <= 0) {
			return 1;
		}

		long sum = 0;

		sum = (getTotalCombinations(n - 1, m) + getTotalCombinations(n, m - 1)) % MODULO;

		cache[n][m] = sum;
		cache[m][n] = sum;

		return sum;
	}

}
