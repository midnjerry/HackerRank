package jerry.balderas.algorithms.graphTheory.evenTree;

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
		System.out.println(Solution.countTreeSize(nodes[1]));
	}

}
