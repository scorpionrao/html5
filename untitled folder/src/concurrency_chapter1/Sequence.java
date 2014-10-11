package concurrency_chapter1;

import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class Sequence {
	private int value;
	public synchronized int getNext() {
		return value++;
	}
}
