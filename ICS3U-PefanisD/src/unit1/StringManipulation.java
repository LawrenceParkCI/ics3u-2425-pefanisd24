package unit1;
/**
 * Description: this code prints a sentence in regular caps, all caps, low caps, states how many characters the sentence is, and states what character is displayed at index 5.
 * Date: October 8, 2024
 * @author Daniella Pefanis
 */
import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				
				//Declare variables
				String sentence;
				
				//Receive user input
				System.out.println("Type in a sentence");
				sentence = sc.nextLine();
				
				//print output
				System.out.println("\nThe following has been printed");
				System.out.println("\n" + sentence);
				System.out.println(sentence.toUpperCase());
				System.out.println(sentence.toLowerCase());
				System.out.println("The sentence is " + sentence.length() + " characters long");
				System.out.println("At index 5, the character displayed is:" + sentence.charAt(5));
				sc.close();
				
				//BONUS
				  String firstSentence = "Output just the first word of the String";
			        String lastSentence = "Output just the last word of the String";
				 // Print the first word
		        System.out.println(firstSentence.split(" ")[0]); // Output: Output
		        
		        // Print the last word
		        System.out.println(firstSentence.split(" ")[firstSentence.split(" ").length - 1]); // Output: String
		        
		        // Print the first word of the last sentence
		        System.out.println(lastSentence.split(" ")[0]); // Output: Output
		        
		        // Print the last word of the last sentence
		        System.out.println(lastSentence.split(" ")[lastSentence.split(" ").length - 1]); // Output: String
		    }


	}

