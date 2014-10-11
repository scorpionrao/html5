package interview;

import java.util.ArrayList;
import java.util.List;

public class SubList {

	public static void printDate(List<Deck> my_decks, String comment) {
		System.out.println(comment + ":");
		for(Deck d : my_decks)
			System.out.println(d.getDate().getYear());
	}

	public static void main(String[] args) throws InterruptedException {
		List<Deck> my_decks = new ArrayList<Deck>();
		List<Deck> another_decks = new ArrayList<Deck>();
		for (int i=0; i<4; i++) {
			Deck d = new Deck();
			my_decks.add(d);
			another_decks.add(d);
		}
		printDate(my_decks, "my_decks");
		printDate(another_decks, "another_decks");
		
		List<Deck> subSet = new ArrayList(my_decks.subList(0,3));
		subSet.set(1, new Deck());
		
		printDate(subSet, "subSet");
		printDate(my_decks, "my_decks");
		printDate(another_decks, "another_decks");
		
		
//		my_decks.set(1, new Deck());
//		printDate(my_decks, "my_decks");
//		printDate(my_decks, "another_decks");
//		
//		List<Deck> subSet = my_decks.subList(0,3);
//		printDate(subSet, "subset");
//		
//		subSet.set(1, new Deck());
//		printDate(my_decks, "check for index 1");
		
	}

}
