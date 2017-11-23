package jerry.balderas.projectEuler;

import java.util.Scanner;

public class Project0011 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] grid = new int[20][20];
		for (int grid_i = 0; grid_i < 20; grid_i++) {
			for (int grid_j = 0; grid_j < 20; grid_j++) {
				grid[grid_i][grid_j] = in.nextInt();
			}
		}

		System.out.println(getMaxProductFromMatrix(grid, 20, 20));

	}

	static long getMaxProductFromMatrix(int[][] grid, int n, int m) {
		long max = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				long product;
				if (j + 3 < m) {
					// horizontal row
					product = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
					if (product > max) {
						max = product;
					}

					if (i + 3 < n) {
						// Diagonal Right
						product = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3];
						if (product > max) {
							max = product;
						}
					}
				}

				if (i + 3 < n) {
					// Vertical
					product = grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j];
					if (product > max) {
						max = product;
					}
					// Diagonal Left
					if (j - 3 >= 0) {
						product = grid[i][j] * grid[i + 1][j - 1] * grid[i + 2][j - 2] * grid[i + 3][j - 3];
						if (product > max) {
							max = product;
						}
					}

				}
			}
		}

		return max;
	}

}
