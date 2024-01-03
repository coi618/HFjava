// Filename: myDotComBustTestDrive.java

public class myDotComBustTestDrive {
	public static void main(String[] args) {
		// TODO: 1. Call setUpGame(), check the parameter
		DotComBust testBust = new DotComBust();
		testBust.setUpGame();
		// Check each DotComs' location
		for(DotCom dotCom: testBust.dotComsList) {
			// Print out DotCom's name
			System.out.println("DotCom: "+dotCom.getName());
			// for dotCom's location
			for(String loc: dotCom.loc) {
				// Print location of DotCom
				System.out.println(loc)
			} // end loc of dotCom for
			
		} // end dotComsList for

		// TODO: 2. Simulate the user 7 guess with random, check result
		// Attack A1, B2...G7
		String[] attack = {"A1","B2","C3","D4","E5","F6","G7"};
		for(String a: attack) {
			testBust.checkUserGuess(a);
		} // End attack for


		// TODO: 3. clear leftover DotCom, show finishGame()
		for(DotCom com: testBust.dotComsList) {
			for( String loc: com.loc) {
				testBust.checkUserGuess(loc);
			} // End for com
		} // End for dotComsList

		testBust.finishGame();


	} // end main
} // end class

