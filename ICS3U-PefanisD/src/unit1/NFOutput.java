package unit1;
/**
 * Description: NFOutput Assignment
 * Date: October 17, 2024
 * @author Daniella Pefanis
 */
import java.text.DecimalFormat;
/**
 * Description: NFOUtput Worksheet
 * Date: October 17, 2024
 * @author Daniella Pefanis
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class NFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));

		//How can you change how your value is displayed?
		//You can use decimal format instead of percentage to display the tax. 
		//NumberFormat money = NumberFormat.getCurrencyInstance();

		//What other formats does NumberFormat offer?
		//Number format offers percentage, decimal formats, NumberFormat.getAvailableLocales(), NumberFormat.FRACTION_FIELD, NumberFormat.INTEGER_FIELD, NumberFormat.getAvailableLocales(), NumberFormat.getCompactNumberInstance(null, null), NumberFormat.getCurrencyInstance(), NumberFormat.getCurrencyInstance(null)

		sc.close();
	}

}
