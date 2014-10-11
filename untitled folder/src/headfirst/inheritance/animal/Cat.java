package headfirst.inheritance.animal;

public class Cat extends Canine implements Pet {
	public Canine makeNoise(Animal catNoise) {
		System.out.println("Noise from Cat");
		return this;
	}

	public void petMethod() {
		
	}
}
