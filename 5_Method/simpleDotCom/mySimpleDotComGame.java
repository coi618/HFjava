// Filename: mySimpleDotComGame.java
import java.io.*;
import java.util.ArrayList;

public class mySimpleDotComGame {
	public static void main(String[] args) {
		// Start Game
		// : Initial the environment
		// 1. Build a DotCom
		mySimpleDotCom dotCom = new mySimpleDotCom();
		// 2. Set DotCom location
		int firstLocNum = ((int)(Math.random()*5)); //[0-4]
		ArrayList<String> locations = new ArrayList<String>();
		for(int i=0; i<3; i++) {
			locations.add(Integer.toString(firstLocNum+i));
		} // end for
		dotCom.setLocationCells(locations);
		// 3. Set DotCom as alive
		boolean Alive = true;
		// 4. Set a guess counter = 0
		int guessCount = 0;

		// TODO: Play Game(loop: guess > check > response)
		// 1. Loop if DotCom still alive
		while(Alive) {
		// 2. Declare result = "miss" / guess counter +1
			String result = "miss";
			guessCount++;
		// 3. Ask player to enter the guess
			String userGuess= null;
			System.out.print("Enter your guess: ");
			try {
				BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
				userGuess = is.readLine();
				if(userGuess.length() == 0) userGuess = null;
			} catch (IOException e) {
				System.out.println("IOException: "+e);
			} // end try..catch
		// 4. Print func return result
			result = dotCom.checkYourself(userGuess);
			System.out.println(result);

		// 5. Check if kill(No: Continue / Yes: Set alive=false)
			if(result == "kill") Alive = false;
		} // end while

		// TODO: End the Game
		// 1. Print how many time user guess
		System.out.println("You kill DotCom with "+guessCount+" guess!!");
		//*2. Say goodbye to user
		System.out.println("Thanks for play.");

	} // end main
} // end class
