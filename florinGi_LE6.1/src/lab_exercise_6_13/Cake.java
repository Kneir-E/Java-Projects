package lab_exercise_6_13;

/**
===========================================================================================
 CLASS NAME	: Cake
 DESCRIPTION: A class that creates a cake object
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 11/28/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */
public class Cake {
	/* =====================================================================================================
	 * Data fields
	 * Class also inherits the superclass data fields
	 * ====================================================================================================*/
	protected String name;
	protected double rate;
	
	/* =====================================================================================================
	 * Constructor
	 * DESCRIPTION: sets value to the number data field
	 * ====================================================================================================*/
	public Cake(String n, double r) {
		name = n;
		rate = r;
	}
	
	/* =====================================================================================================
	 * METHOD : calcPrice
	 * DESCRIPTION: calculates the price
	 * POST-CONDITION: 	returns the price
	 * ====================================================================================================*/
	public double calcPrice() {
		return 0;
	}
	
	/* =====================================================================================================
	 * METHOD : toString
	 * DESCRIPTION: returns details
	 * POST-CONDITION: 	returns the price
	 * ====================================================================================================*/
	public String toString() {
		return name + "\t" + rate;
	}
}
