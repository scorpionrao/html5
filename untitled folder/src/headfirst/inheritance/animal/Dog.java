package headfirst.inheritance.animal;

import java.util.ArrayList;

public class Dog extends Feline implements Pet {
	public Feline makeNoise(Animal dogNoise) {
		System.out.println("Noise from Dog");
		return this;
	}
	public void petMethod() {}
	public static void takePet(Pet pet) {
		pet.petMethod();
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		ArrayList<Animal> animal = new ArrayList<Animal>();
		animal.add(d);
		animal.add(c);
		Dog dogInList = (Dog) animal.get(1);
		
//		Polymorphism using interface in an inheritance tree
//		(new Dog()).petMethod();
//		((Pet) new Dog()).petMethod();
//		
//		((Dog) new Feline()).petMethod();
//		((Pet) new Feline()).petMethod();
//		
//		((Dog) new Animal()).petMethod();
//		((Pet) new Animal()).petMethod();
//		
//		((Dog) (Feline) new Animal()).petMethod();
//		((Pet) (Feline) new Animal()).petMethod();
		
	}
}