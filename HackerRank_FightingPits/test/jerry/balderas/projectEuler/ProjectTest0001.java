package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest0001 {

	@Before
	public void setup() {

	}

	@Test
	public void testSample0() {
		assertEquals(0, Project0001.getSum(1));
		assertEquals(0, Project0001.getSum(3));
		assertEquals(3, Project0001.getSum(4));
		assertEquals(3, Project0001.getSum(5));
		assertEquals(8, Project0001.getSum(6));
		assertEquals(233333333166666668l, Project0001.getSum(1000000000));

		int n = 1000000000;
		long sum = 0;

		for (int i = 0; i <= n; i++) {
			assertEquals(sum, Project0001.getSum(i));

			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
	}

}