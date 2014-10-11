package headfirst.collectionsandgenerics;

import java.util.ArrayList;

public class TestGenerics1 {
	public static void main(String[] args) {
		new TestGenerics1().go1();
	}
	
	public void go() {
		Animal[] animals = { new Dog(), new Cat(), new Dog() };
		takeAnimals(animals);
		
		Dog[] dogs = {new Dog(), new Dog(), new Dog()};
		takeAnimals(dogs);
	}
	
	public void takeAnimals(Animal[] animals) {
//		animals[0] = new Cat();
		for(Animal a : animals) {
			a.eat();
		}
	}
	
	public void go1() {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
//		takeAnimals1(animals);
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		takeAnimals1(dogs);
	}
	
	public void takeAnimals1(ArrayList<? extends Animal> animals) {
//		animals.add(new Cat());
		for(Animal a : animals) {
			a.eat();
		}
	}
	
	public <T extends Animal> void takeAnimals1(ArrayList<T> one, 
			ArrayList<T> two) {}


}
