package fanExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CeilingFanDriver {
	public static void main(String[] args) {
		PullSpeedCord speedCord = new PullSpeedCord();
		PullDirectionCord directionCord = new PullDirectionCord();

		/**
	     * While loop that Keeps prompting the user to enter a letter:
	     * S: to pull the Speed cord  OR
	     * D: to pull the Direction cord  OR
	     * Q: to quit end getting out of the loop and the program.
	     */
		while (true) {
			System.out.print("Press 'S' to pull Speed cord OR 'D' to pull Direction cord OR 'Q' to quit.");
			String action = getLine();
			if (action.equals("S") || action.equals("s"))
				speedCord.pull();

			if (action.equals("D") || action.equals("d"))
				directionCord.pull();

			if (action.equals("Q") || action.equals("q")) {
				System.out.println("Good bye");
				break;
			}
		}
	}

	
	/**
     * Method getLine using BufferReader to get String entered by the user after pressing Enter.
     * @return String. 
     */
	static String getLine() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			line = in.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return line;
	}
}
