package jerry.balderas.projectEuler;

import java.util.Scanner;

public class Project0004 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			System.out.println(getLargestPalindromeProductLessThan(n));
		}
	}

	static int getLargestPalindromeProductLessThan(int n) {
		int answer = 0;

		for (int i = n - 1; i >= 100001; i--) {
			if (isPalindrome(i)) {
				if (is3DigitProduct(i)) {
					answer = i;
					break;
				}
			}
		}
		return answer;
	}

	private static boolean is3DigitProduct(int n) {
		for (int i = 100; i <= 999; i++) {
			if (n % i == 0) {
				int factor = n / i;
				if (factor < 1000) {
					return true;
				}
			}
		}
		return false;
	}

	static boolean isPalindrome(int n) {
		if (n < 100000 || n > 999999) {
			return false;
		}

		int[] digits = new int[6];

		for (int i = 0; i < 6; i++) {
			digits[i] = n % 10;
			n = n / 10;
			if (i >= 3) {
				if (digits[i] != digits[digits.length - 1 - i]) {
					return false;
				}
			}
		}
		return true;
	}

}
