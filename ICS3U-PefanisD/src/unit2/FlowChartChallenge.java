package unit2;

import java.util.Scanner;

/**
 Description:
 Date:
 @author 
 */

class FlowChartChallenge {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	private static Scanner in;

	public static void main(String[] args) {
		/*Create a flow chart for this program. Add the Share link
    to your flowchart as a comment in this program.
    How would the flow chart of the do-while loop
     and while loop differ?


     //https://drive.google.com/file/d/1WhZwiHqIhphhFklDK31uXlCHykR8LoP5/view?usp=sharing
		 */

		Scanner sc = new Scanner(System.in);
		String name;
		do {
			System.out.print("What is your name? ");
			name = sc.nextLine();
		} while (!name.equals("Ms. Kemp"));

		System.out.println("You are welcome into the secret secret pogchamp club.");

		in.close();

	}
}