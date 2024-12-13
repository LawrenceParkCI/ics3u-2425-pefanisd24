package unit2;
import java.util.Scanner;

/**
Description: This code asks for a name then prints each letter on a different line
Date: November 27, 2024
@author Daniella Pefanis
 */


public class StringLengthAndChars {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
      Goal: Using string methods with a for loop
        .length()
        .charAt(<position>)
		 */

		String name = "Ms. Kemp";

		//write comments for the following code - what does it print out, and why?
		System.out.println(name.length());   // 1. Prints the length of the string 'name'. It prints out = 8
		System.out.println(name.charAt(1));   // 2. Prints the character at position 1 in the string 'name' It prints out = s
		System.out.println(name.charAt(2)); // 3. Prints the character at position 2 in the string 'name'. It prints out = .
		System.out.println(name.charAt(3)); // 4. Prints the character at position 3 in the string 'name'. It prints out = (space)

		//.length() gets the total number of characters in the string.
		//.charAt(position) gets the character at the specified position (index).
		//counting starts at 0, which means the first character is at position 0.

		/**
      Ask for user input for name. Print out each individual letter of the name on separate lines, using a for loop
		 */

		System.out.print("Enter your name: ");
		String userName = scanner.nextLine();

		for (int i = 0; i < userName.length(); i++) {
			System.out.println(userName.charAt(i));
		}

		scanner.close();

	}
}