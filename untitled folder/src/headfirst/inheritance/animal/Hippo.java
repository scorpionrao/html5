package headfirst.inheritance.animal;

public class Hippo extends Animal {
	protected Hippo roam(Animal hippoRoam) {
		System.out.println("Roam from Hippo");
		return this;
	}
	
	public Hippo() {}
	
	public Hippo(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		System.out.println(new Hippo("Buffy").getName());
	}
}