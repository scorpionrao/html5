package headfirst.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class GameHelper {
	
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 7;
	private int[] grid = new int[gridSize];
	private int comCount = 0;
	
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + ": ");
		try {
			BufferedReader is =
				new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if(inputLine.length() == 0) return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputLine.toLowerCase();
	}
	
	public ArrayList<String> placeDotCom(int comSize) {
		ArrayList<String> alphaCells = new ArrayList<String>();
		String temp = null;
		return null;
	}
}