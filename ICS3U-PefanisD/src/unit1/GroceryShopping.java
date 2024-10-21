package unit1;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.time.LocalDateTime;

public class GroceryShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		
		
		//Variables
		String item1, item2;
		double itemPrice1, itemPrice2;
		int itemAmnt1, itemAmnt2;
		 System.out.println("|| $$$ \\\\\\ ========== \"Daniella's Grocery\" ========== /// $$$ ||");
		 System.out.println("");
		 System.out.println("\nHello Customer!");
			System.out.print("What would you like to buy? ");
			item1 = sc.nextLine();
			System.out.print("How much does it cost? $");
			itemPrice1 = sc.nextDouble();
			System.out.print("How many are you buying? ");
			itemAmnt1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Perfect!");
			System.out.println("");
			System.out.print("What would you like to buy? ");
			item2 = sc.nextLine();
			System.out.print("How much does it cost? $");
			itemPrice2 = sc.nextDouble();
			System.out.print("How many are you buying? ");
			itemAmnt2 = sc.nextInt();
			sc.nextLine();
			System.out.println("Amazing, Thank You!");
			System.out.println("");
			System.out.format("Here is your reciept:\n\n\n");
			sc.close();
		

			System.out.format("%24s"+ "Daniella" + "'s Groceries\n\n", "");
				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
				LocalDateTime now = LocalDateTime.now(); 
				System.out.println(dtf.format(now));

				double itemTotalPrice1 = itemPrice1*itemAmnt1, itemTotalPrice2 = itemPrice2*itemAmnt2,
						cost = itemTotalPrice1 + itemTotalPrice2, tax = 0.13, total = cost + cost*tax, taxAmnt = cost*tax;
				
				NumberFormat money = NumberFormat.getCurrencyInstance();
				NumberFormat percent = NumberFormat.getPercentInstance();
				NumberFormat percentage = NumberFormat.getPercentInstance();

				System.out.format("\n%19s|%20s|%19s|%18s\n", "Item", "Price", "Quant.","Total");
				System.out.format("\n%19s|%20s|%19s|%18s\n", "Item   ", "Price   ", "Quant.   ","Total   ");
				System.out.println("-------------------------------------------------------------------------------");
				System.out.format("%-19s|%20s|%19d|%18s\n", item1, money.format(itemPrice1), itemAmnt1, money.format(itemTotalPrice1));
				System.out.format("%-19s|%20s|%19d|%18s\n", item2, money.format(itemPrice2), itemAmnt2, money.format(itemTotalPrice2));
				System.out.println("-------------------------------------------------------------------------------");
				System.out.format("\n%61s%18s","Subtotal:",money.format(cost));
				System.out.format("\n%61s%18s","Tax:",money.format(taxAmnt));
				System.out.format("\n%61s%18s","Tax ("+ percentage.format(tax)+"):",money.format(taxAmnt));
				System.out.format("\n%61s%18s","Total:",money.format(total));
				System.out.format("\n\n%63s","Thank you so much for shopping at " + "Daniella" + "'s groceries. Please come back again, and let us know how we did!");




	}

}
