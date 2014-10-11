package headfirst.constructor;

public class Subclass extends Superclass {
	String name;
	int height;
	
	final static String defaultName = "defaultName";
	final static int defaultHeight = 10;

	public Subclass() {
		this(defaultName, defaultHeight);
	}
	public Subclass(String name) {
		this(name, defaultHeight);
	}
	public Subclass(int height) {
		this(defaultName, height);
	}
	public Subclass(String name, int height) {
		super(name, height);
		this.name = name;
		this.height = height;
	}
	public Subclass(Object o) {
		this();
	}
	
	public static void main(String[] args) {
		Subclass s = new Subclass();
		System.out.println(s.superclassname);
		System.out.println(s.superclassheight);
	}
}
