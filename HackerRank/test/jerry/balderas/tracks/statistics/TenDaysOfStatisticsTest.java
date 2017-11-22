package jerry.balderas.tracks.statistics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TenDaysOfStatisticsTest {

	private final double EPSILON = 0.1;

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
	}
}
