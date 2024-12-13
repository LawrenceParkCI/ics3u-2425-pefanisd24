package unit2;
import java.util.Scanner;
/**
Description: This program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.
Date: November 27, 2024
@author Daniella Pefanis
 */

public class ForChallenge1 {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
      Create a program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.  You should be able to count by decimals.
      ie.

      Starting Num: 
        0
      Ending Num: 
        1
      Count by: 
        0.1
      Result: 
        0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
		 */

		Scanner scanner = new Scanner(System.in);

		// Ask for starting number, ending number, and how much it will count by
		System.out.print("Starting Number: ");
		double startNum = scanner.nextDouble();

		System.out.print("Ending Number: ");
		double endNum = scanner.nextDouble();

		System.out.print("Count by: ");
		double countBy = scanner.nextDouble();

		// Print numbers from startNum to endNum, counting by countBy
		for (double i = startNum; i <= endNum; i += countBy) {
			System.out.print(i + " ");
		}
		scanner.close();
	}
}
