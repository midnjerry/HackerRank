package jerry.balderas.tracks.statistics;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class TenDaysOfStatisticsTest {

	private final double EPSILON = 0.05;

	@Test
	public void TestMean() {
		assertEquals(45.0, Day0_Mean_Median_Mode.getMean(new int[] { 10, 20, 30, 40, 50, 60, 70, 80 }), EPSILON);
		assertEquals(12.3, Day0_Mean_Median_Mode.getMean(new int[] { 11, 13, 13 }), EPSILON);
	}

	@Test
	public void TestMedian() {
		assertEquals(45.0, Day0_Mean_Median_Mode.getMedian(new int[] { 10, 20, 30, 40, 50, 60, 70, 80 }), EPSILON);
		assertEquals(40.0, Day0_Mean_Median_Mode.getMedian(new int[] { 10, 20, 30, 40, 50, 60, 70 }), EPSILON);
		assertEquals(53.0, Day0_Mean_Median_Mode.getMedian(new int[] { 72, 36, 42, 15, 98, 53, 70 }), EPSILON);
		assertEquals(61.5, Day0_Mean_Median_Mode.getMedian(new int[] { 72, 36, 42, 15, 98, 53, 70, 72 }), EPSILON);
		assertEquals(13, Day0_Mean_Median_Mode.getMedian(new int[] { 11, 13, 13 }), EPSILON);
	}

	@Test
	public void TestMode() {
		assertEquals(10, Day0_Mean_Median_Mode.getMode(new int[] { 10, 20, 30, 40, 50, 60, 70, 80 }));
		assertEquals(30, Day0_Mean_Median_Mode.getMode(new int[] { 10, 20, 30, 30, 50, 60, 70 }));
		assertEquals(15, Day0_Mean_Median_Mode.getMode(new int[] { 72, 36, 42, 15, 98, 53, 70 }));
		assertEquals(72, Day0_Mean_Median_Mode.getMode(new int[] { 72, 36, 42, 15, 98, 53, 70, 72 }));
		assertEquals(13, Day0_Mean_Median_Mode.getMode(new int[] { 11, 13, 13 }));
		assertEquals(13, Day0_Mean_Median_Mode.getMode(new int[] { 11, 13, 13, 15, 15 }));
		assertEquals(11, Day0_Mean_Median_Mode.getMode(new int[] { 11, 13, 13, 11 }));
		assertEquals(9, Day0_Mean_Median_Mode.getMode(new int[] { 11, 13, 9, 13, 11, 9, 5 }));
		assertEquals(13, Day0_Mean_Median_Mode.getMode(new int[] { 11, 13, 9, 13, 11, 9, 5, 13 }));
	}

	@Test
	public void TestWeightedMean() {
		int[] numbers = new int[] { 10, 20, 30, 30, 50, 60, 70 };
		int[] weights = new int[] { 5, 5, 5, 5, 5, 5, 5 };
		assertEquals(38.6, Day0_Weighted_Mean.getWeightedMean(numbers, weights), EPSILON);

		numbers = new int[] { 10, 40, 30, 50, 20 };
		weights = new int[] { 1, 2, 3, 4, 5 };
		assertEquals(32.0, Day0_Weighted_Mean.getWeightedMean(numbers, weights), EPSILON);

		assertEquals(0.0, Day0_Weighted_Mean.getWeightedMean(new int[] {}, new int[] {}), EPSILON);
	}

	@Test
	public void TestStandardDeviation() {
		int[] numbers = new int[] { 10, 40, 30, 50, 20 };
		assertEquals(14.1, Day1_Standard_Deviation.getStandardDeviationBigDecimal(numbers), EPSILON);
		assertEquals(14.1, Day1_Standard_Deviation.getStandardDeviationDouble(numbers), EPSILON);
		assertEquals(14.1, Day1_Standard_Deviation.getStandardDeviationBruteForce(numbers), EPSILON);
		assertEquals(14.1, Day1_Standard_Deviation.getStandardDeviation(numbers), EPSILON);

		int N = 100000;
		numbers = new int[100];
		for (int i = 0; i < 100; i++) {
			numbers[i] = N - i;
		}

		System.out.println(Arrays.toString(numbers));
		System.out.println(Day1_Standard_Deviation.getStandardDeviationBigDecimal(numbers));
		System.out.println(Day1_Standard_Deviation.getStandardDeviationDouble(numbers));

		// WOW. This breaks it.
		assertEquals(Double.NaN, Day1_Standard_Deviation.getStandardDeviationBigDecimal(numbers), EPSILON);
		assertEquals(Double.NaN, Day1_Standard_Deviation.getStandardDeviationDouble(numbers), EPSILON);
		assertEquals(28.9, Day1_Standard_Deviation.getStandardDeviationBruteForce(numbers), EPSILON);
		assertEquals(28.9, Day1_Standard_Deviation.getStandardDeviation(numbers), EPSILON);
	}

	@Test
	public void TestQuartiles() {
		int[] numbers = new int[] { 3, 7, 8, 5, 12, 14, 21, 13, 18 };
		// 3, 5, 7, 8, |12| 13, 14, 18, 21
		assertArrayEquals(new int[] { 6, 12, 16 }, Day1_Quartiles.getQuartiles(numbers));

		numbers = new int[] { 5, 10, 40, 30, 50, 20, 70 };
		assertArrayEquals(new int[] { 10, 30, 50 }, Day1_Quartiles.getQuartiles(numbers));

		numbers = new int[] { 1, 2, 3 };
		assertArrayEquals(new int[] { 1, 2, 3 }, Day1_Quartiles.getQuartiles(numbers));

		numbers = new int[] { 3, 9, 10, 13, 19 };
		assertArrayEquals(new int[] { 6, 10, 16 }, Day1_Quartiles.getQuartiles(numbers));

		numbers = new int[] { 10, 20, 30, 40, 50, 60, 70, 80 };
		assertArrayEquals(new int[] { 25, 45, 65 }, Day1_Quartiles.getQuartiles(numbers));
	}

}
