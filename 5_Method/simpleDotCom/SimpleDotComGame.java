// Filename: SimpleDotComGame.java

import java.util.ArrayList;

public class SimpleDotComGame {
	public static void main(String[] args) {
		// Count how many time player guess
		int numOfGuesses = 0;
		// New a game helper
		GameHelper helper = new GameHelper();
		// New a DotCom
		DotCom theDotCom = new DotCom();
		// Set DotCom's location [1-5]
		int randomNum = (int)(Math.random()*5);
		// Set location with ArrayList<String>
		ArrayList<String> locations = new ArrayList<String>();
		for(int i=0; i<3; i++) {
			// add location(convert (random number) to String) to ArrayList
			locations.add(Integer.toString(randomNum+i));
		} // end for
		// Call setLocationCells and put locations in it
		theDotCom.setLocationCells(locations);
		// Set DotCom alive
		boolean isAlive = true;
		// Play game: non-stop if DotCom still alive
		while(isAlive) {
			// Get user guess from helper
			String guess = helper.getUserInput("Enter a number: ");
			// check guess
			String result = theDotCom.checkYourself(guess);
			// Guess number add 1
			numOfGuesses++;
			// print result
			System.out.println(result);
			// if kill DotCom, make isAlive=false
			if(result.equals("kill")) {
				isAlive = false;
				// print number of guess
				System.out.println("You took "+numOfGuesses+" guesses.");
			} // end if 
		} // end while
	}
}

