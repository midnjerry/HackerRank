package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest0016 {

	int N = 10000;
	int T = 100;

	@Before
	public void setup() {

	}

	@Test
	public void SampleTests() {
		assertEquals(8, Project0016.getSumOfDigits(3));
		assertEquals(7, Project0016.getSumOfDigits(4));
		assertEquals(11, Project0016.getSumOfDigits(7));
		assertEquals(13561, Project0016.getSumOfDigits(N));
	}

	@Test
	public void MaxTrials() {
		for (int i = 0; i < T; i++) {
			Project0016.getSumOfDigits(N - i);
		}
	}
}
