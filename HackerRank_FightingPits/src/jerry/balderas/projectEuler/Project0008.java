package jerry.balderas.projectEuler;

import java.util.Scanner;

public class Project0008 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			String num = in.next();
			System.out.println(getGreatestProductForKConsecutiveDigits(num, k));
		}
		in.close();
	}

	static long getGreatestProductForKConsecutiveDigits(String num, int k) {
		long max = 0;
		int length = num.length();
		for (int i = 0; i < length - k + 1; i++) {
			long product = 1;
			for (int j = i; j < i + k; j++) {
				int digit = num.charAt(j) - '0';
				product *= digit;
			}
			if (product > max) {
				max = product;
			}
		}
		return max;
	}

}
