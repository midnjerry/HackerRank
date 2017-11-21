package jerry.balderas.dataStructures.arrays.arrayManipulation;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import jerry.balderas.dataStructures.arrays.arrayManipulation.Solution;

public class SolutionTest {

	@Before
	public void setup() {

	}

	private void verify(long[] result, long... numbers) {
		for (int i = 1; i <= numbers.length; i++) {
			assertEquals(numbers[i - 1], result[i]);
		}

	}

	private long[] getValues(int n, int[] num) {
		long[] result = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] += num[i] + result[i - 1];
		}
		return result;
	}
	
	@Test
	public void testSample0() {
		int n = 5;
		int[] num = new int[n + 1];
		Solution.addRange(n, num, 1, 2, 100);
		Solution.addRange(n, num, 2, 5, 100);
		Solution.addRange(n, num, 3, 4, 100);

		System.out.println(Arrays.toString(num));
		
		long[] result = getValues(n, num);
		verify(result, 100, 200, 200, 200, 100);
		assertEquals(200, Solution.getMaxSum(num));
	}
	
	@Test
	public void addRangeInsideOtherRange() {
		int n = 10;
		int[] num = new int[n + 1];
		Solution.addRange(n, num, 3, 8, 10);
		Solution.addRange(n, num, 4, 7, 10);
		Solution.addRange(n, num, 4, 5, 10);

		long[] result = getValues(n, num);
		verify(result, 0, 0, 10, 30, 30, 20, 20, 10, 0, 0);
		assertEquals(30, Solution.getMaxSum(num));
	}
	
	@Test
	public void addRangeOnTopOfOtherRange() {
		int n = 10;
		int[] num = new int[n + 1];
		Solution.addRange(n, num, 1, 10, 10);
		Solution.addRange(n, num, 9, 10, 10);
		Solution.addRange(n, num, 9, 10, 10);
		Solution.addRange(n, num, 8, 10, 10);
		long[] result = getValues(n, num);
		verify(result, 10, 10, 10, 10, 10, 10, 10, 20, 40, 40);
		assertEquals(40, Solution.getMaxSum(num));
	}
}
