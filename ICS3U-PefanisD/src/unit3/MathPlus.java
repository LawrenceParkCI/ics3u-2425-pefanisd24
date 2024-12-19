package unit3;

import java.util.ArrayList;

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

		// Example of sum method
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println("Sum of the array: " + sum(numbers));

		// Example of sum method
		double[] numbers1 = {1.5, 2.5, 3.5};
		System.out.println("Sum of the array: " + sum(numbers1));  

		// Example of min method
		int[] numbers2 = {9, 3, 1, 5, 6};
		System.out.println("Index of smallest number: " + min(numbers2)); 

		// Example of max method
		int[] numbers3 = {9, 3, 12, 5};
		System.out.println("Index of largest number: " + max(numbers)); 

		// Example of max method
		double[] numbers4 = {9.5, 3.2, 12.5, 5.6};
		System.out.println("Index of largest number: " + max(numbers));  

		// Example of bigDifference method
		int[] numbers5 = {9, 3, 12, 5};
		System.out.println("Big difference between max and min: " + bigDifference(numbers)); 

		// Example of bigDifference method
		double[] numbers6 = {9.5, 3.2, 12.5, 5.6};
		System.out.println("Big difference between max and min: " + bigDifference(numbers)); 

		// Example of factors method
		int[] factorsOf12 = factors(12);
		System.out.print("Factors of 12: ");
		for (int factor : factorsOf12) {
			System.out.print(factor + " "); }

		// Example of listOfFactors method
		ArrayList<Integer> factorsOf121 = listOfFactors(12);
		System.out.println("Factors of 12: " + factorsOf121);

		// Example of factorial method
		System.out.println("Factorial of 5: " + factorial(5));


	}


	/**
	 * Description: Adds all the numbers in the array and returns the sum.
	 * @param numbers -> The array of integers to be summed.
	 * @return The sum of all integers in the array.
	 */

	public static int sum(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}


	/**
	 * Description:  Adds all the numbers in the array and returns the sum.
	 * @param numbers -> The array of doubles to be summed.
	 * @return The sum of all doubles in the array.
	 */

	public static double sum(double[] numbers) {
		double sum = 0;
		for (double num : numbers) {
			sum += num;
		}
		return sum;
	}

	/**
	 * Description: Returns the index of where the smallest number in the array is located.
	 * @param numbers -> The array of integers to be checked.
	 * @return The index of the smallest number in the array.
	 */
	
	public static int min(int[] numbers) {
		int minIndex = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < numbers[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	/**
	 * Description: Returns the index of where the smallest number in the array is located.
	 * @param numbers -> The array of doubles to be checked.
	 * @return The index of the smallest number in the array.
	 */

	public static int min(double[] numbers) {
		int minIndex = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < numbers[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	/**
	 * Description- Returns the index of where the largest number in the array is located.
	 * @param numbers -> The array of integers to be checked.
	 * @return The index of the largest number in the array.
	 */
	
	public static int max(int[] numbers) {
		int maxIndex = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	/**
	 * Description: Returns the index of where the largest number in the array is located.
	 * @param numbers -> The array of doubles to be checked.
	 * @return The index of the largest number in the array.
	 */
	
	public static int max(double[] numbers) {
		int maxIndex = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	/**
	 * Description: Returns the difference between the largest and smallest numbers in the array.
	 * @param numbers -> The array of integers to be checked.
	 * @return The difference between the largest and smallest numbers in the array.
	 */
	
	public static int bigDifference(int[] numbers) {
		int max = numbers[max(numbers)];
		int min = numbers[min(numbers)];
		return max - min;
	}

	/**
	 * Description: Returns the difference between the largest and smallest numbers in the array.
	 * @param numbers -> The array of doubles to be checked.
	 * @return The difference between the largest and smallest numbers in the array.
	 */
	
	public static double bigDifference(double[] numbers) {
		double max = numbers[max(numbers)];
		double min = numbers[min(numbers)];
		return max - min;
	}

	/**
	 * Description: Returns an array of all the factors of the given number.
	 * @param number -> The integer to find the factors of.
	 * @return An array containing all the factors of the given number.
	 */
	
	public static int[] factors(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		int[] factors = new int[count];
		int index = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors[index] = i;
				index++;
			}
		}
		return factors;
	}

	/**
	 * Description: Returns an ArrayList of all the factors of the given number.
	 * @param number -> The integer to find the factors of.
	 * @return An ArrayList containing all the factors of the given number.
	 */

	public static ArrayList<Integer> listOfFactors(int number) {
		ArrayList<Integer> factors = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}

	/**
	 * Description: Returns the factorial of the given number.
	 * Special cases factorial(1) = 1, factorial(0) = 1.
	 * @param number -> The number to find the factorial of.
	 * @return The factorial of the given number.
	 */
	
	public static long factorial(int number) {
		if (number < 0) {
			throw new ArithmeticException("Factorial is not defined for negative numbers.");
		}
		long result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}
	{
	} {
	}
}






