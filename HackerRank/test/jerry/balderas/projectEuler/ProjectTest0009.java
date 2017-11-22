package jerry.balderas.projectEuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProjectTest0009 {

	// a + b + c = N
	// 1 << N << 3000

	@Test
	void test() {
		assertEquals(60, Project0009.findProductOfPythagoreanTriplet(12));
		assertEquals(-1, Project0009.findProductOfPythagoreanTriplet(4));
		// 44, 117, 125

		assertEquals(643500, Project0009.findProductOfPythagoreanTriplet(286));
		assertEquals(780000000, Project0009.findProductOfPythagoreanTriplet(3000));

		for (int t = 1; t <= 3000; t++) {
			Project0009.findProductOfPythagoreanTriplet(t);
		}

	}

}
