package jerry.balderas.projectEuler;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ProjectTest0012 {


	@Test
	void SampleTests() {
		// assertEquals(1,
		// Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(0));
		// assertEquals(3,
		// Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(1));
		// assertEquals(6,
		// Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(2));
		// assertEquals(6,
		// Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(3));
		// assertEquals(28,
		// Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(4));
		// assertEquals(28,
		// Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(1000));
		Long[] factors = new Long[0];
		int n = 9972;
		while (factors.length <= 100) {
			long sum = (n + 1) * n / 2;
			System.out.println(sum);
			factors = Project0012.findFactors(sum);
			System.out.println(n + ":" + factors.length + ":" + Arrays.toString(factors));
			n++;
		}


		/*
		 * assertEquals(1,
		 * Project0012.getFirstTriangularNumberToHaveMoreThanNFactorsBruteForce(
		 * 0)); assertEquals(3,
		 * Project0012.getFirstTriangularNumberToHaveMoreThanNFactorsBruteForce(
		 * 1)); assertEquals(6,
		 * Project0012.getFirstTriangularNumberToHaveMoreThanNFactorsBruteForce(
		 * 2)); assertEquals(6,
		 * Project0012.getFirstTriangularNumberToHaveMoreThanNFactorsBruteForce(
		 * 3)); assertEquals(28,
		 * Project0012.getFirstTriangularNumberToHaveMoreThanNFactorsBruteForce(
		 * 4)); assertEquals(28,
		 * Project0012.getFirstTriangularNumberToHaveMoreThanNFactorsBruteForce(
		 * 1000));
		 */
	}

}
