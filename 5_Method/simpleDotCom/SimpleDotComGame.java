// Filename: SimpleDotComGame.java

public class SimpleDotComGame {
	public static void main(String[] args) {
		// Count how many time player guess
		int numOfGuesses = 0;
		// New a game helper
		GameHelper helper = new GameHelper();
		// New a DotCom
		SimpleDotCom theDotCom = new SimpleDotCom();
		// Set DotCom's location [1-5]
		int randomNum = (int)(Math.random()*5);
		int[] locations = {randomNum, randomNum+1, randomNum+2};
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
			// if kill DotCom, make isAlive=false
			if(result.equals("kill")) {
				isAlive = false;
				// print number of guess
				System.out.println("You took "+numOfGuesses+" guesses.");
			} // end if 
		} // end while
	}
}

