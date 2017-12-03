package jerry.balderas.projectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class Project0020 {

	static int N = 1000;
	static BigInteger[] factorialCache = new BigInteger[N + 1];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int trials = in.nextInt();

		for (int t = 0; t < trials; t++) {
			int n = in.nextInt();
			System.out.println(getFactorialDigitSum(n));
		}
		in.close();
	}

	static int getFactorialDigitSum(int n) {
		int sum = 0;

		BigInteger factorial = getFactorial(n);

		while (factorial.compareTo(BigInteger.ZERO) > 0) {
			sum += factorial.mod(BigInteger.TEN).intValue();
			factorial = factorial.divide(BigInteger.TEN);
		}

		return sum;
	}

	private static BigInteger getFactorial(int n) {
		if (n <= 1) {
			return BigInteger.ONE;
		}

		if (factorialCache[n] != null) {
			return factorialCache[n];
		}

		BigInteger result = BigInteger.valueOf(n).multiply(getFactorial(n - 1));
		factorialCache[n] = result;
		return result;
	}
}
