// Filename: DotComBust.java
// prep code

import java.util.ArrayList;

class DotComBust {
	// Declare Instance Variables
	// GameHelper helper
	GameHelper helper = new GameHelper();

	// ArrayList<DotCom> dotComsList
	ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	// Will hold 3 DotComs

	// Count number of guesses = 0
	int numberOfGuesses = 0;


	// Declare Methods
	//
	public void setUpGame() {
		// Make 3 DotCom obj and name them
		
		// Create 3 DotCom objs

		// Set a Name for each DotCom

		// Add the DotComs to the dotComsList

		// Repeat (DotCom: dotComesList)

			// Call the placeDotCom() in helper to locate the DotComs

		// End Repeat

	} // end of setUpGame()

	//
	public void startPlaying() {
		// While any DotComs exist

			// Get user input by call helper

			// Evaluate the user's guess by checkUserGuess()

		// End While

	} // end of startPlaying()

	//
	public void checkUserGuess(String userGuess) {
		// Find out if there's a hit(or kill) on any DotCom

		// Increment the number of user guesses in the numberOfGuesses variable

		// Set the local result variable(a String) to "miss" by default

		// Repeat with each DotCom obj in the DotComsList

			// Evaluate the user's guess by calling the DotCom obj's checkYoursef()

			// Set the result variable to "hit" or "kill" if appropriate

			// If the result is "kill" 
				
				// Remove the DotCom from the DotComsList
		
			// End if

		// End Repeat
		
	} // end of checkUserGuess()

	//
	public void finishGame() {
		// Display the generic "Game Over" msg, then:

		// If number of user guesses is small:

			// Display a congratulations msg

		// else

			// Display an insulting one

		// End if

	} // end of finishGame()

}

