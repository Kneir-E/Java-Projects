package florinGi;

import javax.swing.JOptionPane;

/**
===========================================================================================
 CLASS NAME	: TestHangman
 DESCRIPTION: Contains the main method for the program that executes a hangman game.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 9/19/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class TestHangman {
	
	/**
	=====================================================================================================
	 METHOD	: main
	 DESCRIPTION: Executes a hangman game.
	 ====================================================================================================
	 */
	public static void main(String[] args) {
		String[] words = {"power", "construct", "triage", "libero", "serene", "grace", "pixilate", "mirror", "armor", "forecast"};
		String temp;
		boolean isDone=false;
		int mistakes;
		
		Hangman hang = new Hangman();
		
		while(!isDone) {
			temp = words[(int)(Math.random()*10)];
			
			//temp = word[number]
			
			mistakes = hang.game(temp);
			
			if(mistakes==-1) {
				System.out.println("\nYou ended the game.");
				break;
			}
			
			temp="The word is " + temp + ". You missed " + mistakes + " time.\nDo you want to guess another word?";
			System.out.println(temp);
			if(JOptionPane.showConfirmDialog(null, temp, "Play again?", JOptionPane.OK_OPTION)!=0)
				isDone=true;
		}
	}
}
