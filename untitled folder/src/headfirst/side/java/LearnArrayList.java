package headfirst.side.java;

import java.util.ArrayList;

public class LearnArrayList {
	public static void main(String[] args) {
		Class c1 = ArrayList.class;
		Class<ArrayList> c2 = ArrayList.class;
		
		System.out.println("c1 - " + c1.getClass());
		System.out.println("c1 - " + c1.getPackage());
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("c1 equals c2 = " + c1.equals(c2));
		System.out.println("c1 == c2 = " + (c1 == c2));
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		System.out.println("list1 - " + list1.getClass());
		System.out.println("list1 equals list2 - " + list1.equals(list2));
		System.out.println("list1 == list2 - " + (list1 == list2));
		
	}
}
