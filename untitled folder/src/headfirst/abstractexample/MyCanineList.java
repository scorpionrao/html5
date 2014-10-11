package headfirst.abstractexample;

public class MyCanineList {
	private Canine[] canines = new Canine[5];
	private int nextIndex = 0;
	
	public void add(Canine d) {
		if (nextIndex < canines.length) {
			canines[nextIndex] = d;
			System.out.println("Canine added at " + nextIndex);
			nextIndex++;
		}
	}
	
	public static void main(String[] args) {
		MyCanineList list = new MyCanineList();
		Dog d = new Dog();
		Cat c = new Cat();
		list.add(d);
		list.add(c);
		Object o = new MyCanineList();
		o.hashCode();
		
		Dog canineInIndex0 = (Dog) list.canines[0];
		
		// both references point to 
		// same object on the heap
		canineInIndex0.method1();
		list.canines[0].method1();
	}
}
