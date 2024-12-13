package unit2;

import java.util.Scanner;

/**
 * Description: This program prints the capital of Ontario
 * Date: December 2, 2024
 * @author Daniella Pefanis
 */

class StringComparison {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String answer;

		System.out.println("What is the capital of Ontario?");
		answer = in.nextLine();

		if (answer == "Toronto") {
			System.out.println("Correct!");
		} else {
			System.out.println("Sorry, that's incorrect.");
		}

		// Using equals() method for exact match 
		if (answer.equals("Toronto")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Sorry, that's incorrect.");
		}


		// Using equalsIgnoreCase() method
		if (answer.equalsIgnoreCase("toronto")) {
			System.out.println("Correct! (case doesn't matter)");
		} else {
			System.out.println("Sorry, that's incorrect.");
		}

		// Using compareTo() method
		if (answer.compareTo("Toronto") == 0) {
			System.out.println("Correct! (compareTo method)");
		} else {
			System.out.println("Sorry, that's incorrect.");
		}

		in.close();
	}


	//Run the code. What happens when you type the correct answer? The incorrect answer?
	//When I type both the correct or incorrect answer, the input says "Sorry, that's incorrect."

	/*
      Strings are objects, not primitives and as such are a 
	 *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo()
        The String class compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
        .equals()
        The String class equals() method compares the original content of the string. It compares values of string for equality. 
        .equalsIgnoreCase()
        public boolean equalsIgnoreCase(String another) compares this string to another string, ignoring case.
	 */


	//What values does compareTo() return?How can we 
	//interpret the value? The compareTo() method returns an integer: 0 if the strings are equal, a positive number if the first string is greater, and a negative number if the first string is smaller.

	//what value does equals() and equalsIgnoreCase() return? The equals() method returns true if the strings are exactly the same, including case, and false if they are not. The equalsIgnoreCase() method returns true if the strings are the same, ignoring case, and false if they are not.
	//What is the difference between these two functions? equals() checks for exact matches, including case, while equalsIgnoreCase() ignores case differences when comparing strings.
}