package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest0006 {

	@Before
	public void setup() {
	}

	@Test
	public void testSample0() {
		assertEquals(0, Project0006.getSumDifference(1));
		assertEquals(22, Project0006.getSumDifference(3));
		assertEquals(2640, Project0006.getSumDifference(10));
		assertEquals(2500166641665000L, Project0006.getSumDifference(10000));

	}

}