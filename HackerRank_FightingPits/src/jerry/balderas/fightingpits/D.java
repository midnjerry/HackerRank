package jerry.balderas.fightingpits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class D {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	static final int K = 500;

	int[] sz;
	List<Integer>[] teamsLst;
	int[][] teams;

	HashMap<Long, int[][]> map = new HashMap<>();

	int k;

	int go(int x, int y) {
		if (sz[x] < K || sz[y] < K) {

			boolean moveX = true;
			int ptrX = sz[x];
			int ptrY = sz[y];

			int[] teamX = teams[x];
			int[] teamY = teams[y];

			for (; ptrX > 0 && ptrY > 0; moveX = !moveX) {
				if (moveX) {
					ptrY -= teamX[ptrX - 1];
				} else {
					ptrX -= teamY[ptrY - 1];
				}
			}
			return ptrX > 0 ? x : y;
		}

		long ptr1 = (long) x * k + y;
		int[][] arrX = map.get(ptr1);
		if (arrX == null) {
			arrX = new int[2][teams[x].length + 1];
			Arrays.fill(arrX[1], teams[y].length + 1);
			map.put(ptr1, arrX);
		}

		long ptr2 = (long) y * k + x;
		int[][] arrY = map.get(ptr2);
		if (arrY == null) {
			arrY = new int[2][teams[y].length + 1];
			Arrays.fill(arrY[1], teams[x].length + 1);
			map.put(ptr2, arrY);
		}

		boolean moveX = true;
		int ptrX = sz[x];
		int ptrY = sz[y];

		int[] teamX = teams[x];
		int[] teamY = teams[y];

		int winner = -1;

		for (; ptrX > 0 && ptrY > 0; moveX = !moveX) {
			if (moveX) {

				if (ptrY <= arrX[0][ptrX]) {
					winner = x;
					break;
				} else if (ptrY >= arrX[1][ptrX]) {
					winner = y;
					break;
				} else {
					ptrY -= teamX[ptrX - 1];
				}
			} else {
				if (ptrX <= arrY[0][ptrY]) {
					winner = y;
					break;
				} else if (ptrX >= arrY[1][ptrY]) {
					winner = x;
					break;
				} else {
					ptrX -= teamY[ptrY - 1];
				}
			}
		}
		
		if (winner == -1) {
			winner = ptrX > 0 ? x : y;
		}
		
		int finalX = ptrX;
		int finalY = ptrY;
		
		moveX = true;
		ptrX = sz[x];
		ptrY = sz[y];
		
		for (; ptrX != finalX || ptrY != finalY; moveX = !moveX) {
			if (moveX) {
				if (winner == x) {
					arrX[0][ptrX] = ptrY;
				} else {
					arrX[1][ptrX] = ptrY;
				}
				ptrY -= teamX[ptrX - 1];
			} else {
				if (winner == y) {
					arrY[0][ptrY] = ptrX;
				} else {
					arrY[1][ptrY] = ptrX;
				}
				ptrX -= teamY[ptrY - 1];
			}
		}
		
		return winner;
	}

	void solve() throws IOException {
		int n = nextInt();
		k = nextInt();
		int q = nextInt();

		teamsLst = new List[k];
		for (int i = 0; i < k; i++) {
			teamsLst[i] = new ArrayList<>();
		}

		for (int i = 0; i < n; i++) {
			int str = nextInt();
			int team = nextInt() - 1;
			teamsLst[team].add(str);
		}

		sz = new int[k];

		for (int i = 0; i < k; i++) {
			Collections.sort(teamsLst[i]);
			sz[i] = teamsLst[i].size();
		}

		int[][] qs = new int[q][3];
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < 3; j++) {
				qs[i][j] = nextInt();
			}
			if (qs[i][0] == 1) {
				qs[i][2]--;
				teamsLst[qs[i][2]].add(qs[i][1]);
			} else {
				qs[i][1]--;
				qs[i][2]--;
			}
		}

		teams = new int[k][];
		for (int i = 0; i < k; i++) {
			teams[i] = new int[teamsLst[i].size()];
			for (int j = 0; j < teams[i].length; j++) {
				teams[i][j] = teamsLst[i].get(j);
			}
		}

		for (int i = 0; i < q; i++) {
			if (qs[i][0] == 1) {
				sz[qs[i][2]]++;
			} else {
				out.println(go(qs[i][1], qs[i][2]) + 1);
			}
		}
	}

	D() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new D();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}