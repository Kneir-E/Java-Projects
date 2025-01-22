package lab_exercise_6_13;

/**
===========================================================================================
 CLASS NAME	: Ready,madeCake
 DESCRIPTION: A class that creates an readymade cake object. Extends cake class
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 11/28/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */
public class ReadymadeCake extends Cake {
	/* =====================================================================================================
	 * Data fields
	 * Class also inherits the superclass data fields
	 * ====================================================================================================*/
	protected int quantity;
	
	/* =====================================================================================================
	 * Constructor
	 * DESCRIPTION: sets value to the number data field
	 * ====================================================================================================*/
	ReadymadeCake(String name, double rate, int qtty){
		super(name,rate);
		this.setQuantity(qtty);
	}
	
	/* =====================================================================================================
	 * SETTER METHOD
	 * DESCRIPTION: sets values to data fields
	 * ====================================================================================================*/
	public void setQuantity(int qtty) {
		this.quantity=qtty;
	}
	
	/* =====================================================================================================
	 * GETTER METHOD
	 * DESCRIPTION: returns data field values
	 * ====================================================================================================*/
	public int getQuantity() {
		return this.quantity;
	}
	
	/* =====================================================================================================
	 * METHOD : calcPrice
	 * DESCRIPTION: calculates the price
	 * POST-CONDITION: 	returns a double containing the price
	 * ====================================================================================================*/
	@Override
	public double calcPrice() {
		return this.rate*this.quantity;
	}
}
