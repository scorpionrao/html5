package headfirst.java;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleDotComTestDrive {
	private static ArrayList<String> createArrayList(String... strings) {
		ArrayList<String> list = new ArrayList<String>();
		for(String string : strings) {
			list.add(string);
		}
		return list;
	}

	public static void main(String[] args) {
		DotCom dot = new DotCom();
		createArrayList(new String[] {"one", "two"});
		ArrayList<String> locations = createArrayList(new String[] {"2","3","4"});
		dot.setLocationCells(locations);
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		System.out.println(result);
		
	}
}