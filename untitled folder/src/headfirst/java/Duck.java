package headfirst.java;

public class Duck extends Bird {
	public Duck() {
		System.out.println("Duck constructor");
	}
	public Duck(String string) {
		super(string);
		System.out.println(string + " from Duck");
	}
	
	public static void main(String[] args) {
		Duck duck = new Duck("Check");
		System.out.println(duck);
	}
}
