package jerry.balderas.projectEuler;

import java.util.Scanner;

public class Project0023 {
	static int N = 100000;
	static int[] sumCache = new int[N + 1];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int trials = in.nextInt();

		for (int t = 0; t < trials; t++) {
			int n = in.nextInt();
			System.out.println(isSumOfTwoAbundantNumbers(n));
		}
		in.close();
	}

	public static String isSumOfTwoAbundantNumbers(int n) {
		String result = "NO";
		for (int i = 12; i <= n - i; i++) {
			int j = n - i;

			if (isAbundant(i) && isAbundant(j)) {
				return "YES";
			}
		}

		return result;
	}

	static boolean isAbundant(int num) {
		return (getDivisorsSum(num) > num);
	}

	static int getDivisorsSum(int n) {
		if (n == 0 || n == 1) {
			return 0;
		}

		if (sumCache[n] > 0) {
			return sumCache[n];
		}

		int sum = 1;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				sum = ((i * i == n) ? (sum + i) : (sum + i + n / i));
			}
		}

		sumCache[n] = sum;
		return sum;
	}
}
