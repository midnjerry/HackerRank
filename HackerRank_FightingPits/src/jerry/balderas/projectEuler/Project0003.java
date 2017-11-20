package jerry.balderas.projectEuler;

import java.util.Scanner;

public class Project0003 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			System.out.println(getLargestPrimeFactor(n));
		}
		in.close();
	}

	static long getLargestPrimeFactor(long n) {
		long factor = n;

		long product = n;

		for (int i = 2; i <= 10; i++) {
			while (product % i == 0) {
				factor = i;
				product /= i;
			}
		}

		for (int i = 11; i <= Math.sqrt(n); i += 2) {
			while (product % i == 0) {
				factor = i;
				product /= i;
			}
		}

		if (product != 1) {
			factor = product;
		}

		return factor;
	}

}
