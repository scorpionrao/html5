package headfirst.constructor;

public final class nonstaticfinal {
	final int size = 3;
	final int whuffie;
	
	nonstaticfinal() {
		whuffie = 42;
	}
	nonstaticfinal(int i) {
		whuffie = i;
	}
	void doStuff(final int x) {
		// x = 40;
	}
	void doMore() {
		final int z = 7;
	}
	final void calcWhuffie() {
		
	}
}
