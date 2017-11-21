package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest0004 {

	@Before
	public void setup() {
	}



	@Test
	public void testSample0() {
		assertEquals(101101, Project0004.getLargestPalindromeProductLessThan(101110));
		assertEquals(793397, Project0004.getLargestPalindromeProductLessThan(800000));

	}

}