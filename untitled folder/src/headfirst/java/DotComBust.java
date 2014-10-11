package headfirst.java;

import java.util.ArrayList;

public class DotComBust {
	private int numOfGuesses = 0;
	
	private GameHelper helper = new GameHelper();
	
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	
	private void setUpGame() {
		int numOfDotComs = 3;
		for(int i = 1; i <= numOfDotComs; i++) {
			DotCom dotCom = new DotCom();
			dotCom.setName("site"+i+".com");
			dotComsList.add(dotCom);
		}
		System.out.println("Your goal is to sink " + numOfDotComs + "dot coms.");
		System.out.println("Try to sink them all in fewest possible guesses");
		for(DotCom dotcomToGet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotcomToGet.setLocationCells(newLocation);
		}
	}
	private void startPlaying() {
		while(!dotComsList.isEmpty()) {
			String cellLocation = helper.getUserInput("Enter a cell location");
			checkUserGuess(cellLocation);
		}
		finishGame();
	}
	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";
		for(DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if(result.equalsIgnoreCase("kill")) {
				dotComsList.remove(dotComToTest);
				break;
			} else if(result.equalsIgnoreCase("hit")) {
				break;
			}
		}
		System.out.println(result);
	}
	private void finishGame() {
		System.out.println("All Dot Coms are dead! Your stock is now worthless.");
		if (numOfGuesses < 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You got out before your options sank.");
		} else {
			System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options.");
		}
	}
	public static void main (String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}