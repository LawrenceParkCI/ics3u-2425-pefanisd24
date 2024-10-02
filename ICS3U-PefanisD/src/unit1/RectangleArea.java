package unit1;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

//declare variables
int length, width;

//get the user input
System.out.println ("AREA PROGRAM");
System.out.print("Type in the length of the rectangle and <Enter>");
length = sc.nextInt();

System.out.print("Type in the width of the rectangle and <Enter>: ");
width = sc.nextInt();

//calculate the area 
int area = length * width;

//print the output
System.out.println("The area of your rectangle is" + area);
sc.close();
	}

}
