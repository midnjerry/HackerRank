package jerry.balderas.algorithms.greedy.sherlockAndTheBeast;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void SampleTests() {
		assertEquals("-1", Solution.getDecentNumber(1));
		assertEquals("555", Solution.getDecentNumber(3));
		assertEquals("33333", Solution.getDecentNumber(5));
		assertEquals("55555533333", Solution.getDecentNumber(11));

	}
}
