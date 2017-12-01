package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ProjectTest0012 {

	@Test
	void SampleTests() {
		assertEquals(1, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(0));
		assertEquals(3, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(1));
		assertEquals(6, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(2));
		assertEquals(6, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(3));
		assertEquals(28, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(4));
		assertEquals(28, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(5));
		assertEquals(36, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(6));
		assertEquals(36, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(7));
		assertEquals(36, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(8));
		assertEquals(120, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(9));
		assertEquals(120, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(10));
		assertEquals(25200, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(50));
		assertEquals(73920, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(100));
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(1000));

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

	@Test
	public void TenBigNumbersTest() {
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(991));
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(992));
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(993));
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(994));
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(995));
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(996));
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(997));
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(998));
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(999));
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(1000));
	}

	@Test
	public void TenBigNumbersTest2() {
		assertEquals(73920, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(100));
		assertEquals(2031120, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(200));
		assertEquals(2162160, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(300));
		assertEquals(17907120, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(400));
		assertEquals(76576500, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(500));
		assertEquals(103672800, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(600));
		assertEquals(236215980, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(700));
		assertEquals(236215980, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(750));
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(800));
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(900));
		assertEquals(842161320, Project0012.getFirstTriangularNumberToHaveMoreThanNFactors(1000));
	}

	@Test
	public void FindNumOfFactors() {
		assertEquals(1, Project0012.findNumFactors(1L));
		assertEquals(2, Project0012.findNumFactors(3L));
		assertEquals(4, Project0012.findNumFactors(6L));
		assertEquals(4, Project0012.findNumFactors(10L));
		assertEquals(4, Project0012.findNumFactors(15L));
		assertEquals(4, Project0012.findNumFactors(21L));
		assertEquals(6, Project0012.findNumFactors(28L));

	}

}
