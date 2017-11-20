package jerry.balderas.algorithms.graphTheory.roadsAndLibraries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Node {
	int id;
	int cost;
	ArrayList<Node> neighbors = new ArrayList<Node>();

	Node(int id) {
		this.id = id;
		cost = 0;
	}

}

public class Solution {

	public static long getCost(int numCities, HashMap<Integer, Node> nodes, long costLibrary, long costRoad) {
		long minCost = 0;

		HashSet<Node> visited = new HashSet<Node>();

		for (Node node : nodes.values()) {

			if (node.neighbors.size() == 0) {
				// you must build a library
				node.cost += costLibrary;
				minCost += costLibrary;
				visited.add(node);
			} else if (!visited.contains(node)) {
				int current = visited.size();
				getNetwork(node, visited);
				int diff = visited.size() - current;
				minCost += Math.min(costLibrary + (diff - 1) * costRoad, costLibrary * diff);
			}

		}
		return minCost;
	}

	private static int getNetwork(Node node, HashSet<Node> visited) {
		if (visited.contains(node)) {
			return 1;
		}

		visited.add(node);

		int sum = 0;

		for (Node neighbor : node.neighbors) {
			sum += getNetwork(neighbor, visited);
			visited.add(neighbor);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();

		for (int a0 = 0; a0 < q; a0++) {
			HashMap<Integer, Node> nodes = new HashMap<Integer, Node>();
			int n = in.nextInt();
			for (int i = 1; i <= n; i++) {
				nodes.put(i, new Node(i));
			}

			int m = in.nextInt();
			long costLibrary = in.nextLong();
			long costRoad = in.nextLong();
			for (int a1 = 0; a1 < m; a1++) {
				int city_1 = in.nextInt();
				int city_2 = in.nextInt();

				Node cityA = nodes.get(city_1);
				Node cityB = nodes.get(city_2);
				cityA.neighbors.add(cityB);
				cityB.neighbors.add(cityA);
			}
			System.out.println(getCost(n, nodes, costLibrary, costRoad));
		}

	}
}