package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProjectTest0023 {

	int N = 100000;
	int T = 100;

	@Test
	public void SampleTests() {
		assertEquals("YES", Project0023.isSumOfTwoAbundantNumbers(24));
		assertEquals("NO", Project0023.isSumOfTwoAbundantNumbers(49));
	}

	@Test
	public void ConstraintN() {
		assertEquals("YES", Project0023.isSumOfTwoAbundantNumbers(N));
	}

	@Test
	public void ConstraintT() {
		for (int i = 0; i < T; i++) {
			assertEquals("YES", Project0023.isSumOfTwoAbundantNumbers(N - i));
		}
	}
}