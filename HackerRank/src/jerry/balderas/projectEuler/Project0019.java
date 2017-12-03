package jerry.balderas.projectEuler;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Project0019 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int trials = in.nextInt();

		for (int t = 0; t < trials; t++) {
			long y1 = in.nextLong();
			int m1 = in.nextInt();
			int d1 = in.nextInt();
			long y2 = in.nextLong();
			int m2 = in.nextInt();
			int d2 = in.nextInt();

			System.out.println(getNumFirstOfTheMonthSundays(y1, m1, d1, y2, m2, d2));
		}
		in.close();
	}

	static int getNumFirstOfTheMonthSundays(long y1, int m1, int d1, long y2, int m2, int d2) {
		// Using Zeller's Congruence
		int count = 0;

		if (d1 > 1)
			m1++;

		for (long year = y1; year <= y2; year++) {
			int startMonth = (year == y1) ? m1 : 1;
			int endMonth = (year == y2) ? m2 : 12;

			for (int month = startMonth; month <= endMonth; month++) {
				int m = (month <= 2) ? month + 12 : month;
				long y = (month <= 2) ? year - 1 : year;

				long day = (1 + (13 * (m + 1)) / 5 + y + y / 4 - y / 100 + y / 400) % 7;

				if (day == 1) {
					count++;
				}
			}
		}
		return count;
	}

	static int getNumFirstOfTheMonthSundays2(long y1, int m1, int d1, long y2, int m2, int d2) {

		int count = 0;
		if (y2 > LocalDate.MAX.getYear()) {
			long diff = (((y2 - LocalDate.MAX.getYear()) / 400) + 1) * 400;
			y2 -= diff;
			y1 -= diff;
		}

		int year1 = (int) y1;
		int year2 = (int) y2;

		LocalDate startDate = LocalDate.of(year1, m1, d1);
		LocalDate endDate = LocalDate.of(year2, m2, d2);

		while (startDate.isBefore(endDate) || startDate.isEqual(endDate)) {
			if (startDate.getDayOfWeek() == DayOfWeek.SUNDAY && startDate.getDayOfMonth() == 1) {
				count++;
			}
			startDate = startDate.plusDays(1);
		}

		return count;
	}
}
