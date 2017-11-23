package jerry.balderas.projectEuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProjectTest0010 {

	// 1 << N << 1000000

	@Test
	void test() {
		assertEquals(0, Project0010.getPrimeSumLessThan(1));
		assertEquals(10, Project0010.getPrimeSumLessThan(5));
		assertEquals(17, Project0010.getPrimeSumLessThan(10));
		assertEquals(37549402040L, Project0010.getPrimeSumLessThan(1000000));

		for (int i = 0; i < 1000; i++) {
			Project0010.getPrimeSumLessThan(1000000 - i);
		}

	}

}
