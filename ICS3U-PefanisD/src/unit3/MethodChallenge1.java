package unit3;
/**
Description: This code calculates distance between two points. 
Date: December 16, 2024
@author Daniella Pefanis
*/

public class MethodChallenge1 {
   public static void main( String[] args )    {
       // Complete the function below. Don't forget to comment.
       double d1 = distance(-2,1 , 1,5);
       System.out.println(" (-2,1) to (1,5) => " + d1 );

       double d2 = distance(-2,-3 , -4,4);
       System.out.println(" (-2,-3) to (-4,4) => " + d2 );

       System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );

       System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
   }

 /**
 (Description)
 @param x1 -> x-coordinate of the first point
 @param y1 -> y-coordinate of the first point
 @param x2 -> x-coordinate of the second point
 @param y2 -> y-coordinate of the second point
 @return 
 */
   public static double distance( int x1, int y1, int x2, int y2 )
   {
	   // Calculate the differences in the x and y coordinates
       int dx = x2 - x1;
       int dy = y2 - y1;
       
       // Apply the distance formula
       return Math.sqrt(dx * dx + dy * dy);
   }
}