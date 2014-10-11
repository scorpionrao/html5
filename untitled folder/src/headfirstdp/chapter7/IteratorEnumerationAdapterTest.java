package headfirstdp.chapter7;

import java.util.ArrayList;

public class IteratorEnumerationAdapterTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		
		IteratorEnumerationAdapter testAdapter = 
				new IteratorEnumerationAdapter(list.iterator());
		testAdapter.hasMoreElements();
		testAdapter.nextElement();
	}

}
