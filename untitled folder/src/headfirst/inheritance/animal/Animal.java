package headfirst.inheritance.animal;

public class Animal {
	private String name;
	protected Animal roam(Animal animalRoam) {
		System.out.println("Roam from Animal");
		return null;
	}
	public Animal makeNoise(Animal animalNoise) {
		System.out.println("Noise from Animal");
		return null;
	}
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {return name;}
	
	public Animal() {}
	
	public static void main(String[] args) {
		Animal[] animals = new Animal[4];
		animals[0] = new Dog(); animals[1] = new Cat(); animals[2] = new Wolf();
		animals[3] = new Hippo();
		for(int i=0; i<animals.length;i++) {
			animals[i].roam(null);
		}
	}
}
