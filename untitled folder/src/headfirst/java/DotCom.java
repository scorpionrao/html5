package headfirst.java;

import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	private String name;
	public void setLocationCells(ArrayList<String> locationCells) {
		this.locationCells = locationCells;
	}
	public void setName(String name) {
		this.name = name;
	}
	String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index != -1) {
			locationCells.remove(userInput);
			if(locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}
		System.out.println(result);
		return result;
	}
}