package headfirst.constructor;

public class Superclass {
	String superclassname;
	int superclassheight;
	static int staticVariable;

	public Superclass(String name, int height) {
		this.superclassname = name;
		this.superclassheight = height;
	}
	
	public String nonStaticMethod() {
		return "";
	}
	
	public static void main(String[] args) {
		System.out.println("Inside Superclass");
		//System.out.println(superclassname);
	}

}
