package headfirst.inheritance.animal;

public class Canine extends Animal {
	protected Canine roam(Animal canineRoam) {
		System.out.println("Roam from Canine");
		return this;
	}
}