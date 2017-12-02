package jerry.balderas.projectEuler;

import java.util.Scanner;

public class Project0017 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			long n = in.nextLong();
			System.out.println(dictateNumber(n));
		}

		in.close();
	}

	public static String dictateNumber(long num) {
		String result = "";
		if (num == 1000000000000L) {
			return "One Trillion";
		}
		if (num == 0) {
			return "Zero";
		}

		long temp = num;
		for (int i = 3; i >= 0; i--) {
			long multiplier = (long) Math.pow(1000, i);
			if (temp >= multiplier) {
				int frontDigits = (int) (temp / multiplier);
				result += getUnderThousand(frontDigits);
				switch (i) {
				case (3):
					result += " Billion";
					break;
				case (2):
					result += " Million";
					break;
				case (1):
					result += " Thousand";
					break;
				}
				temp %= multiplier;
				if (temp == 0) {
					break;
				}
				result += " ";
			}
		}
		return result;
	}

	static String getUnderThousand(int number) {
		String result = "";
		if (number >= 100) {
			result = getUnderThousand(number / 100) + " Hundred";

			if (number % 100 != 0) {
				result += " " + getUnderThousand(number % 100);
			}
			return result;
		}
		switch (number) {
		case (0):
			result = "Zero";
			break;
		case (1):
			result = "One";
			break;
		case (2):
			result = "Two";
			break;
		case (3):
			result = "Three";
			break;
		case (4):
			result = "Four";
			break;
		case (5):
			result = "Five";
			break;
		case (6):
			result = "Six";
			break;
		case (7):
			result = "Seven";
			break;
		case (8):
			result = "Eight";
			break;
		case (9):
			result = "Nine";
			break;
		case (10):
			result = "Ten";
			break;
		case (11):
			result = "Eleven";
			break;
		case (12):
			result = "Twelve";
			break;
		case (13):
			result = "Thirteen";
			break;
		case (14):
			result = "Fourteen";
			break;
		case (15):
			result = "Fifteen";
			break;
		case (16):
			result = "Sixteen";
			break;
		case (17):
			result = "Seventeen";
			break;
		case (18):
			result = "Eighteen";
			break;
		case (19):
			result = "Nineteen";
			break;
		default:
			if (number >= 90) {
				result = "Ninety";
			} else if (number >= 80) {
				result = "Eighty";
			} else if (number >= 70) {
				result = "Seventy";
			} else if (number >= 60) {
				result = "Sixty";
			} else if (number >= 50) {
				result = "Fifty";
			} else if (number >= 40) {
				result = "Forty";
			} else if (number >= 30) {
				result = "Thirty";
			} else if (number >= 20) {
				result = "Twenty";
			}
			if (number % 10 != 0) {
				result += " " + getUnderThousand(number % 10);
			}

		}

		return result;
	}

}
