package unit1;
/**
 * Description: This code spells words in numbers
 * Date: October 4, 2024
 * @author Daniella Pefanis
 */

import java.util.Scanner;

public class InputChars {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch1, ch2, ch3;
		System.out.println("Type in any three characters on the keyboard");
		System.out.println("Press <Enter> after each.");
		ch1 = sc.nextLine () .charAt (0);
		ch2 = sc.nextLine () .charAt (0);
		ch3 = sc.nextLine () .charAt (0);
		System.out.println();
		System.out.print("Together these 3 letters spell: " + (ch1 + ch2 + ch3));




	}

}
