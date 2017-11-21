package jerry.balderas.algorithms.greedy.fightingPits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
	static int binarySearch(List<Integer> team, int val) {
		int lo = 0;
		int hi = team.size();
		int mid;
		while (lo < hi) {
			mid = (lo + hi) / 2;
			if (team.get(mid) == val)
				return mid;
			if (team.get(mid) > val)
				hi = mid;
			else
				lo = mid + 1;
		}
		return lo;
	}

	static int find_winner(int x, int y, List<Integer>[] teams, long x_sum, long y_sum) {
		List<Integer> X = teams[x];
		List<Integer> Y = teams[y];
		int x_count = X.size() - 1;
		int y_count = Y.size()  - 1;
		boolean chance = true;
		while (true) {
			if (chance) {
				if (x_sum >= y_sum)
					return x;
				y_count -= X.get(x_count);
				if (y_count < 0)
					return x;
				for (int i = y_count + 1; i <= y_count + X.get(x_count); i++) {
					y_sum -= Y.get(i);
				}
			} else {
				if (y_sum >= x_sum)
					return y;
				x_count -= Y.get(y_count);
				if (x_count < 0)
					return y;
				for (int i = x_count + 1; i <= x_count + Y.get(y_count); i++) {
					x_sum -= X.get(i);
				}
			}

			chance = !chance;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();

		List<Integer>[] teams = new List[k + 1];
		for (int i = 1; i <= k; i++) {
			teams[i] = new ArrayList<Integer>();
		}

		int[] sums = new int[k + 1];
		Arrays.fill(sums, 0);

		int s, t;
		for (int i = 0; i < n; i++) {
			s = in.nextInt();
			t = in.nextInt();
			teams[t].add(s);
			sums[t] += s;
		}

		for (int i = 1; i <= k; i++) {
			Collections.sort(teams[i]);
		}

		for (int i = 1; i <= q; i++) {
			int x, y;
			t = in.nextInt();
			x = in.nextInt();
			y = in.nextInt();
			if (t == 1) {
				teams[y].add(binarySearch(teams[y], x), x);
				sums[y] += x;
			} else {
				System.out.println(find_winner(x, y, teams, sums[x], sums[y]));
			}
		}
		in.close();
	}

	
}