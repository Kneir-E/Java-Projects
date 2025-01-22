/*
========================================================
CLASS NAME  :   DispenserType
DESCRIPTION :   a Dispenser class to hold and release the products
AUTHOR      :   Gillian, Florin, Kevin Mepieza, Gwynne Ouano
COPYRIGHT   :   Nov 26 2022
REVISION HISTORY
Date:           By:         Description:
 -				-				-
=========================================================
*/
package application;

public class DispenserType {
	private int numberOfItems;
	private float cost;

	/**
	 * =====================================================================================================
	 * METHOD : DispenserType
	 * DESCRIPTION: Creates a DispenserType with set values to 50.
	 * ====================================================================================================
	 */
	DispenserType(){
		this.setCost(50);
		this.setNoOfItems(50);
	}

	/**
	 * =====================================================================================================
	 * METHOD : DispenserType
	 * DESCRIPTION: Creates a DispenserType with set values.
	 * ====================================================================================================
	 */
	DispenserType(int setNoOfItems, int setCost){
		this.setNoOfItems(setNoOfItems);
		this.setCost(setCost);
	}

	/**
	 * =====================================================================================================
	 * METHOD : setNoOfItems
	 * DESCRIPTION: assign value to numberOfItems
	 *  PRE-CONDITION: this.numberOfItems -> qtty
	 * ====================================================================================================
	 */
	private void setNoOfItems(int qtty){
		this.numberOfItems = qtty;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : setCost
	 * DESCRIPTION: assign value to cost
	 * PRE-CONDITION: this.cost -> cost
	 * ====================================================================================================
	 */
	private void setCost(int cost){
		this.cost = cost;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD :getNoOfItems
	 * DESCRIPTION: reads the number of Items
	 * POST-CONDITION: returns the number of Items
	 * ====================================================================================================
	 */
	public int getNoOfItems(){
		return this.numberOfItems;
	}

	/**
	 * =====================================================================================================
	 * METHOD : getCost
	 * DESCRIPTION: reads cost
	 * POST-CONDITION: returns cost
	 * ====================================================================================================
	 */
	public float getCost(){
		return this.cost;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : makeSale
	 * DESCRIPTION: decrements numberOfItems
	 * PRE-CONDITION: numberOfItems--
	 * ====================================================================================================
	 */
	public void makeSale() {
		this.numberOfItems--;
	}
}