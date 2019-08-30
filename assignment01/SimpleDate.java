package assignment01;

import java.time.LocalDate;

public class SimpleDate {
	private int year;
	private int month;
	private int day;
	private static LocalDate SimpleDate;

	public static SimpleDate of(int yr, int m, int d) {
		SimpleDate returnValue = new SimpleDate();
		returnValue.year = yr;
		returnValue.month = m;
		returnValue.day = d;
		
		SimpleDate = LocalDate.of(yr, m, d);
				
		return returnValue;
	}
	public boolean before(SimpleDate other) {
		return SimpleDate.isBefore(LocalDate.of(year, month, day));
	}
}

