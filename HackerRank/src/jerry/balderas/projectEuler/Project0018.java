package jerry.balderas.projectEuler;

import java.util.Scanner;

public class Project0018 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int trials = in.nextInt();

		for (int t = 0; t < trials; t++) {
			int n = in.nextInt();
			int[][] triangle = new int[n][];
			for (int i = 0; i < n; i++) {
				triangle[i] = new int[i + 1];
				for (int j = 0; j < i + 1; j++) {
					triangle[i][j] = in.nextInt();
				}
			}
			System.out.println(getMaxSum(triangle));
		}

		in.close();
	}

	static int getMaxSum(int[][] triangle) {
		return getMax(0, 0, triangle);
	}

	static int getMax(int i, int j, int[][] triangle) {
		if (i >= triangle.length) {
			return 0;
		}

		int max = getMax(i + 1, j, triangle);
		int sum2 = getMax(i + 1, j + 1, triangle);

		if (sum2 > max) {
			max = sum2;
		}

		return triangle[i][j] + max;
	}

}
