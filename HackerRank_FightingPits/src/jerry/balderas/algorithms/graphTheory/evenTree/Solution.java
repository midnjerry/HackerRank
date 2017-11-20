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

		System.out.println(getMaxCuts(nodes));

		in.close();

	}

	private static int getMaxCuts(Node[] nodes) {
		int result = 0;
		countTreeSize(nodes[0]);
		return result;
	}

	public static int countTreeSize(Node node) {
		int sum = 1;
		
		for (int i = 0; i < node.getChildren().size(); i++){
			sum += countTreeSize(node.getChildren().get(i));
		}
		
		return sum;
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
	private ArrayList<Node> child = new ArrayList<Node>();
	private int mID;

	public Node(int i) {
		mID = i;
	}

	public void addChild(Node node) {
		child.add(node);
	}

	public ArrayList<Node> getChildren() {
		return child;
	}

	public int getID() {
		return mID;
	}
}
