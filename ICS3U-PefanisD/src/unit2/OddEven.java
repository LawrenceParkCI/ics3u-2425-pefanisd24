package unit2;

import java.util.Scanner;

/**
 * Description: Calculates if any integer entered is odd or even.
 * Date: November 4, 2024
 * @author Daniella Pefanis
 */
public class OddEven {
	private int number;

	public OddEven (int number) {
		this.number = number;
	}
	//This calculates if the integer is odd or even
	public void CheckOddEven() {
		if (number % 2==0) {
			System.out.println(number + " is an even number");
		} else {
			System.out.println (number + " is an odd number");
		}
	}

	/**
	 * Entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter an integer:");
		int num = scanner. nextInt();

		OddEven oddevenChecker = new OddEven(num);
		oddevenChecker.CheckOddEven();
		scanner.close();


	}

}
