package unit2;
// TODO Auto-generated method stub
/**
 * Description:
 * Date: November 4, 2024
 * @author Daniella Pefanis
 */

public class BasicBoolean {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		//we've declared a variable called isPurple of boolean type
		//Recall: boolean holds either yes or no
		boolean isPurple = false;


		/*
		      Boolean Operators, Expressions
		 */

		//boolean expressions are ways we can "calculate" whether
		//something is true or false

		int firstNum = 5;
		int secondNum = 10;
		double thirdNum = 5.5;

		//this prints out true because second number is bigger than first
		System.out.println("1: " + (firstNum < secondNum)); 

		//this prints out false because first number isnt bigger than second
		System.out.println("2: " + (firstNum > secondNum)); 

		//this prints out true because first number is equal to or greater than third
		System.out.println("3: " + (firstNum <= (int)thirdNum)); 
		//this prints out true because equal to or greater than third
		System.out.println("4: " + (firstNum <= thirdNum)); 

		/*Test out these boolean operators. Figure out the meaning
		 * > means: greater than
		 * < means: less than
		 * <= means:less than or equal to
		 * >= means: greater than or equal to
		 * == means: equal to
		 * != means: not equal to
		 */

	}
}