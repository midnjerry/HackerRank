package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest0005 {

	@Before
	public void setup() {
	}

	@Test
	public void testSample0() {



		assertEquals(1, Project0005.getMinimumProduct(1));
		assertEquals(2, Project0005.getMinimumProduct(2));
		assertEquals(6, Project0005.getMinimumProduct(3));
		assertEquals(12, Project0005.getMinimumProduct(4));
		assertEquals(60, Project0005.getMinimumProduct(5));
		assertEquals(60, Project0005.getMinimumProduct(6));
		assertEquals(420, Project0005.getMinimumProduct(7));
		assertEquals(840, Project0005.getMinimumProduct(8));
		assertEquals(2520, Project0005.getMinimumProduct(9));
		assertEquals(2520, Project0005.getMinimumProduct(10));
		assertEquals(27720, Project0005.getMinimumProduct(11));
		assertEquals(27720, Project0005.getMinimumProduct(12));
		assertEquals(360360, Project0005.getMinimumProduct(13));
		assertEquals(360360, Project0005.getMinimumProduct(14));
		assertEquals(360360, Project0005.getMinimumProduct(15));
		assertEquals(720720, Project0005.getMinimumProduct(16));
		assertEquals(12252240, Project0005.getMinimumProduct(17));
		assertEquals(12252240, Project0005.getMinimumProduct(18));
		assertEquals(232792560, Project0005.getMinimumProduct(19));
		assertEquals(232792560, Project0005.getMinimumProduct(20));
		assertEquals(5354228880L, Project0005.getMinimumProduct(23));
	}

}