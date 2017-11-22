package jerry.balderas.algorithms.greedy.sherlockAndTheBeast;

import java.util.Scanner;

public class Solution {

	public static String produceString(int fives, int threes) {
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < fives; i++) {
			result.append("555");
		}

		for (int i = 0; i < threes; i++) {
			result.append("33333");
		}

		return result.toString();
	}

	public static String getDecentNumber(int n) {
		String result = "-1";

		int lastLegalFivePosition = n;
		while ((lastLegalFivePosition % 3) != 0) {
			lastLegalFivePosition--;
		}

		for (int fives = lastLegalFivePosition; fives >= 0; fives -= 3) {
			int spaceleft = n - fives;
			if ((spaceleft % 5) == 0) {
				result = produceString(fives / 3, spaceleft / 5);
				return result;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for (int i = 0; i < testCases; i++) {
			System.out.println(getDecentNumber(in.nextInt()));
		}
	}
}