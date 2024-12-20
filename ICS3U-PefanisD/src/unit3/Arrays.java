package unit3;
/**
    - Declaring and Initializing a pre-filled array
    - Using an element
    - Assigning a value in an element
    - Declaring and Initializing an empty array
    - Initializing the elements of the array
    - Printing an array
 * Date:
 * @author 
 */
public class Arrays {
	public static void main(String[] args) {
		/**
      Introduction
		 */
		/*
    Sometimes we want to store many values, but we don't want to
    create so many variables

    For example, we have almost 30 students in the class. It would
    take a long time to write the variables for all the students,
    let alone keeping their marks.
		 */

		/*
      This is why we can use an array - this allows us to refer to
      many of the same datatype using one name (identifier), and a number (index) for which one to use.

      To declare an array, we need the [] to indicate it is an array.
      The type of array needs to be stated as well.
		 */

		/**
      Declaring and Initializing a pre-filled array
		 */
		System.out.println("---------------------------------------------");
		System.out.println("Declaring and Initializing a pre-filled array");
		System.out.println("---------------------------------------------");
		//Declares and initializes an array with 3 values, or 3 *elements*
		String [] fruits = {"Apple","Banana","Lemon"};

		//Modify the array above by adding 2 more fruits to it
		fruits = new String[]{"Apple", "Banana", "Lemon", "Kiwi", "Strawberry"};


		//Declare and initialize an array of 3 marks (double data type)
		double[] marks = {85.5, 92.0, 78.5};

		// Printing the marks array
		 System.out.println("Updated Fruits Array:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	        
	        System.out.println("\nMarks Array:");
	        for (double mark : marks) {
	            System.out.println(mark);
	        }

			/**
      Using an element
			 */
			System.out.println();
			System.out.println("----------------");
			System.out.println("Using an element");
			System.out.println("----------------");
			//To use an element, we use the name(identifier) of the array,
			//and the numbered index of the elements.
			System.out.println(fruits[1]); 
			//What does it print out? Did it match what you think it should print?
			//It prints out Banana because it's at index 1

			//Try printing out the first and last fruit in the array
			   System.out.println();
		        System.out.println("-----------------------------");
		        System.out.println("Printing the First and Last Fruits");
		        System.out.println("-----------------------------");
		        System.out.println("First fruit: " + fruits[0]);  // First element
		        System.out.println("Last fruit: " + fruits[fruits.length - 1]);  // Last element 

			//Create a new variable called sum. add the values of the marks array to it, and print it out.


			/**
      Assigning a value in an element
			 */
			System.out.println();
			System.out.println("-------------------------------");
			System.out.println("Assigning a value in an element");
			System.out.println("-------------------------------");
			//To assign a value to a specific element, it is the same as for
			//when you use a variable
			//you need the variable name(identifier), and the index
			fruits[0] = "Mangosteen";
			System.out.println(fruits[0]);


			//Assign the 3rd mark to be 0

			/**
      Declaring and Initializing an empty array
			 */
			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.println("Declaring and Initializing an empty array");
			System.out.println("-----------------------------------------");
			//When declaring an array, it works just like any other variable.
			boolean [] isPassing;

			//When initializing the array, you are simply creating the space
			//in computer memory to store the values. The actual elements may not be
			//initialized, depending on the language.

			//this initialized the array to hold 5 elements
			isPassing = new boolean[5];

			System.out.println(isPassing[0]);
			String[] studentNames = new String[3];
			studentNames[0] = "Daniella";
			studentNames[1] = "Noa";
			studentNames[2] = "Ethan";
			System.out.println(studentNames[0]);


			//Declare and initialize an array of 3 student names

			//print out the first element. What does it say?
			 //It says the first name "Daniella"

			/*
      Initializing the elements of the array
			 */
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println("Initializing the elements of the array");
			System.out.println("--------------------------------------");
			//same as above
			//you need the variable name(identifier), and the index
			//Initialize the elements of the student names. Print them out.
			isPassing[0] = true;
			isPassing[1] = true;
			isPassing[2] = false;
			isPassing[3] = true;
			isPassing[4] = false;
			
			String[] studentNames1 = new String[3];
			studentNames[0] = "Emma";  // First student
			studentNames[1] = "Maddy";  // Second student
			studentNames[2] = "Ella"; // Third student
			
			System.out.println("Student Names:");
			System.out.println(studentNames[0]);
			System.out.println(studentNames[1]); 
			System.out.println(studentNames[2]); 
			

			/**
      Printing an array
			 */
			System.out.println();
			System.out.println("-----------------");
			System.out.println("Printing an array");
			System.out.println("-----------------");

			System.out.println(isPassing);
			//What do you see printed? Is it useful for us? 
			//When you print an array directly you see something like the array's memory address a code. This is not useful if you want to display the actual values inside the array.

			//How do you think we can print out each element of the array?
			//To print the individual elements of the array, you need to loop through the array and print each element using either a standard for loop or an enhanced for loop.
		}
	} 