package headfirstdp.chapter9;

import java.util.Iterator;

public class DinerMenu {
	
	static final int MAX_ITEMS = 6;
	int numOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}
	
	public DinerMenu() {
		// TODO Auto-generated constructor stub
	}

	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}

}
