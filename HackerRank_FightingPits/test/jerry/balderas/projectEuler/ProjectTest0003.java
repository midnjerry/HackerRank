package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest0003 {

	@Before
	public void setup() {
	}



	@Test
	public void testSample0() {

		assertEquals(5, Project0003.getLargestPrimeFactor(10));
		assertEquals(17, Project0003.getLargestPrimeFactor(17));
		assertEquals(5, Project0003.getLargestPrimeFactor(1000000000000L));
		assertEquals(9901, Project0003.getLargestPrimeFactor(1000000000000L - 1));
		assertEquals(49979693, Project0003.getLargestPrimeFactor(49979693));

		long[] answers = new long[] { 5, 9901, 168406871, 181587071, 166667, 435179, 10127813, 211371803, 4999,
				1000003 };
		for (int i = 0; i < 10; i++) {
			assertEquals(answers[i], Project0003.getLargestPrimeFactor(1000000000000L - i));
		}

	}

}