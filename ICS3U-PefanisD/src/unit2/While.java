package unit2;

/**
 Description: This program prints names.
 Date: December 2, 2024
 @author Daniella Pefanis
 */

import java.util.Scanner;

public class While {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many people are you planning to see?");

		//Why do you think I coded it this way?
		int numPeople = Integer.parseInt(in.nextLine());

		while (numPeople > 0) {
			System.out.print("What is this person's name? ");

			//Why do you think the variable is declared here?
			String name = in.nextLine();
			System.out.println("Welcome, " + name + "!");

			numPeople = numPeople - 1;
		}


		in.close();
		//Run the code Using the debugger. 
		//Explain the code in your own words
		//This code asks for a number of people and then asks for each persons name.

		//What code is repeated?
		//"What is this persons name?" and "Welcome,..!"

		//When does it decide whether to repeat or not?
		//"When there are same number of names as people entered."

		//What is the condition for repeating?
		//Keep repeating "What is this persons name?" until there are same number of names as people entered.


		//What is the difference between a while loop and a do-while loop?
		//The do-whie loop is used when you don't know how many times you want to loop, while the while loop is more just when you want to repeat something a certain number of times.


		//Create a while loop that asks for a word, 
		//and prints it out 20 times.
		//Create a do-while loop that asks for a word, and //prints it out 20 times.


		System.out.print("Please type a word.");
		String word = in.nextLine();
		int repeat = 1;
		while (repeat<=20 ) {
			System.out.println(word);
			repeat ++;
		}
		in.close();
	}
}



