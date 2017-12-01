package jerry.balderas.projectEuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Project0013 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		ArrayList<BigInteger> numberList = new ArrayList<BigInteger>();

		for (int i = 0; i < n; i++) {
			BigInteger num = in.nextBigInteger();
			numberList.add(num);
		}

		System.out.println(getFirst10DigitsOfSum(numberList));
		in.close();
	}

	static String getFirst10DigitsOfSum(ArrayList<BigInteger> numberList) {
		BigInteger sum = BigInteger.ZERO;
		for (BigInteger num : numberList) {
			sum = sum.add(num);
		}
		return sum.toString().substring(0, 10);
	}
}
