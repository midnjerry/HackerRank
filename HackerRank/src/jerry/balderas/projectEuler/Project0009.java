package jerry.balderas.projectEuler;

import java.util.Scanner;

public class Project0009 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			System.out.println(findProductOfPythagoreanTriplet(n));
		}
		in.close();
	}

	static long findProductOfPythagoreanTriplet(long n) {
		long result = -1;

		// substituted a + b + c = N into a^2 + b^2 = c^2
		// b = (2aN - N^2) / (-2N + 2a)

		for (long a = n / 2; a >= 3; a--) {
			long numerator = 2 * a * n - n * n;
			long denominator = -2 * n + 2 * a;

			if (numerator % denominator == 0 && numerator != 0) {
				long b = numerator / denominator;
				long c = n - a - b;
				if (a * a + b * b == c * c && a + b + c == n) {
					long temp = a * b * c;

					if (temp > result)
						result = temp;
					// System.out.println(a + ":" + b + ":" + c + ":" + n + ":"
					// + temp);
				}
			}
		}
		return result;
	}
}
