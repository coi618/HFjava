// Filename: GuessGame.java
public class GuessGame {

	// start game method
	public void startGame() {

		// Call 3 players
		/*
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		*/
		// Init the Player[] p
		Player[] p = new Player[3];
		// Init each Player p[i] = new Player()
		for(int i = 0; i<3; i++) 
			p[i] = new Player();

		// Get Answer
		int ans = (int)(Math.random()*10);
		// Check Answer
		System.out.println("The answer is: "+ans);

		// the variables to save player guess
		//int ans1, ans2, ans3;
		int[] p_ans = new int[3];

		boolean winner = false;
		while(!winner) {

			System.out.print("P1: ");
			//ans1 = p1.guess();
			p_ans[0] = p[0].guess();
			System.out.print("P2: ");
			//ans2 = p2.guess();
			p_ans[1] = p[1].guess();
			System.out.print("P3: ");
			//ans3 = p3.guess();
			p_ans[2] = p[2].guess();
			// Check player guess number
			//System.out.println("P1: "+ans1+", P2: "+ans2+", P3: "+ans3);
			
			// Check if any player win
			/*
			if(ans == ans1) {
				System.out.println("We have winner: Player 1 !!!");
				break;
			} else if (ans == ans2) {
				System.out.println("We have winner: Player 2 !!!");
				break;
			} else if (ans == ans3) {
				System.out.println("We have winner: Player 3 !!!");
				break;
			}
			*/
			for(int i = 0; i<3; i++) {
				if(ans == p_ans[i]) {
					System.out.println("We have winner: Player "+(i+1)+" !!!");
					winner = true;
					break;
				}

			}
			if(!winner)
				System.out.println("No one get the answer, let's try again...");

		}

		System.out.println("Game Over.");
	}

}
