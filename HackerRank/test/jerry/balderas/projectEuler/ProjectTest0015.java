package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest0015 {

	int N = 500;
	int M = 500;
	int T = 1000;

	@Before
	public void setup() {

	}

	@Test
	public void SampleTests() {
		assertEquals(2, Project0015.getTotalCombinations(1, 1));
		assertEquals(4, Project0015.getTotalCombinations(1, 3));
		assertEquals(12, Project0015.getTotalCombinations(1, 11));
		assertEquals(6, Project0015.getTotalCombinations(2, 2));
		assertEquals(10, Project0015.getTotalCombinations(3, 2));

		assertEquals(184756, Project0015.getTotalCombinations(10, 10));
		assertEquals(846527861, Project0015.getTotalCombinations(20, 20));
		assertEquals(407336795, Project0015.getTotalCombinations(100, 100));
		assertEquals(159835829, Project0015.getTotalCombinations(500, 500));
		// assertEquals(184756, Project0015.getTotalCombinations(N, M));
	}

	@Test
	public void MaxTrialsMaxConstraints() {
		for (int i = 0; i < T; i++) {
			assertEquals(159835829, Project0015.getTotalCombinations(N, M));
		}
	}

}
