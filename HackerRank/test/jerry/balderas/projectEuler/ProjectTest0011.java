package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProjectTest0011 {

	@Test
	void test() {
		int n = 5;
		int[][] matrix = new int[n][];

		matrix[0] = new int[] { 23, 52, 23, 63, 47 };
		matrix[1] = new int[] { 23, 52, 23, 99, 69 };
		matrix[2] = new int[] { 23, 52, 99, 63, 46 };
		matrix[3] = new int[] { 23, 99, 23, 63, 56 };
		matrix[4] = new int[] { 99, 52, 23, 63, 43 };

		assertEquals((long) Math.pow(99, 4), Project0011.getMaxProductFromMatrix(matrix, 5, 5));

		n = 5;
		matrix = new int[n][];

		matrix[0] = new int[] { 23, 52, 98, 63, 47 };
		matrix[1] = new int[] { 23, 52, 98, 97, 69 };
		matrix[2] = new int[] { 23, 52, 98, 63, 46 };
		matrix[3] = new int[] { 23, 97, 98, 63, 56 };
		matrix[4] = new int[] { 97, 52, 23, 63, 43 };

		assertEquals((long) Math.pow(98, 4), Project0011.getMaxProductFromMatrix(matrix, 5, 5));

		matrix[0] = new int[] { 23, 52, 24, 63, 47 };
		matrix[1] = new int[] { 23, 52, 34, 97, 69 };
		matrix[2] = new int[] { 23, 52, 48, 63, 46 };
		matrix[3] = new int[] { 23, 97, 48, 63, 56 };
		matrix[4] = new int[] { 97, 98, 98, 98, 98 };

		assertEquals((long) Math.pow(98, 4), Project0011.getMaxProductFromMatrix(matrix, 5, 5));

		matrix[0] = new int[] { 97, 98, 98, 98, 98 };
		matrix[1] = new int[] { 23, 52, 24, 63, 47 };
		matrix[2] = new int[] { 23, 52, 34, 97, 69 };
		matrix[3] = new int[] { 23, 52, 48, 63, 46 };
		matrix[4] = new int[] { 23, 97, 48, 63, 56 };

		assertEquals((long) Math.pow(98, 4), Project0011.getMaxProductFromMatrix(matrix, 5, 5));

		matrix[0] = new int[] { 97, 48, 78, 28, 58 };
		matrix[1] = new int[] { 23, 98, 24, 63, 47 };
		matrix[2] = new int[] { 23, 52, 98, 97, 69 };
		matrix[3] = new int[] { 23, 52, 48, 98, 46 };
		matrix[4] = new int[] { 23, 97, 48, 63, 98 };

		assertEquals((long) Math.pow(98, 4), Project0011.getMaxProductFromMatrix(matrix, 5, 5));

	}

}
