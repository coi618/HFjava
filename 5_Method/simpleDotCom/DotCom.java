// Filename: DotCom.java

import java.util.ArrayList;

// Modify from SimpleDotCom to DotCom
public class DotCom {
	// instance variables
	private ArrayList<String> locationCells = new ArrayList<String>(); // locationCells by ArrayList<String>
	//int numOfHits = 0; // Check hit numbers, kill when 3, otherwise hits | Don't need in new version

	// methods
	// Get user guess and check, return "hit", "miss" or "kill"
	public String checkYourself(String userInput) {

		// Set default result as "miss"
		String result = "miss";

		// Check if player's guess in the locations(ArrayList), if not: indexOf() return -1
		int index = locationCells.indexOf(userInput);

		// index >= 0 means hit the DotCom
		if(index >= 0) {
			// remove the hitted box
			locationCells.remove(index);

			// locationCell is? empty: kill | not empty: hit
			if(locationCells.isEmpty()) result = "kill";
			else result = "hit";
		} // end if

		// return result
		return result;
	} // end Method

	// Get the locats(ArrayList<String>), and setup locations
	public void setLocationCells(ArrayList<String> locs) { 
		locationCells = locs;

		//Make a test
		for(String cell: locationCells) {
			System.out.println(cell);
		}
	}
}
