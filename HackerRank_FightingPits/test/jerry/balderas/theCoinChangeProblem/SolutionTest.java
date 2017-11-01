package jerry.balderas.theCoinChangeProblem;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.HashMap;
import org.junit.Test;

public class SolutionTest {

	private void verify(long result, long n, long... coins) {
		HashMap<Long, long[]> cache = new HashMap<Long,long[]>();
		for (int i = 0; i < coins.length; i++){
			long[] values = new long[(int) (n+1)];
			Arrays.fill(values, 0);
			cache.put(coins[i], values);
		}
		assertEquals(result, Solution.getWays(n, coins, cache));
	}

	@Test
	public void testSolution() {
		verify(1, 2, 1);
		verify(2, 3, 1, 2);
		verify(5, 10, 2, 5, 3, 6);
		verify(4, 4, 1, 2, 3);
	}

}
