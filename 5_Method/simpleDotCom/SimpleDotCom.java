// Filename: SimpleDotCom.java

public class SimpleDotCom {
	// instance variables
	int[] locationCells; // location cells, EX: {2,3,4}
	int numOfHits = 0; // Check hit numbers, kill when 3, otherwise hits



	// methods
	// Get user guess and check, return "hit", "miss" or "kill"
	public String checkYourself(String stringGuess) {

		// Convert string to integer
		int guess = Integer.parseInt(stringGuess);
		// Set default result as "miss"
		String result = "miss";

		// loop all items in locationCells
		for(int cell: locationCells) {
			// Compare cell & guess
			if(guess == cell) { 
				result = "hit";
				numOfHits++;
				break; // not need other compare if hit
			} // end if
		} // end for

		// Check if kill
		if(numOfHits == locationCells.length) {
			result = "kill";
		} // end if

		// print & return result
		System.out.println(result);
		return result;
	} // end Method

	// Get the locats, and setup locations
	public void setLocationCells(int[] locs) { 
		locationCells = locs;
	}
}
