package florinGi;

import javax.swing.JOptionPane;

/**
===========================================================================================
 CLASS NAME	: Hangman
 DESCRIPTION: Part of a program that executes a game of craps. This class contains the other necessary methods.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 9/19/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class Craps {
	
	/**
	=====================================================================================================
	 METHOD	: rand
	 DESCRIPTION: gives a random number based on the input.
	 PRE-CONDITION: min - defines the minimum of the random number
	 				max - defines the maximum of the random number
	 POST-CONDITION: Returns the a random number from min to max
	 ====================================================================================================
	 */
	public static int rand(int min, int max){
		int a =  (int)(Math.random()*(max-min+1))+1;
		return a;
	}
	
	/**
	=====================================================================================================
	 METHOD	: rollDice
	 DESCRIPTION: Simulates the roll of two dices and displays the output.
	 PRE-CONDITION: no - shows whether it's the 1st or 2nd roll
	 POST-CONDITION: Displays the rolls and the sum then returns the sum.
	 ====================================================================================================
	 */
	public int rollDice(int no) {
		String message;
		int a=rand(1,6);
		int b=rand(1,6);
		int sum = a+b;
		message = "Roll no. "+no+": You rolled " + a + " + " + b + " = "+ sum;
		System.out.println(message);
		JOptionPane.showConfirmDialog(null, 
				message, 
				"Game: Craps - Roll no. "+no, 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.INFORMATION_MESSAGE);
		return sum;
	}

}
