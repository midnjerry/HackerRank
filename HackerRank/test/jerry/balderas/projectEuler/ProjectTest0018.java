package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProjectTest0018 {

	int N = 15;
	int T = 10;

	@Test
	public void SampleTests() {
		int[][] triangle = new int[4][];
		triangle[0] = new int[] { 3 };
		triangle[1] = new int[] { 7, 4 };
		triangle[2] = new int[] { 2, 4, 6 };
		triangle[3] = new int[] { 8, 5, 9, 3 };

		assertEquals(23, Project0018.getMaxSum(triangle));
	}

	@Test
	public void ConstraintTest() {
		int[][] triangle = new int[N][];
		for (int i = 0; i < N; i++) {
			triangle[i] = new int[i + 1];
			for (int j = 0; j < i + 1; j++) {
				triangle[i][j] = 99;
			}
		}

		for (int i = 0; i < T; i++) {
			assertEquals(99 * 15, Project0018.getMaxSum(triangle));
		}
	}

}
