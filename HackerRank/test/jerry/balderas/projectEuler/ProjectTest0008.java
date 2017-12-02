package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest0008 {

	@Before
	public void setup() {

	}

	@Test
	public void testSample0() {
		assertEquals(3150, Project0008.getGreatestProductForKConsecutiveDigits("3675356291", 5));
		assertEquals(0, Project0008.getGreatestProductForKConsecutiveDigits("2709360626", 5));
		assertEquals(56700, Project0008.getGreatestProductForKConsecutiveDigits("3675356291", 7));
		assertEquals(56700, Project0008.getGreatestProductForKConsecutiveDigits("7535629", 7));
		assertEquals(9, Project0008.getGreatestProductForKConsecutiveDigits("7535629", 1));

	}

}