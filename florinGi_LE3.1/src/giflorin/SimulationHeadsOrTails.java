package giflorin;

/**
===========================================================================================
 CLASS NAME	: SimulationHeadsOrTails
 DESCRIPTION: Simulates a coin flip 2 million times then prints the number of heads and tails
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 9/13/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class SimulationHeadsOrTails {

	/**
	=====================================================================================================
	 METHOD	: main
	 DESCRIPTION: Simulates a coin flip 2 million times then prints the number of heads and tails
	 ====================================================================================================
	 */
	public static void main(String[] args) {
		System.out.println("Flipping a coin 2 million times");
		long i, heads=0, tails=0;
		int a;
		//int a =  (int)(Math.random() * (2));
		//System.out.print("Values: "+ i + a);
		
		for(i=0;i<2000000;i++) {
			a =  (int)(Math.random() * (2));
			if(a%2==0) {
				heads++;
			}else {
				tails++;
			}
		}
		
		System.out.println("There are "+ heads + " heads and " + tails + " tails");
		//System.out.println("Total" + (heads+tails));
	}

}
