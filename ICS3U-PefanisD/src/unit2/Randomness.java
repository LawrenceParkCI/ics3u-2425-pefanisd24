package unit2;

/**

https://www.geeksforgeeks.org/java-math-random-method-examples/

Description: This code prints a random number between 100-1000
Date: November 19, 2024
@author: Daniella Pefanis
 */


public class Randomness {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random()*900+100);
		}

		//Run the program a few times. What do you think is the 
		//range of the numbers generated?
		//I think the range is 0-1

		//Read the demo program. Write the code so that the program 
		//will produce a random number between 100 and 1000.

	}
}