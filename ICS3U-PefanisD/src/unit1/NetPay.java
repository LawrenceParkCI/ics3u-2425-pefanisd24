package unit1;
/**
 * Description: This code calculates net pay.
 * Date: October 8, 2024
 * @author Daniella Pefanis
 */

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		//declare variables
		int hours, wage,insurance;
		double tax;

		//get the user input
		System.out.println("Net Pay");
		System.out.print("Type in the hours your employee or you worked and <Enter>:");
		hours = sc.nextInt();

		System.out.print("Type in your hourly wage and <Enter>:");
		wage = sc.nextInt();

		System.out.print("Type in the insurance deduction and <Enter>:");
		insurance = sc.nextInt();

		System.out.print("Type in the tax percentage deduction and <Enter>:");
		tax = sc.nextDouble();

		//calculate the area
		double netpay = (hours * wage - insurance) - tax * (hours * wage - insurance);

		//print the output
		System.out.println("Your netpay is " + netpay);
		sc.close();

	}

}
