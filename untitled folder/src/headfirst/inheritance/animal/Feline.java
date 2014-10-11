package headfirst.inheritance.animal;

public class Feline extends Animal {
	protected Feline roam(Animal felineRoam) {
		System.out.println("Roam from Feline");
		return this;
	}
}
