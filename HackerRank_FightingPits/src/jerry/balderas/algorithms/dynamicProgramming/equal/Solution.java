package jerry.balderas.algorithms.dynamicProgramming.equal;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	private static int getMinCombos(int iteration, int[] num) {
		int operations = 0;
		int diff = 0;
		for (int i = 1; i < num.length; i++) {

			diff = num[i] + diff - num[i - 1];
			if (diff == 3 || diff == 4) {
				// specialCases
				int streak = getStreak(i, num);
				if (streak > 1) {
					diff += streak * 5 + (5 - diff);
					operations += streak + 1;
					i += streak - 1;
				} else {
					operations += getOps(diff);
				}
			} else {
				operations += getOps(diff);
			}
		}
		return operations;
	}

	private static int getStreak(int start, int[] num) {
		int streak = 1;
		int base = num[start];
		for (int i = start + 1; i < num.length; i++) {
			if (base == num[i])
				streak++;
			else
				break;
		}
		return streak;
	}

	private static int getOps(int diff) {
		int count = 0;
		while (diff > 0) {
			if (diff >= 5) {
				diff -= 5;
			} else if (diff >= 2) {
				diff -= 2;
			} else
				diff--;
			count++;
		}
		return count;
	}

	/*
	 * private static int getMinCombos(int iteration, int[] num) { int
	 * operations = 0; for (int i = 1; i < num.length; i++) { while (num[i] >
	 * num[i - 1]) { int diff = num[i] - num[i - 1]; if (diff >= 5) doOP(num, i,
	 * 5); else if (diff >= 2) doOP(num, i, 2); else doOP(num, i, 1);
	 * operations++; } } return operations; }
	 */

	private static void doOP(int[] num, int indexToSkip, int value) {
		for (int i = 0; i < num.length; i++) {
			if (i != indexToSkip) {
				num[i] += value;
			}
		}

	}

	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int[] chocolates = new int[n];
			for (int j = 0; j < n; j++) {
				chocolates[j] = in.nextInt();
			}
			Arrays.sort(chocolates);
			System.out.println(getMinCombos(0, chocolates));
		}
		in.close();
	}
}
