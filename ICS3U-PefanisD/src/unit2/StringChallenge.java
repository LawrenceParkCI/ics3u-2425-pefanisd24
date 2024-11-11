package unit2;
import java.util.Scanner;

/**
 * Description: This code asks for Frank Ocean's most streamed album and tells you if your answer is right or not, and what percentage of correct you got. 
 * Date: November 11, 2024
 * @author Daniella Pefanis
 */

public class StringChallenge {
	public static void main(String[] args) {
		//This is for the portfolio

		/*
    Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.


    Also, include an example of explicit and implicit casting.

    Comment to explain:
      -when you use the different String functions
      The first String function (equals()), and the last one (compareTo()), input is always Sorry, that's incorrect unless the answer typed is exactly right. (Including capital letters.) When using equalsIgnoreCase(), as long as the input is typed properly, it'll say correct even if the letters aren't capitalized properly.  
      -when you are casting and how the value is changed
      In this code, explicit casting is used when converting the percentage from a double to an int, which removes the decimal part (e.g., 60.5 becomes 60), and implicit casting is used when an int is automatically converted to a double (e.g., 10 becomes 10.0) without losing any information.
		 */

		Scanner in = new Scanner(System.in);

		String answer;

		System.out.println("What is Frank Ocean's main streamed album?");
		answer = in.nextLine();

		// Using equals() method for exact match 
		if (answer.equals("Blonde")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Sorry, that's incorrect.");

			// Using equalsIgnoreCase() method
			if (answer.equalsIgnoreCase("blonde")) {
				System.out.println("Correct! (case doesn't matter)");
			} else {
				System.out.println("Sorry, that's incorrect.");
			}

			// Using compareTo() method
			if (answer.compareTo("Blonde") == 0) {
				System.out.println("Correct! (compareTo method)");
			} else {
				System.out.println("Sorry, that's incorrect.");
			}

			// Example of explicit casting
			int totalQuestions = 5;
			int correctAnswers = 3;

			double percentage = ((double) correctAnswers / totalQuestions) * 100;

			// Implicit casting
			System.out.println("Your score percentage: " + percentage + "%");

			// Explicit casting
			int roundedPercentage = (int) percentage; 
			System.out.println("Your rounded score percentage: " + roundedPercentage + "%");

			int number = 10;
			double numberAsDouble = number;
			System.out.println("Implicit casting result (int to double): " + numberAsDouble);

			in.close();
		}
	}
}