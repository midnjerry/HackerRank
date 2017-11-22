package jerry.balderas.algorithms.graphTheory.evenTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		Node[] nodes = initialize(n);

		for (int a0 = 0; a0 < m; a0++) {
			int u = in.nextInt();
			int v = in.nextInt();
			addChild(nodes, u, v);
		}

		System.out.println(countEdgesToCut(nodes[1], n));

		in.close();

	}

	public static int countEdgesToCut(Node node, int originalSize) {
		int count = 0;

		for (Node neighbor : node.getChildren()) {
			count += countEdgesToCut(neighbor, originalSize);
		}

		if (node.size() < originalSize && node.size() % 2 == 0) {
			count++;
		}

		return count;
	}

	public static void addChild(Node[] nodes, int child, int parent) {
		nodes[parent].addChild(nodes[child]);
	}

	public static Node[] initialize(int n) {
		Node[] nodes = new Node[n + 1];
		for (int i = 1; i <= n; i++) {
			nodes[i] = new Node(i);
		}
		return nodes;
	}


}

class Node {
	private ArrayList<Node> children = new ArrayList<Node>();
	private int mID;

	public Node(int i) {
		mID = i;
	}

	public int size() {
		int size = 1;

		for (Node child : children) {
			size += child.size();
		}

		return size;
	}

	public void addChild(Node node) {
		children.add(node);
	}

	public ArrayList<Node> getChildren() {
		return children;
	}

	public int getID() {
		return mID;
	}
}
