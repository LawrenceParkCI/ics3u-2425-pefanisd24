package unit2;

/**
	Name: Mr. Lee
	Date: Oct 29, 2021
	Description: Tracing through code
 */

public class Traced2 {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		int num = 500;

		// Run as long as num is greater than 1
		while (num > 1) {
			// If num is divisible by 2, divide it by 2
			if (num % 2 == 0) {
				num = num / 2;
			}
			// If num is divisible by 3 (and not divisible by 2), add 7
			else if (num % 3 == 0) {
				num = num + 7;
			}
			// If num is not divisible by 2 or 3, add 1
			else {
				num = num + 1;
				System.out.println(num);
			}
		}
	}
}