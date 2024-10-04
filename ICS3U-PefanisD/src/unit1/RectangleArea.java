package unit1;
/**
 * Description: This code prints Area and Volume of a rectangle
 * Date: October 3, 2024
 * @author Daniella Pefanis
 */

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

//declare variables
int length, width, depth;

//get the user input
System.out.println ("AREA PROGRAM");
System.out.print("Type in the length of the rectangle and <Enter>");
length = sc.nextInt();

System.out.print("Type in the width of the rectangle and <Enter>: ");
width = sc.nextInt();

System.out.print("Type in the depth of the rectangle and <Enter>: ");
depth = sc.nextInt();

//calculate the area 
int volume = length * width * depth;

//print the output
System.out.println("The volume of your rectangle is " + volume);
sc.close();
	}

}
