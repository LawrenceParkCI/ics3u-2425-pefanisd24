package unit2;
import java.util.Scanner;

/**
Description: This program says how far the current day is from the weekend.
Date: November 11, 2024
@author Daniella Pefanis
 */

public class Switch1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What day is it today?");
		String day = in.nextLine().toLowerCase();

		// Check how many days until the weekend
		switch (day) {
		case "monday":
			System.out.println("There are 5 days until the weekend.");
			break;
		case "tuesday":
			System.out.println("There are 4 days until the weekend.");
			break;
		case "wednesday":
			System.out.println("There are 3 days until the weekend.");
			break;
		case "thursday":
			System.out.println("There are 2 days until the weekend.");
			break;
		case "friday":
			System.out.println("There is 1 day until the weekend.");
			break;
		case "saturday":
		case "sunday":
			System.out.println("It's the weekend!");
			break;
		default:
			System.out.println("That's not a day. Enter a valid day of the week.");
		}

		in.close();
	}

//Run the program. Type in a number between 1-7, and then a number bigger than that. What is the result? When you run the program and enter a number between 1 and 7, it will show the day of the week that matches the number (for example, 1 will show "Sunday," 2 will show "Monday," etc.). If you enter a number bigger than 7 (like 8, 9, etc.), it will print "We don't have that day yet."
//What do you think default means? In a switch statement, the default case is used when none of the other cases match the input
//What do you think break means? What happens when you remove a break? In a switch statement the break keyword is used to stop the program from continuing to check the remaining cases once a match is found. If you remove the break, the program will continue to execute the next case, even if it has already matched a case. 


//Create another program, this time asking what day it is (String), and printing out how many days until the weekend

}
