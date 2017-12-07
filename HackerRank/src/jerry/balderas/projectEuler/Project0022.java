package jerry.balderas.projectEuler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Project0022 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		String[] names = new String[n];
		for (int i = 0; i < n; i++) {
			names[i] = in.next();
		}

		Arrays.sort(names);
		HashMap<String, Integer> ranks = new HashMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			ranks.put(names[i], i + 1);
		}

		int q = in.nextInt();
		for (int j = 0; j < q; j++) {
			String name = in.next();
			System.out.println(getScoreFor(name, ranks));
		}
		in.close();
	}

	static int getScoreFor(String name, HashMap<String, Integer> ranks) {
		int sum = 0;
		for (int i = 0; i < name.length(); i++) {
			sum += name.toLowerCase().charAt(i) - 'a' + 1;
		}
		sum *= ranks.get(name);
		return sum;
	}

}
