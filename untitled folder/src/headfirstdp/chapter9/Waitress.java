package headfirstdp.chapter9;

import java.util.Iterator;

public class Waitress {
	
	DinerMenu dinerMenu;
	
	public Waitress(DinerMenu dinerMenu) {
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator dinerIterator =
				dinerMenu.createIterator();
		
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(dinerIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}

}
