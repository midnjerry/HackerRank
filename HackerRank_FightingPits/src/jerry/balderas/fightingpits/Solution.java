package jerry.balderas.fightingpits;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

	// private HashMap<Integer, Team> mTeams;
	private Team[] mTeamArray;

	public Solution(int numOfTeams) {
		mTeamArray = new Team[numOfTeams + 1];

		// mTeams = new HashMap<Integer, Team>();
		// for (int i = 0; i <= numOfTeams; i++) {
		// mTeams.put(i, new Team());
		// }
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		Solution sol = new Solution(k);

		for (int i = 0; i < n; i++) {
			int str = in.nextInt();
			int team = in.nextInt();
			sol.addPlayerToTeam(str, team);
		}

		for (int i = 0; i < q; i++) {
			int query = in.nextInt();

			if (query == 1) {
				sol.addPlayerToTeam(in.nextInt(), in.nextInt());
			} else {
				System.out.println(sol.seeWhoWins(in.nextInt(), in.nextInt()));
			}
		}
		in.close();
	}

	public int seeWhoWins(int teamA, int teamB) {
		// Team A = mTeams.get(teamA);
		// Team B = mTeams.get(teamB);
		Team A = mTeamArray[teamA];
		Team B = mTeamArray[teamB];

		if (A.simulateFight(B) == A) {
			return teamA;
		} else {
			return teamB;
		}

	}

	public void addPlayerToTeam(int str, int team) {
		Team t = mTeamArray[team];

		// Team t = mTeams.get(team);
		if (t == null) {
			t = new Team();
			// mTeams.put(team, t);
			mTeamArray[team] = t;
		}
		t.addPlayer(str);
	}

	public Team getTeam(int i) {
		// return mTeams.get(i);
		return mTeamArray[i];
	}

}

class Team {
	private ArrayList<Integer> players = new ArrayList<Integer>();
	private int mTotalStr = 0;
	private boolean mSorted = false;
	private static Comparator<? super Integer> comparator = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	};

	public Team() {

	}

	void addPlayer(int str) {
		//players.add(str);
		//mSorted = false;

		if (players.size() == 0 || str <= players.get(players.size() - 1)) {
			players.add(str);
		} else if (str >= players.get(0)) {
			players.add(0, str);
		} else {
			System.out.print("Algo");
			int index = players.size() / 2;
			int size = players.size() / 2;
			while (!(str <= players.get(index - 1) && str >= players.get(index))) {
				size /= 2;
				if (str > players.get(index)) {
					index -= size;
				} else {
					index += size;
				}
			}
			players.add(index, str);

		}

		mTotalStr += str;
	}

	public int getPlayer(int index) {
		return players.get(index);
	}

	public int size() {
		return players.size();
	}

	public int totalStrength() {
		return mTotalStr;
	}

	public Team simulateFight(Team teamB) {
		int playerA = 0;
		int playerB = 0;

		int teamTotalA = this.totalStrength();
		int teamTotalB = teamB.totalStrength();

		//sort();
		//teamB.sort();

		boolean isTurnTeamA = true;
		while (true) {
			if (isTurnTeamA) {
				if (teamTotalA >= teamTotalB) {
					return this;
				}
				int oldIndex = playerB;
				playerB += getPlayer(playerA);
				if (playerB >= teamB.size()) {
					return this;
				}
				for (int i = oldIndex; i < playerB; i++) {
					teamTotalB -= teamB.getPlayer(i);
				}
			} else {
				if (teamTotalB >= teamTotalA) {
					return teamB;
				}
				int oldIndex = playerA;
				playerA += teamB.getPlayer(playerB);
				if (playerA >= this.size()) {
					return teamB;
				}
				for (int i = oldIndex; i < playerA; i++) {
					teamTotalA -= this.getPlayer(i);
				}
			}
			isTurnTeamA = !isTurnTeamA;
		}
	}

	private void sort() {
		if (!mSorted) {
			players.sort(comparator);
			mSorted = true;
		}

	}
}

class Team2 {
	private ArrayList<Integer> players = new ArrayList<Integer>();
	private int mTotalStr = 0;
	private boolean mSorted = false;
	private static Comparator<? super Integer> comparator = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	};

	public Team2() {

	}

	void addPlayer(int str) {
		players.add(str);
		mSorted = false;

		/*
		 * if (players.size() == 0 || str <= players.get(players.size() - 1)) {
		 * players.add(str); } else if (str >= players.get(0)) { players.add(0,
		 * str); } else { System.out.print("Algo"); int index = players.size() /
		 * 2; int size = players.size() / 2; while (!(str <=
		 * players.get(index-1) && str >= players.get(index))) { size /= 2; if
		 * (str > players.get(index)) { index -= size; } else { index += size; }
		 * } players.add(index, str);
		 * 
		 * }
		 */

		mTotalStr += str;
	}

	public int getPlayer(int index) {
		return players.get(index);
	}

	public int size() {
		return players.size();
	}

	public int totalStrength() {
		return mTotalStr;
	}

	public Team2 simulateFight(Team2 teamB) {
		int playerA = 0;
		int playerB = 0;

		int teamTotalA = this.totalStrength();
		int teamTotalB = teamB.totalStrength();

		sort();
		teamB.sort();

		boolean isTurnTeamA = true;
		while (true) {
			if (isTurnTeamA) {
				if (teamTotalA >= teamTotalB) {
					return this;
				}
				int oldIndex = playerB;
				playerB += getPlayer(playerA);
				if (playerB >= teamB.size()) {
					return this;
				}
				for (int i = oldIndex; i < playerB; i++) {
					teamTotalB -= teamB.getPlayer(i);
				}
			} else {
				if (teamTotalB >= teamTotalA) {
					return teamB;
				}
				int oldIndex = playerA;
				playerA += teamB.getPlayer(playerB);
				if (playerA >= this.size()) {
					return teamB;
				}
				for (int i = oldIndex; i < playerA; i++) {
					teamTotalA -= this.getPlayer(i);
				}
			}
			isTurnTeamA = !isTurnTeamA;
		}
	}

	private void sort() {
		if (!mSorted) {
			players.sort(comparator);
			mSorted = true;
		}

	}
}
