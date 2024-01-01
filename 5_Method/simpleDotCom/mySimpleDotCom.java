// Filename: mySimpleDotCom.java

import java.util.ArrayList;

public class mySimpleDotCom {
	// instance variables
	ArrayList<String> loc = new ArrayList<String>(); // loc with ArrayList version
	int numOfHits = 0; // Check hit numbers, kill when 3, otherwise hits

	// methods
	// Get user guess and check, return "hit", "miss" or "kill"
	public String checkYourself(String guess) {
		// Set default result as "miss"
		String result = "miss";
		// if [guess] not in loc, indexOf() return -1
		int index = loc.indexOf(guess);
		// index >= 0 means hit
		if(index >=0 ) {
			// Remove the hitted box
			loc.remove(index);
			// Check if kill(loc empty)
			if(loc.isEmpty()) result = "kill";
			// Or just hit
			else result = "hit";
		} // end if

		// Print & return result
		return result;
	} // String checkYourself() end

	// Get the first locat, and setup location
	//public void setLocationCells(int[] locat) { // book
	public void setLocationCells(ArrayList<String> locat) { // my
		loc = locat;
	} // void setLocationCells() end
}
