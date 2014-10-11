package html5;

import java.util.Calendar;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date1 = new Date();
		long time1 = date1.getTime();
		System.out.println("Now = " + time1);
		long DAY_IN_MS = 1000 * 60 * 60 * 24;
		System.out.println("2 days ago = " + (time1 - DAY_IN_MS));
		
		Calendar cal = Calendar.getInstance();
		System.out.println("Calendar - Now - " + cal.getTime());
		System.out.println("Calendar - 2 days ago - " + (cal.getTime().getTime() - DAY_IN_MS));
	}

}
