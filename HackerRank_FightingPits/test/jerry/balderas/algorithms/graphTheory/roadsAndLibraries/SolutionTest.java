package jerry.balderas.algorithms.graphTheory.roadsAndLibraries;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setup() {
	}

	private HashMap<Integer, Node> prepareNodes(int n, int... numbers) {
		HashMap<Integer, Node> result = new HashMap<Integer, Node>();
		for (int i = 1; i <= n; i++) {
			result.put(i, new Node(i));
		}

		for (int i = 0; i < numbers.length; i += 2) {
			Node city1 = result.get(numbers[i]);
			Node city2 = result.get(numbers[i + 1]);
			city1.neighbors.add(city2);
			city2.neighbors.add(city1);
		}
		return result;

	}

	@Test
	public void testSample0() {
		HashMap<Integer, Node> nodes = prepareNodes(3, 1, 2, 3, 1, 2, 3);
		assertEquals(4, Solution.getCost(3, nodes, 2, 1));

		nodes = prepareNodes(6, 1, 3, 3, 4, 2, 4, 1, 2, 2, 3, 5, 6);
		assertEquals(12, Solution.getCost(6, nodes, 2, 5));
	}

}
