package jerry.balderas.projectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class Project0016 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			System.out.println(getSumOfDigits(n));
		}

		in.close();
	}

	static int getSumOfDigits(int n) {
		BigInteger product = BigInteger.valueOf(2).pow(n);

		BigInteger sum = BigInteger.ZERO;

		while (product.compareTo(BigInteger.ZERO) > 0) {
			sum = sum.add(product.mod(BigInteger.TEN));
			product = product.divide(BigInteger.TEN);
		}

		return sum.intValue();
	}



}
