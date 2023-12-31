// Filename: mySimpleDotComTestDrive.java

public class mySimpleDotComTestDrive {
	public static void main(String[] args) {
		mySimpleDotCom dotCom = new mySimpleDotCom();

		// Set a location 3,4,5
		int location = 3;
		dotCom.setLocationCells(location);

		// User guess: 1,2,3,4,5
		for(int i = 1; i<6; i++) {
			System.out.println(dotCom.checkYourself(Integer.toString(i)));
		}

		// Should print: miss, miss, hit, hit, kill
	}
}
