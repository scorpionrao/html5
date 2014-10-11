package headfirst.constructor;

public class Autoboxing {
	Integer i;
	int j;
	public void go() {
		j = i;
		System.out.println("j = " + j);
		System.out.println("i = " + i);
	}
	void takeNumber(Integer i) {}
	int giveNumber() {return new Integer(7);}
	void print(boolean b) {}
	public static void main(String[] args) {
//		new Autoboxing().go();
//		new Autoboxing().takeNumber(3);
//		new Autoboxing().print(new Boolean("true"));
//		System.out.println(Integer.parseInt("two"));
		double d = 42.5;
		String doubleString1 = ""+d;
		String doubleString = Double.toString(d);
		System.out.println(String.format("%,d", 1000000));
		System.out.println(String.format("%d", 1000000));
	}
}
