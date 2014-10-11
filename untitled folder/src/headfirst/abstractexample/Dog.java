package headfirst.abstractexample;

public class Dog extends Canine {

	Dog method2() {
		return null;
	}

	Dog method3() {
		return null;
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Class<? extends Dog> class1 = dog.getClass();
		Animal animal = new Dog();
		
	}

}
