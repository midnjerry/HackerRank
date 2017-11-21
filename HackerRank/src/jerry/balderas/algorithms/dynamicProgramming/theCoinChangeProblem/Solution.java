package jerry.balderas.algorithms.dynamicProgramming.theCoinChangeProblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	
	
	static long getWays(long n, long[] c, HashMap<Long, long[]> cache) {
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}

		if (c.length > 0){
			long key = c[0];
			long[] recordedValues = cache.get(key);
			//System.out.println("n:" + n + " key: " + key + " " + recordedValues);
			if (recordedValues[(int) n] > 0){
				return recordedValues[(int) n];
			}
		}

		long sum = 0;
		for (int i = 0; i < c.length; i++) {
			//System.out.print(n + ":" + c[i] + "|" + (n - c[i]));
			long target = n - c[i];

			long[] subc = new long[c.length - (i)];
			for (int j = i, k = 0; j < c.length; j++, k++) {
				subc[k] = c[j];
			}
			//System.out.println(Arrays.toString(subc));
			long result = getWays(target, subc, cache);
			if (result > 0) {
				long[] values = cache.get(subc[0]);
				values[(int)target] = result;				
			}
			sum += result;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long[] c = new long[m];
		for (int c_i = 0; c_i < m; c_i++) {
			c[c_i] = in.nextLong();
		}
		// Print the number of ways of making change for 'n' units using coins
		// having the values given by 'c'
		HashMap<Long, long[]> cache = new HashMap<Long, long[]>();
		for (int i = 0; i < m; i++){
			long[] values = new long[n+1];
			Arrays.fill(values, 0);
			cache.put(c[i], values);
		}
		
		long ways = getWays(n, c, cache);
		System.out.println(ways);
	}
}