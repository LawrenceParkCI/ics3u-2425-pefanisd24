package unit2;

import java.util.Scanner;
/**
 * Description: This program takes an integer and determines if it's positive or negative, then if it is divisible by 7.
 * Date: November 4, 2024
 * @author Daniella Pefanis
 */

public class PositiveNegative {


	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int posNeg;


		System.out.println("Please input an integer and <Enter>");
		posNeg = sc.nextInt();

		//Determines if the number is positive or negative
		if (posNeg == 0) {
			System.out.println("Your number is not negitive noror positive. It is 0,");
		}
		else{
			if (posNeg > 0) {
				System.out.println("Your number is positive.");
			}
			else{
				System.out.println("Your number is negitive.");
			} 

		}

		//Says if the number can be divided by 7
		if (posNeg % 7 == 0){
			System.out.println("Your number can be divided by 7 :)");
		}
		else{
			System.out.println("Your number can't be divided by 7 :(");
		}

		sc.close();

	}

}