package headfirst.collectionsandgenerics;

public class Book implements Comparable<Book> {
	String title;
	public Book(String t) {
		title = t;
	}

	public int compareTo(Book b) {
		return title.compareTo(b.title);
	}

}