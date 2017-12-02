package jerry.balderas.projectEuler;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest0014 {

	int N = 5 * 1000 * 1000;
	int T = 10000;

	@Before
	public void setup() {
		Project0014.prepareCache();
	}

	@Test
	public void SampleTests2() {
		for (int i = 79; i <= 96; i++) {
			assertEquals(73, Project0014.getLongestChain(i));
		}
	}

	@Test
	public void SampleTests() {

		assertEquals(97, Project0014.getLongestChain(100));
		assertEquals(97, Project0014.getLongestChain(99));
		assertEquals(97, Project0014.getLongestChain(98));
		assertEquals(97, Project0014.getLongestChain(97));
		assertEquals(73, Project0014.getLongestChain(96));
		assertEquals(73, Project0014.getLongestChain(95));
		assertEquals(73, Project0014.getLongestChain(94));
		assertEquals(73, Project0014.getLongestChain(93));
		assertEquals(73, Project0014.getLongestChain(92));
		assertEquals(73, Project0014.getLongestChain(91));
		assertEquals(73, Project0014.getLongestChain(90));
		assertEquals(73, Project0014.getLongestChain(89));
		assertEquals(73, Project0014.getLongestChain(88));
		assertEquals(73, Project0014.getLongestChain(87));
		assertEquals(73, Project0014.getLongestChain(86));
		assertEquals(73, Project0014.getLongestChain(85));
		assertEquals(73, Project0014.getLongestChain(84));
		assertEquals(73, Project0014.getLongestChain(83));
		assertEquals(73, Project0014.getLongestChain(82));
		assertEquals(73, Project0014.getLongestChain(81));
		assertEquals(73, Project0014.getLongestChain(80));
		assertEquals(73, Project0014.getLongestChain(79));

		/*
		 * assertEquals(97, Project0014.getLongestChain(100)); assertEquals(27,
		 * Project0014.getLongestChain(50)); assertEquals(25,
		 * Project0014.getLongestChain(25)); assertEquals(97,
		 * Project0014.getLongestChain(100)); assertEquals(27,
		 * Project0014.getLongestChain(50)); assertEquals(25,
		 * Project0014.getLongestChain(25));
		 * 
		 * assertEquals(3, Project0014.getLongestChain(3)); assertEquals(9,
		 * Project0014.getLongestChain(10)); assertEquals(9,
		 * Project0014.getLongestChain(15)); assertEquals(19,
		 * Project0014.getLongestChain(20)); assertEquals(3,
		 * Project0014.getLongestChain(3)); assertEquals(9,
		 * Project0014.getLongestChain(10)); assertEquals(9,
		 * Project0014.getLongestChain(15)); assertEquals(19,
		 * Project0014.getLongestChain(20)); assertEquals(3,
		 * Project0014.getLongestChain(3)); assertEquals(9,
		 * Project0014.getLongestChain(10)); assertEquals(9,
		 * Project0014.getLongestChain(15)); assertEquals(19,
		 * Project0014.getLongestChain(20));
		 */

	}

	@Test
	public void ConstraintTests() {

		assertEquals(3732423, Project0014.getLongestChain(N));
		assertEquals(9, Project0014.getLongestChain(9));
		assertEquals(97, Project0014.getLongestChain(100));
		assertEquals(871, Project0014.getLongestChain(1000));
		assertEquals(6171, Project0014.getLongestChain(10000));
		assertEquals(77031, Project0014.getLongestChain(100000));
		assertEquals(837799, Project0014.getLongestChain(1000000));
		assertEquals(3732423, Project0014.getLongestChain(N));

	}

	@Test
	public void HeavyLoad() {
		for (int i = 0; i < T; i++) {
			assertEquals(837799, Project0014.getLongestChain(1000000 - i));

		}

	}

	@Test
	public void HeavyLoad2() {
		for (int i = 0; i < T; i++) {
			assertEquals(3732423, Project0014.getLongestChain(N - i));

		}

	}

}
