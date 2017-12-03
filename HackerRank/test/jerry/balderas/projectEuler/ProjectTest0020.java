package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProjectTest0020 {

	int N = 1000;
	int T = 100;

	@Test
	public void SampleTests() {
		assertEquals(6, Project0020.getFactorialDigitSum(3));
		assertEquals(9, Project0020.getFactorialDigitSum(6));
	}

	@Test
	public void TestConstraints() {
		assertEquals(10539, Project0020.getFactorialDigitSum(N));

		for (int i = 0; i < T; i++) {
			assertEquals(10539, Project0020.getFactorialDigitSum(N));
		}

		for (int i = 0; i < T; i++) {
			Project0020.getFactorialDigitSum(N - i);
		}
	}
}
