package unit2;

import java.util.Scanner;

/**
 * Description: This program makes a quiz and gives the result score.
 * Date: November 13, 2024
 * @author Daniella Pefanis
 */

public class IfChallenge3 {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Declaring variables
		String q1, q2, q3, q4, q5, q6;
		double quizpoints = 0;
		String answer;

		//Print their name
		System.out.print("Please print your first name: ");
		q1 = sc.next();

		// Ask if they're ready for the test
		System.out.println("                                   @@@@@@@\r\n"
				+ "                           @@@@@@@@@@@@@@@\r\n"
				+ "                   @@@@@@@@@@@@@@@@@@ @@@@\r\n"
				+ "             @@@@@@@@@@@@@@@@@@       @@@@\r\n"
				+ "           @@@@@@@@@@@@               @@@@\r\n"
				+ "           @@@@@                     @@@@@\r\n"
				+ "           @@@@@              @@@@@@@@@@@@\r\n"
				+ "           @@@@@      @@@@@@@@@@@@@@@@@@@@\r\n"
				+ "           @@@@@@@@@@@@@@@@@@@@@      @@@@\r\n"
				+ "           @@@@@@@@@@@@@@@            @@@@\r\n"
				+ "           @@@@@@@                    @@@@\r\n"
				+ "           @@@@@                      @@@@\r\n"
				+ "           @@@@@                @@@@@ @@@@\r\n"
				+ "           @@@@@             @@@@@@@@@@@@@\r\n"
				+ "           @@@@@           @@@@@@@@@@@@@@@\r\n"
				+ "           @@@@@           @@@@@@@@@@@@@@@\r\n"
				+ "   @@@@@@@@@@@@@          @@@@@@@@@@@@@@@@\r\n"
				+ " @@@@@@@@@@@@@@@           @@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@           @@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@             @@@@@@@@@@@  \r\n"
				+ "@@@@@@@@@@@@@@@@                @@@@@     \r\n"
				+ "@@@@@@@@@@@@@@@                           \r\n"
				+ " @@@@@@@@@@@@@                            \r\n"
				+ "   @@@@@@@@@                              ");
		System.out.println("");
		System.out.println("Are you ready for the test, " + q1 + "? Let's begin! ");
		System.out.println("");

		//Question 1
		System.out.println("Question 1:");
		System.out.println("Which artist is not a part of the OVO label?");
		System.out.println("A. Partynextdoor");
		System.out.println("B. Drake");
		System.out.println("C. Future");
		System.out.println("D. Smiley");
		System.out.println("");
		System.out.println("Please type your answer.");

		//Declaring variables
		q2 = sc.next();

		// Using equalsIgnoreCase() method
		if (q2.equalsIgnoreCase("C")) {
			System.out.println("Correct!");
			quizpoints +=1;
		} else {
			System.out.println("Sorry, that's incorrect.");
		}

		//Question 2
		System.out.println("");
		System.out.println("Question 2:");
		System.out.println("Which is not a Frank Ocean album?");
		System.out.println("A. Channel Orange");
		System.out.println("B. Blonde");
		System.out.println("C. Nostalgia Ultra");
		System.out.println("D. Biking");
		System.out.println("");
		System.out.println("Please type your answer.");

		//Declaring variable
		q3 = sc.next();

		// Using equalsIgnoreCase() method
		if (q3.equalsIgnoreCase("D")) {
			System.out.println("Correct!");
			quizpoints +=1;
		} else {
			System.out.println("Sorry, that's incorrect.");

		}
		//Question 3
		System.out.println("");
		System.out.println("Question 3:");
		System.out.println("SZA has won 66 awards");
		System.out.println("A. True");
		System.out.println("B. False");
		System.out.println("");
		System.out.println("Please type your answer.");

		//Declaring variable
		q4 = sc.next();

		// Using equalsIgnoreCase() method
		if (q4.equalsIgnoreCase("A")) {
			System.out.println("Correct!");
			quizpoints +=1;
		} else {
			System.out.println("Sorry, that's incorrect.");
		}

		//Question 4
		System.out.println("");
		System.out.println("Question 4:");
		System.out.println("Which is Drake's first album he ever released?");
		System.out.println("A. Take Care");
		System.out.println("B. Thank Me Later");
		System.out.println("C. Views");

		System.out.println("");
		System.out.println("Please type your answer.");

		//Declaring variable
		q5 = sc.next();

		// Using equalsIgnoreCase() method
		if (q5.equalsIgnoreCase("B")) {
			System.out.println("Correct!");
			quizpoints +=1;
		} else {
			System.out.println("Sorry, that's incorrect.");
		}

		//Question 5
		System.out.println("");
		System.out.println("Question 5:");
		System.out.println("What was The Weeknd's first released album?");
		System.out.println("A. After Hours");
		System.out.println("B. Starboy");
		System.out.println("C. Trilogy");
		System.out.println("D. House of Balloons");

		System.out.println("");
		System.out.println("Please type your answer.");

		//Declaring variable
		q6 = sc.next();

		// Using equalsIgnoreCase() method
		if (q6.equalsIgnoreCase("C")) {
			System.out.println("Correct!");
			quizpoints +=1;
		} else {
			System.out.println("Sorry, that's incorrect.");
		}

		System.out.println("Congradulations! You've finished the quiz!");
		System.out.println("Here is your final mark.." + (quizpoints/5*100) + "%");

		scanner.close();
	}
}