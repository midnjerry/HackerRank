package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProjectTest0021 {

	int N = 100000;
	int T = 1000;

	@Test
	public void SampleTests() {
		assertEquals(504, Project0021.getSumOfAmicableNumbers(300));
		assertEquals(0, Project0021.getSumOfAmicableNumbers(220));
		assertEquals(220, Project0021.getSumOfAmicableNumbers(221));
		assertEquals(220, Project0021.getSumOfAmicableNumbers(284));
		assertEquals(504, Project0021.getSumOfAmicableNumbers(285));
	}

	@Test
	public void TestConstraints() {
		assertEquals(852810, Project0021.getSumOfAmicableNumbers(N));

		for (int i = 0; i < T; i++) {
			assertEquals(852810, Project0021.getSumOfAmicableNumbers(N));
		}
	}

	@Test
	public void getFactorsSum() {
		assertEquals(0, Project0021.getDivisorsSum(1));
		assertEquals(1, Project0021.getDivisorsSum(2));
		assertEquals(1, Project0021.getDivisorsSum(3));
		assertEquals(1 + 2, Project0021.getDivisorsSum(4));
		assertEquals(1, Project0021.getDivisorsSum(5));
		assertEquals(1 + 2 + 3, Project0021.getDivisorsSum(6));
		assertEquals(1, Project0021.getDivisorsSum(7));
		assertEquals(1 + 2 + 4, Project0021.getDivisorsSum(8));
		assertEquals(1 + 3, Project0021.getDivisorsSum(9));
		assertEquals(1 + 2 + 5, Project0021.getDivisorsSum(10));
		assertEquals(1, Project0021.getDivisorsSum(11));
		assertEquals(1 + 2 + 3 + 4 + 6, Project0021.getDivisorsSum(12));
		assertEquals(284, Project0021.getDivisorsSum(220));
		assertEquals(220, Project0021.getDivisorsSum(284));
	}
}
