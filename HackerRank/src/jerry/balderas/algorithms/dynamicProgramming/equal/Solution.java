package jerry.balderas.algorithms.dynamicProgramming.equal;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/equal/problem
 * 
 * You must find minimum number of operations needed to make all elements equal.  You are allowed to subtract 1, 2, or 5 from each
 * element.  There are three possible solutions to explore.  Trying to match all elements with the lowest element.  For the
 * majority of cases, this works.  however.  In cases like 1 5 5 5 - subtracting 1 first element = 0 5 5 5 allowing subtraction
 * of 5 from the other elements -> for a total of 4 OPS in lieu of 6 (subtracting 2 twice from each 5).
 * 
 * Executing an op on the first element is simulated by negOneOP and negTwoOP.  We don't need to calculate negFiveOP.
 */
public class Solution {

	public static int getMinCombos(int[] num) {
		Arrays.sort(num);
		int zeroOP = 0;
		int negOneOP = 1;
		int negTwoOP = 1;
		int base = num[0];
		for (int i = 1; i < num.length; i++) {
			zeroOP += getOps(num[i] - base);
			negOneOP += getOps(num[i] - base + 1);
			negTwoOP += getOps(num[i] - base + 2);
		}
		return Math.min(Math.min(zeroOP, negOneOP), negTwoOP);
	}

	public static int getOps(int diff) {

		int count = 0;
		int total = diff;

		count += total / 5;
		total = total % 5;

		count += total / 2;
		total = total % 2;

		count += total;
		return count;

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
			System.out.println(getMinCombos(chocolates));
		}
		in.close();
	}
}
