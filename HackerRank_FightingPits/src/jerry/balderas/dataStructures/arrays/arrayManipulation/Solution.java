package jerry.balderas.arrayManipulation;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int[] sumDiff = new int[n + 1];

		for (int a0 = 0; a0 < m; a0++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();

			sumDiff[a] += k;
			if (b < n) {
				sumDiff[b + 1] -= k;
			}
		}

		long max = 0;
		long sum = 0;
		for (int i = 0; i < sumDiff.length; i++) {
			sum += sumDiff[i];
			if (sum > max) {
				max = sum;
			}
		}

		System.out.println(max);
		in.close();

	}
}
