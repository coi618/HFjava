// Filename: mySimpleDotCom.java

public class mySimpleDotCom {
	// instance variables
	int loc; // First location cell, [0-4]
	int numOfHits = 0; // Check hit numbers, kill when 3, otherwise hits



	// methods
	// Get user guess and check, return "hit", "miss" or "kill"
	public String checkYourself(String guess) {
		// Set default result as "miss"
		String result = "miss";
		for(int i=0; i<3; i++) {
			if(Integer.parseInt(guess) == loc+i) {
				result = "hit";
				numOfHits++;
				break;
			} // end if
		} // end for

		// check if kill
		if(numOfHits == 3) 
			result = "kill";
		return result;
	} // String checkYourself() end

	// Get the first locat, and setup location
	//public void setLocationCells(int[] locat) { // book
	public void setLocationCells(int locat) { // my
		loc = locat;
	} // void setLocationCells() end
}
