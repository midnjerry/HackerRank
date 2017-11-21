package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProjectTest0183 {

	@Test
	public void TestTerminating() {
		assertEquals(false, Project0183.isFractionTerminating(1, 3));
		assertEquals(false, Project0183.isFractionTerminating(10, 30));
		assertEquals(false, Project0183.isFractionTerminating(30, 90));
		assertEquals(false, Project0183.isFractionTerminating(11, 90));
		assertEquals(true, Project0183.isFractionTerminating(1, 4));
	}

	@Test
	public void SampleTests() {
		assertEquals(2438, Project0183.getSumDofN(100));
		assertEquals(377360778718L, Project0183.getSumDofN(1000000));
	}

}
