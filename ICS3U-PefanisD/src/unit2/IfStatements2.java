package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author
 */
/*
public class IfStatements2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your age?");
		int userAge = in.nextInt();
		/*
    if (userAge > 18) { //If they're over 18, they are titled an adult
      String title = "Adult";
    } else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
    }

    System.out.println(title);
 */
//Looking at the logic above, why do you think the 
//program won't work? 
//I think this program won't work because when you create the `title` variable inside the `if` block, it only exists within that block and disappears once the block ends. So trying to use it outside the block causes an error because it no longer exists.

//Copy the code below, and try to find a solution.
//Comment the code above to avoid compilation errors.

public class IfStatements2 {
	private static Scanner sc;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your age?");
		int userAge = in.nextInt();


		String title = ""; 

		if (userAge > 18) { // If the user is over 18, set the title to "Adult"
			title = "Adult";
		} else {  // If the user is 18 or younger, print a message.
			System.out.println("Sorry, not quite yet.");
		}


		System.out.println(title);
		sc.close();
	}
}