package unit2;

/**
 * Description:
 * Date:
 * @author
 */
public class DoubleDiceContest {

	public static void main(String[] args) {

		//declare variables
		int die1, die2, die3, die4;

		//Human dice roll
		System.out.println("Roll a die");
		die1 = (int)(Math.random()*6)+1;
		System.out.println(die1);
		System.out.println("Roll another die.");
		die2 = (int)(Math.random()*6)+1;
		System.out.println(die2);
		System.out.println("Your human score is " + (die1+die2));

		//Computer dice roll
		System.out.println("");
		System.out.println("Computer roll");
		die3 = (int)(Math.random()*6)+1;
		System.out.println(die3);
		System.out.println("Roll another die.");
		die4 = (int)(Math.random()*6)+1;
		System.out.println(die4);
		System.out.println("Your computer score is " + (die3+die4));

		System.out.println(2);
		if (die1+die2<die3+die4) {
		System.out.println("You win!"); 
	}
	else {
	System.out.println("Computer Wins!");
	}
}
}



/*
 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
 * The program should output the total of the two dice for both the user and the computer, 
 * then announce who won: the computer, the user, or say it was a tie.
 */




