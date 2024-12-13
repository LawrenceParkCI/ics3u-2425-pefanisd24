package unit2;

/**
Description:
Date: November 11, 2024
@author Daniella Pefanis
 */

import java.util.Scanner;

public class Switch2 {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please type a month of the year.");
		String month = in.nextLine().toLowerCase();

		System.out.println("Please enter the year.");
		int year = in.nextInt();

		// Leap year check 
		boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

		switch (month) {
		case "january":
			System.out.println("This month has 31 days.");
			break;
		case "february":
			if (isLeapYear) {
				System.out.println("This month has 29 days.");
			} else {
				System.out.println("This month has 28 days.");
			}
			break;
		case "march":
			System.out.println("This month has 31 days.");
			break;
		case "april":
			System.out.println("This month has 30 days.");
			break;
		case "may":
			System.out.println("This month has 31 days.");
			break;
		case "june":
			System.out.println("This month has 30 days.");
			break;
		case "july":
			System.out.println("This month has 31 days.");
			break;
		case "august":
			System.out.println("This month has 30 days.");
			break;
		case "september":
			System.out.println("This month has 31 days.");
			break;
		case "october":
			System.out.println("This month has 30 days.");
			break;
		case "november":
			System.out.println("This month has 31 days.");
			break;
		case "december":
			System.out.println("This month has 30 days.");
			break;

			/*Create a program that asks for a month, and print out how many days there are in that month. (For "February", just put 28). This will be a part of your portfolio.

    Challenge: Ask for the year, and change "February" to 29 if the year is a leap year (divisible by 4)
			 */

			//Can you create it such that you can remove some breaks?
		}
	}
}