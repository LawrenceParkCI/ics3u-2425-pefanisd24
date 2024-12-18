package unit3;

/**
 * Description: This code uses a bunch of methods 
 * Date: December 17, 2024
 * author @Daniella Pefanis
 */

public class MathPlus {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	/**
	 * (Description)//Returns the distance between two points (double)
	 * 
	 * @param x1 -> x-coordinate of the first point
	 * @param y1 -> y-coordinate of the first point
	 * @param x2 -> x-coordinate of the second point
	 * @param y2 -> y-coordinate of the second point
	 * @return
	 */
	public static double distance(int x1, int y1, int x2, int y2) {
		// Calculate the differences in the x and y coordinates
		int dx = x2 - x1;
		int dy = y2 - y1;

		// Apply the distance formula
		return Math.sqrt(dx * dx + dy * dy);
	}

	/**
	 * (Description) // This method calculates the hypotenuse of a right triangle given the lengths of the two other sides (a and b).
	 * @param a -> length of one side of the triangle
	 * @param b -> length of the other side of the triangle
	 * @return the length of the hypotenuse (double)
	 */

	public static double hypotenuse(double a, double b) {
		//Pythagorean theorem
		return Math.sqrt(a * a + b * b);
	}


	/**
	 * (Description) // This method returns the factors of a given number.
	 * @param a ->  the number for which we need to find the factors
	 */

	public static int numOfFactors(int a) {
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		return count; 

	}



	/**
	 * (Description) //This method returns true if the number given is prime, and false otherwise (boolean)
	 * @param num -> The number that gets checked
	 * @return Checks if the number is prime, if not false
	 */

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * (Description)// Examples to test out methods
	 */
	public static void main(String[] args) {
		// Call the hypotenuse method with different side lengths
		double h1 = hypotenuse(3, 4);
		System.out.println("Hypotenuse of a triangle with sides 3 and 4: " + h1);
		
		//Example for isPrime
		System.out.println("Is 11 prime? " + isPrime(11)); 
		
		// Example of numOfFactors method
		System.out.println("Number of factors of 12: " + numOfFactors(12));
		
		//Example of distance between points
		System.out.println("Distance: " + distance (1,2,4,6));
		

	}
}






