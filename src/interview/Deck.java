package interview;

import java.util.Date;

public class Deck {
	
	Date date;
	
	Deck() {
		int year = randBetween(1800, 2010);
		this.date = new Date();
		this.date.setYear(year);
	}

	Date getDate() {
		return this.date;
	}
	
	public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }

}
