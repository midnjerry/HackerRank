package jerry.balderas.algorithms.greedy.fightingPits;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import jerry.balderas.algorithms.greedy.fightingPits.Solution;
import jerry.balderas.algorithms.greedy.fightingPits.Team;

public class TeamTest {

	private Team teamA;
	private Team teamB;

	@Before
	public void setup() {
		teamA = new Team();
		teamB = new Team();

	}

	@Test
	public void SampleTest0(){
		teamA.addPlayer(1);
		teamA.addPlayer(2);
		teamA.addPlayer(1);
		teamB.addPlayer(1);
		teamB.addPlayer(1);
		teamB.addPlayer(2);
		teamB.addPlayer(1);
		assertEquals(teamA, teamA.simulateFight(teamB));
		assertEquals(teamB, teamB.simulateFight(teamA));
		teamA.addPlayer(2);
		teamA.addPlayer(2);
		assertEquals(teamA, teamA.simulateFight(teamB));
		assertEquals(teamA, teamB.simulateFight(teamA));
	}
	
	@Test
	public void addPlayerToTeam() {
		teamA.addPlayer(5);
		assertEquals(1, teamA.size());
		assertEquals(5, teamA.totalStrength());
		assertEquals(5, teamA.getPlayer(0));
	}

	@Test
	public void addingPlayersSortsThem() {
		teamA.addPlayer(5);
		teamA.addPlayer(1);
		teamA.addPlayer(3);
		teamA.addPlayer(9);
		teamA.addPlayer(3);
		teamA.addPlayer(7);
		teamA.addPlayer(4);

		teamA.simulateFight(teamA);
		
		assertEquals(7, teamA.size());
		assertEquals(9, teamA.getPlayer(0));
		assertEquals(7, teamA.getPlayer(1));
		assertEquals(5, teamA.getPlayer(2));
		assertEquals(4, teamA.getPlayer(3));
		assertEquals(3, teamA.getPlayer(4));
		assertEquals(3, teamA.getPlayer(5));
		assertEquals(1, teamA.getPlayer(6));
	}

	@Test
	public void TeamBBeatsTeamA() {
		teamA.addPlayer(1);
		teamB.addPlayer(1);
		teamB.addPlayer(1);
		assertEquals(teamB, teamA.simulateFight(teamB));
	}

	@Test
	public void TeamABeatsTeamBInTwoTurns() {
		teamA.addPlayer(4);
		teamA.addPlayer(1);
		teamB.addPlayer(1);
		teamB.addPlayer(1);
		teamB.addPlayer(1);
		teamB.addPlayer(1);
		teamB.addPlayer(1);
		assertEquals(teamA, teamA.simulateFight(teamB));
	}

	@Test
	public void WorstCaseScenarioMaxTeams() {
		long time1 = System.nanoTime();
		int k = 200000;
		Solution sol = new Solution(k);
		for (int i = 1; i <= k; i++) {
			sol.addPlayerToTeam(i, i);
		}

		for (int i = 1; i <= k-1; i++) {
			 sol.seeWhoWins(i, i+1);
		}

		long time2 = System.nanoTime();
		System.out.println("Solution Max Teams Time elapsed (ms)" + (time2 - time1) / 1000000.0);
	}

	@Test
	public void WorstCaseScenarioBigTeams() {
		long time1 = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			teamA.addPlayer(1);
			teamB.addPlayer(1);
		}
		assertEquals(teamA, teamA.simulateFight(teamB));
		long time2 = System.nanoTime();
		System.out.println("Solution WorstCase Big Teams Time elapsed " + (time2 - time1) / 1000000.0);
	}
	
	@Test
	public void OneGuyLosesToABunch() {
		long time1 = System.nanoTime();
		teamA.addPlayer(150000);
		for (int i = 0; i < 200000; i++) {
			teamB.addPlayer(1);
		}
		assertEquals(teamB, teamA.simulateFight(teamB));
		long time2 = System.nanoTime();
		System.out.println("One Guy Loses To a Bunch elapsed " + (time2 - time1) / 1000000.0);
	}
}
