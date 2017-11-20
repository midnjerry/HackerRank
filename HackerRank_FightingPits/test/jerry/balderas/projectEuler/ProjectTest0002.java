package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest0002 {

	@Before
	public void setup() {

		int n = 1000;
		for (int i = 0; i <= n; i++) {
			BigInteger result = Project0002.getFib(i);
			if (result.compareTo(BigInteger.valueOf(40000000000000000L)) > 0) {
				System.out.println(i);
				break;
			}

		}
	}



	@Test
	public void testSample0() {
		assertEquals(10, Project0002.getEvenSum(10));
		assertEquals(44, Project0002.getEvenSum(100));
	}

}