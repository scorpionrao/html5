package headfirstdp.chapter7;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumerationAdapter implements Enumeration {

	Iterator iterator;
	
	public IteratorEnumerationAdapter(Iterator iterator) {
		this.iterator = iterator;
	}
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	public Object nextElement() {
		return iterator.next();
	}

}
