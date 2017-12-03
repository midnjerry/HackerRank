package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProjectTest0019 {

	long Y = 10000000000000000L;
	int T = 100;

	@Test
	public void SampleTests() {
		assertEquals(18, Project0019.getNumFirstOfTheMonthSundays(1900, 1, 1, 1910, 1, 1));
		assertEquals(35, Project0019.getNumFirstOfTheMonthSundays(2000, 1, 1, 2020, 1, 1));

		assertEquals(1720, Project0019.getNumFirstOfTheMonthSundays(Y - 400, 2, 2, (long) Y + 600, 3, 2));
		assertEquals(1720, Project0019.getNumFirstOfTheMonthSundays(Y - 800, 2, 2, (long) Y + 200, 3, 2));
		assertEquals(1720, Project0019.getNumFirstOfTheMonthSundays(Y - 1200, 2, 2, (long) Y - 200, 3, 2));
		assertEquals(1720, Project0019.getNumFirstOfTheMonthSundays(Y, 2, 2, (long) Y + 1000, 3, 2));
	}

	@Test
	public void ConstraintTest() {
		for (int i = 0; i < T; i++) {
			assertEquals(172, Project0019.getNumFirstOfTheMonthSundays(1900, 1, 1, 2000, 1, 1));
		}
	}

	@Test
	public void ConstraintTestLong() {
		for (int i = 0; i < T; i++) {
			assertEquals(1721, Project0019.getNumFirstOfTheMonthSundays(Y, 1, 1, (long) Y + 1000, 12, 31));
		}
	}

}
