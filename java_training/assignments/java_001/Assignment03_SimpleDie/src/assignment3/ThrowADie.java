package assignment3;

import java.util.Scanner;

public class ThrowADie {

	public static void main(String[] args) {
		// created a Scanner object to be able to accept input
		Scanner sc = new Scanner(System.in);
		// created a boolean variable and set it equal to true
		boolean play = true;
		// created a null String variable named quit
		String quit = null;
		// created a null String variable named playAgain
		String playAgain = null;
		// created a null integer variable named roll
		int die = 0;
		
		// while play is true the loop will continue iteration
		while(play) {
			System.out.println("Press any key to throw a die and press Enter (or Q and Enter to quit)");
			// quit is assigned to the users input
			quit = sc.next();
			// change the string value to all uppercase
			quit.toUpperCase();
			// the if statement checks if the first character is a capital 'Q' or the string assigned to
			// the word "quit"
			if(quit.charAt(0) == 'Q'|| quit.equals("quit")) {
				// assigns play the value of false to end loop
				play = false;
			} else {
				// assigns a random number to die between 1 and 6
				die = (int) (Math.random() *6) + 1;
				// prints the random number selected to the console in a statement
				System.out.printf("You have rolled a %d\n", die);
				System.out.println("Play Again? (Y or y) and Enter, any other key and Enter to Quit");
				// assigns playAgain to the user input
				playAgain = sc.next();
				// the if statement checks if the first character is a capital or lowercase 'y'
				if(playAgain.charAt(0) == 'y' || playAgain.charAt(0) == 'Y') {
					// assigns play the value of false to end loop
					play = true;
				} else {
					// assigns play the value of false to end loop
					play = false;
				}// End of else
			}// End of else
		}// End of while
	}// End of main
}// End of class
