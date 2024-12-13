package unit2;

/**
Description: This code uses a for loop with a range of numbers.
Date: November 26, 2024
@author Daniella Pefanis
 */

public class For2 {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		//Recall - create a for loop printing 1 to 10:


		//though we are repeating a certain number of times, we can use variables in our for loops as well

		int times = 20;

		for (int i = 15; i < times; i++) {
			System.out.println(i);
		}

		//In addition, the counter doesn't necessarily have to be an integer
		double increment = 0.1;
		for (double i = 0; i < 2; i += increment) {
			System.out.println(i);
		}

		//create a variable to store the starting number, and use it in a for loop. Be able to use a double value:

		//Create a for loop printing 1 to 10:
		for (int i = 1; i <= 10; i++) {
			System.out.println(i); 
		}


		//Look at the following code. Explain what is happening?
		//The `for` loop adds all integers from 1 to 9 to the `sum` variable. It starts with `i = 1` and iterates until `i = 9`, updating `sum` on each iteration. After the loop finishes, `sum` contains the total of these integers, which is 45.


		int sum = 0; 

		for (int i = 1; i < 10; i++) {
			sum += i;
		}

		System.out.println(sum);



		{
		}
	}
}

