package jerry.balderas.algorithms.graphTheory.evenTree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setup() {
	}

	private void printTree(Node node) {
		if (node.getChildren().size() == 0){
			System.out.println(node.getID());
		}
		
		for (int i = 0; i < node.getChildren().size(); i++) {
			System.out.print(node.getID() + "-");
			printTree(node.getChildren().get(i));			
		}

	}

	@Test
	public void testSample0() {
		Node[] nodes = Solution.initialize(10);
		Solution.addChild(nodes, 2, 1);
		Solution.addChild(nodes, 3, 1);
		Solution.addChild(nodes, 4, 3);
		Solution.addChild(nodes, 5, 2);
		Solution.addChild(nodes, 6, 1);
		Solution.addChild(nodes, 7, 2);
		Solution.addChild(nodes, 8, 6);
		Solution.addChild(nodes, 9, 8);
		Solution.addChild(nodes, 10, 8);
		assertEquals(2, Solution.countEdgesToCut(nodes[1], 10));
	}

	@Test
	public void testSample1() {
		Node[] nodes = Solution.initialize(20);
		Solution.addChild(nodes, 2, 1);
		Solution.addChild(nodes, 3, 1);
		Solution.addChild(nodes, 4, 3);
		Solution.addChild(nodes, 5, 2);
		Solution.addChild(nodes, 6, 1);
		Solution.addChild(nodes, 7, 2);
		Solution.addChild(nodes, 8, 6);
		Solution.addChild(nodes, 9, 8);
		Solution.addChild(nodes, 10, 8);
		Solution.addChild(nodes, 12, 11);
		Solution.addChild(nodes, 13, 11);
		Solution.addChild(nodes, 14, 13);
		Solution.addChild(nodes, 15, 12);
		Solution.addChild(nodes, 16, 11);
		Solution.addChild(nodes, 17, 12);
		Solution.addChild(nodes, 18, 16);
		Solution.addChild(nodes, 19, 18);
		Solution.addChild(nodes, 20, 18);
		Solution.addChild(nodes, 11, 1);
		assertEquals(5, Solution.countEdgesToCut(nodes[1], 20));
	}

}
