package headfirst.collectionsandgenerics;

import java.util.ArrayList;
import java.util.List;

public class compilerclass {
	public static void main(String[] args) {
		ArrayList<? extends Animal> dogs1 = new ArrayList<Animal>();
		ArrayList<? extends Animal> animals1 = new ArrayList<Dog>();
		List<Animal> list = new ArrayList<Animal>();
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		ArrayList<? extends Animal> animals = dogs;
		List<Dog> dogList = dogs;
		ArrayList<Object> objects = new ArrayList<Object>();
		List<Object> objList = objects;
		ArrayList<? extends Object> objs = new ArrayList<Dog>();
	}
}
