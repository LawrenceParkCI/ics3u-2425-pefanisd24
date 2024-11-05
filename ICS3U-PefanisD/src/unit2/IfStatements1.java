package unit2;

/**
 * Description: This code prints statements according to if statements.
 * Date: November 5, 2024
 * @author Daniella Pefanis
 */

public class IfStatements1 {
	public static void main(String[] args) {
		int firstNum = 10;
		int secondNum = 30;

		System.out.println("Part 1: If");
		System.out.println("----------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGLUL");
		}    

		//What prints out? Why?
		// "Part 1: If" only prints because nothing inside the if block is executed.
		//-------------
		System.out.println("\nPart 2: If, Else");
		System.out.println("----------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why? This prints out because the code inside the else block is executed since the if condition is false
		//Part 2: If, Else
		//----------------
		//XQCL

		System.out.println("\nPart 3: If, Else if, Else");
		System.out.println("-------------------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why? Since the else if condition is true the code inside it will execute, and sykSHY prints
		//Part 3: If, Else if, Else
		//-------------------------
		//sykSHY

		System.out.println("\nPart 4: What's the difference?");
		System.out.println("------------------------------");
		System.out.println(1);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		System.out.println(2);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		}

		if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		}

		if (!(firstNum < secondNum)) {
			System.out.println("XQCL");
		}

		//What prints out? Why? 
		//What is the difference between the first and second part?

		//Part 4: What's the difference?
		//------------------------------
		//1
		//KEKW
		//OMEGALUL
		//2
		//KEKW
		//OMEGALUL
		//sykSHY

		//SECTION 1:
		//It prints "XQCL" only if the if condition (firstNum < secondNum) is false and neither of the conditions in the else if block are true. But since firstNum < secondNum is true, it enters the first block and does not reach the else part. No "XQCL" is printed.

		//SECTION 2:
		//"KEKW" and "OMEGALUL" are printed because the first condition (firstNum < secondNum) is true.
		//"sykSHY" is printed because the second condition (firstNum % 2 == 0 && secondNum % 3 == 0) is also true.
		//"XQCL" is not printed because the condition !(firstNum < secondNum) is false.





	}
}