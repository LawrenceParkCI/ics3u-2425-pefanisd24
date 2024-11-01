package unit1;
/**
 * Description: This code prints two floating point numbers
 * Date: October 3, 2024
 * @author Daniella Pefanis
 */
 

import java.util.Scanner;

public class InputFP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Declare variable
		double num1, num2;
		
		//receive user input
		System.out.println("Type in one floating point number");
		num1 = sc.nextDouble();
		System.out.println("Type in another floaing point number");
		num2 = sc.nextDouble();
		
		//print the output
		System.out.println();
		System.out.println("The first number entered was " + num1);
		System.out.println("The second number entered was " + num2);
		sc.close();
	}

}
