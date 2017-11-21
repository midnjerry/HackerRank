package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest0007 {

	@Before
	public void setup() {
	}

	@Test
	public void testSample0() {
		assertEquals(2, Project0007.getPrime(1));
		assertEquals(5, Project0007.getPrime(3));
		assertEquals(13, Project0007.getPrime(6));
		assertEquals(7919, Project0007.getPrime(1000));
		assertEquals(104729, Project0007.getPrime(10000));

	}

}