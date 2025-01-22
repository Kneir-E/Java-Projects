package florinGi;

import javax.swing.JOptionPane;

/**
===========================================================================================
 CLASS NAME	: TestCraps
 DESCRIPTION: Contains the main method for the program that executes a game of craps.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 9/19/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class TestCraps {
	
	/**
	=====================================================================================================
	 METHOD	: main
	 DESCRIPTION: Executes a game of craps.
	 ====================================================================================================
	 */
	public static void main(String[] args) {
		int sum = 0, sum2=0, i=1;
		boolean isDone = false;
		String message=null;
		
		Craps ptr = new Craps();
		
		while(!isDone) {
			sum = ptr.rollDice(i++);
			
			//sum = rollDice(1,5,3);
			//sum = rollDice(2,1,6);
						
			if(sum==sum2||sum==11) {
				System.out.print("You Win");
				message="You Win";
			}else if(sum==7||(sum2!=0&&sum2!=sum)){
				System.out.print("You Lose");
				message="You Lose";
			}else if(sum2==0) {
				sum2=sum;
				continue;
			}
			isDone=true;
		}
		JOptionPane.showConfirmDialog(null, 
				message, 
				"Game: Craps - Result", 
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
	}
	
}
