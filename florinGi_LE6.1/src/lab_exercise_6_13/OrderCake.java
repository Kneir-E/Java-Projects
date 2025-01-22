package lab_exercise_6_13;

/**
===========================================================================================
 CLASS NAME	: OrderCake
 DESCRIPTION: A class that creates an order cake object. Extends cake class
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 11/28/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */
public class OrderCake extends Cake{
	/* =====================================================================================================
	 * Data fields
	 * Class also inherits the superclass data fields
	 * ====================================================================================================*/
	protected double weightkg;
	
	/* =====================================================================================================
	 * Constructor
	 * DESCRIPTION: sets value to the number data field
	 * ====================================================================================================*/
	OrderCake(String name, double rate, double weight){
		super(name, weight);
		this.setWeight(weight);
	}
	
	/* =====================================================================================================
	 * SETTER METHOD
	 * DESCRIPTION: sets values to data fields
	 * ====================================================================================================*/
	public void setWeight(double weight) {
		this.weightkg=weight;
	}
	
	/* =====================================================================================================
	 * GETTER METHOD
	 * DESCRIPTION: returns data field values
	 * ====================================================================================================*/
	public double getWeight() {
		return this.weightkg;
	}
	
	/* =====================================================================================================
	 * METHOD : calcPrice
	 * DESCRIPTION: calculates the price
	 * POST-CONDITION: 	returns a double containing the price
	 * ====================================================================================================*/
	@Override
	public double calcPrice() {
		return this.rate*this.weightkg;
	}
}
