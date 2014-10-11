package headfirst.inheritance.animal;

public class Wolf extends Feline {
	public Wolf makeNoise(Animal wolfNoise) {
		System.out.println("Noise from Wolf");
		return this;
	}
}