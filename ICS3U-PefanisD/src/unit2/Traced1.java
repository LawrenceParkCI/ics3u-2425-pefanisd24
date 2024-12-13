package unit2;

/**
	Name: Mr. Lee
	Date: Oct 29, 2021
	Description: Tracing through code
 */

public class Traced1 {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		int num = 0;
		String word = "Que";

		// Prints Que 15 times
		while (num < 15) {
			System.out.println(word);
			num = num + 1;
		}

		// Double after first loop
		word = word + word;

		num = 0;

		// Prints the doubled string 15 times
		while (num > 0) {
			System.out.println(word);
			num = num - 1;
		}
	}
} 
