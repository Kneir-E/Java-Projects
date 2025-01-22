package florinGi;

import javax.swing.JOptionPane;

/**
 * ===========================================================================================
 * CLASS NAME : Hangman DESCRIPTION: Part of a program that executes a hangman
 * game. This class contains the other necessary methods. AUTHOR : Gillian E.
 * Florin COPYRIGHT : Created 9/19/2022 REVISION HISTORY: Date: By: Description:
 * ===========================================================================================
 */

public class Hangman {

	/**
	 * =====================================================================================================
	 * METHOD : game DESCRIPTION: Executes a hangman game. PRE-CONDITION: Requires
	 * the string to guess to be initialized POST-CONDITION: Returns the number of
	 * mistakes. Returns -1 if closed.
	 * ====================================================================================================
	 */
	public int game(String answer) {
		int mis = 0, i = 0;
		char g;
		boolean isDone = false, isFound = false;
		char[] current = answer.toCharArray();
		String message, temp = null, guesses = null;

		for (i = 0; i < answer.length(); i++)
			current[i] = '*';

		while (!isDone) {
			temp = null;
			isFound = false;
			message = "Guess: " + String.valueOf(current);
			System.out.println(message);
			temp = JOptionPane.showInputDialog(null, message, "Guess", JOptionPane.QUESTION_MESSAGE);
			if (temp == null)
				break;
			if(temp.length()>1||temp.length()==0) {
				message = "Please input one character, no more no less";
				System.out.println(message);
				JOptionPane.showMessageDialog(null, message, "Error", 1, null);
				continue;
			}
			temp = temp.toLowerCase();
			g = temp.charAt(0);

			if (!(g >= 'a' && g <= 'z')) {
				JOptionPane.showMessageDialog(null, "Please input only letters", "Wrong Input", 1, null);
				System.out.println("Please input only letters");
				continue;
			} else if (isAlreadyGuessed(guesses, g)) {
				JOptionPane.showMessageDialog(null, "You already guessed this letter", "Already guessed", 1, null);
				System.out.println("You already guessed this letter");
				continue;
			} else {
				isFound = isPresent(answer, current, g);
				guesses = guesses + g;
			}

			if (!isFound)
				mis++;
			if (answer.equals(String.valueOf(current)))
				isDone = true;
		}

		if (temp == null)
			mis = -1;
		return mis;
	}

	/**
	 * =====================================================================================================
	 * METHOD : isAlreadyGuessed DESCRIPTION: Checks if an input has already been
	 * guessed. PRE-CONDITION: Requires the string of guesses and the character
	 * containing the current guess. POST-CONDITION: Returns true if the character
	 * has been guessed, false if otherwise.
	 * ====================================================================================================
	 */

	public boolean isAlreadyGuessed(String guesses, char g) {
		if (guesses == null)
			return false;
		int i;
		boolean isFound = false;
		for (i = 0; i < guesses.length(); i++) {
			if (guesses.charAt(i) == g) {
				isFound = true;
				break;
			}
		}
		return isFound;
	}

	/**
	 * =====================================================================================================
	 * METHOD : isPresent DESCRIPTION: Checks if an input is in the string
	 * PRE-CONDITION: Requires the string to guess, the char array of the current
	 * correct guesses, and the character containing the current guess.
	 * POST-CONDITION: Returns true if the character is in the String to guess,
	 * false if otherwise.
	 * ====================================================================================================
	 */
	public static boolean isPresent(String answer, char[] current, char g) {
		int i;
		boolean isFound = false;
		for (i = 0; i < answer.length(); i++)
			if (answer.charAt(i) == g) {
				current[i] = g;
				isFound = true;
			}
		return isFound;
	}

}
