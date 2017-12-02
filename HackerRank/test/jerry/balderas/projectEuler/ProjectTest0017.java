package jerry.balderas.projectEuler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProjectTest0017 {

	long N = 1000000000000L;
	int T = 10;

	@Test
	public void SampleTests() {
		assertEquals("Zero", Project0017.dictateNumber(0));
		assertEquals("One Trillion", Project0017.dictateNumber(1000000000000L));
		assertEquals("Two", Project0017.dictateNumber(2));
		assertEquals("Ten", Project0017.dictateNumber(10));
		assertEquals("Seventeen", Project0017.dictateNumber(17));
		assertEquals("Twenty One", Project0017.dictateNumber(21));
		assertEquals("Thirty Two", Project0017.dictateNumber(32));
		assertEquals("Forty Three", Project0017.dictateNumber(43));
		assertEquals("Fifty Four", Project0017.dictateNumber(54));
		assertEquals("Sixty Five", Project0017.dictateNumber(65));
		assertEquals("Seventy Six", Project0017.dictateNumber(76));
		assertEquals("Eighty Seven", Project0017.dictateNumber(87));
		assertEquals("Ninety Eight", Project0017.dictateNumber(98));
		assertEquals("Twenty", Project0017.dictateNumber(20));
		assertEquals("Thirty", Project0017.dictateNumber(30));
		assertEquals("Forty", Project0017.dictateNumber(40));
		assertEquals("Fifty", Project0017.dictateNumber(50));
		assertEquals("Sixty", Project0017.dictateNumber(60));
		assertEquals("Seventy", Project0017.dictateNumber(70));
		assertEquals("Eighty", Project0017.dictateNumber(80));
		assertEquals("Ninety", Project0017.dictateNumber(90));
		assertEquals("Ninety Nine", Project0017.dictateNumber(99));
		assertEquals("One Hundred", Project0017.dictateNumber(100));
		assertEquals("One Hundred One", Project0017.dictateNumber(101));
		assertEquals("Two Hundred Seventeen", Project0017.dictateNumber(217));
		assertEquals("Three Hundred Twenty Four", Project0017.dictateNumber(324));
		assertEquals("One Hundred Thousand One", Project0017.dictateNumber(100001));
		assertEquals("One Million One", Project0017.dictateNumber(1000001));

		assertEquals(
				"One Hundred Four Billion Three Hundred Eighty Two Million Four Hundred Twenty Six Thousand One Hundred Twelve",
				Project0017.dictateNumber(104382426112L));
	}

}
