package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;
import java.util.ArrayList;

import org.junit.Test;


public class ProjectTest0013 {

	@Test
	void SampleTests() {
		ArrayList<BigInteger> numberList = new ArrayList<BigInteger>();

		numberList.add(new BigInteger("37107287533902102798797998220837590246510135740250"));
		numberList.add(new BigInteger("46376937677490009712648124896970078050417018260538"));
		numberList.add(new BigInteger("74324986199524741059474233309513058123726617309629"));
		numberList.add(new BigInteger("91942213363574161572522430563301811072406154908250"));
		numberList.add(new BigInteger("23067588207539346171171980310421047513778063246676"));

		assertEquals("2728190129", Project0013.getFirst10DigitsOfSum(numberList));
	}

}
