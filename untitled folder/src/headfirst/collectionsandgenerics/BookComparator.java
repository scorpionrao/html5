package headfirst.collectionsandgenerics;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
	public int compare(Book one, Book two) {
		return (one.title.compareTo(two.title));
	}
}
