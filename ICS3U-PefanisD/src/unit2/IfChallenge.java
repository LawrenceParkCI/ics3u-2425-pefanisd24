package unit2;

import java.util.Scanner;

/**
 * Description: This code prints a certain phrase depending on the number
 * Date: November 5, 2024
 * @author Daniella Pefanis
 */

public class IfChallenge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		System.out.println("What is your favourite number?");
		int favNumber = in.nextInt();

		if (favNumber<0) {
			System.out.println("You need to look on the bright side!");
		}

		if (favNumber % 2 != 0) {
			System.out.println("That's a bit strange!");
		}

		if (favNumber % 3 == 0 && favNumber % 2 == 0) {
			System.out.println("You should really consider thinking about 6.");
		} else {
			System.out.println("You can keep wholesome.");
		}

		int onesDigit = favNumber % 10;
		if (onesDigit == 8) {
			System.out.println("I too am full!");
		} else if (onesDigit == 9) {
			System.out.println("Canada is a nice country.");
		} else {
			System.out.println("Don't count on it.");

		}

	}
}


/*

    (IF)

    //ask for the user's favourite number.
    if the number is negative, say that they need to look on
    the bright side.  If their number is odd, say that it's a 
    bit strange.

    (IF, ELSE)

    If their number is divisible by 3 and by 2, 
    say that they should really consider thinking about 6, 
    otherwise say they can keep wholesome.  

    (IF, ELSE IF, ELSE)

    Finally, if the 
    ones digit of the number is 8, say that you too are full, 
    if the ones digit is 9, say Canada is a nice country, 
    and any other number should result in "don't count on 
    it". 
 */