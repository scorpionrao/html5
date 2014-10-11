package headfirst.collectionsandgenerics;

import java.util.TreeSet;

public class TestTree {
	public static void main(String[] args) {
		new TestTree().go();
	}
	
	public void go() {
		Book b1 = new Book("How Cats Work");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("Finding Emo");
		
		TreeSet<Book> tree = new TreeSet<Book>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);
		
		TreeSet<Book> tree1 = new TreeSet<Book>(new BookComparator());
		tree1.add(b1);
		tree1.add(b2);
		tree1.add(b3);
		System.out.println(tree1);
	}
}
