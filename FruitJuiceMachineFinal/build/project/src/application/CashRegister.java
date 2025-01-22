/*
========================================================
CLASS NAME  :   CashRegister.java
DESCRIPTION :   a class for a built in cash register 
AUTHOR      :   Gillian, Florin, Kevin Mepieza, Gwynne Ouano
COPYRIGHT   :   Nov 26 2022
REVISION HISTORY
Date:           By:         Description:
 -				-				-
=========================================================
*/
package application;

public class CashRegister {
	private double cashOnHand;
	
	/**
	 * =====================================================================================================
	 * METHOD : CashRegister
	 * DESCRIPTION: Assigns 500 to cashOnHand. 
	 * PRE-CONDITION: cashOnHand -> 500
	 * ====================================================================================================
	 */	
	CashRegister(){
		this.cashOnHand=500;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : CashRegister
	 * DESCRIPTION: Assigns value to cashOnHand. 
	 * PRE-CONDITION: cashOnHand -> cashIn
	 * ====================================================================================================
	 */	
	CashRegister(int cashIn){
		this.cashOnHand=cashIn;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : getCurrentBalance
	 * DESCRIPTION: reads cashOnHand
	 * POST-CONDITION: returns cashOnHand
	 * ====================================================================================================
	 */	
	public double getCurrentBalance(){
		return this.cashOnHand;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : acceptAmount
	 * DESCRIPTION: reads change 
	 * PRE-CONDITION: change -> amountIn - cost
	 * 				  cashOnHand += cost
	 * POST-CONDITION: returns change 
	 * ====================================================================================================
	 */	
	public double acceptAmount(double amountIn, double cost){
		double change = amountIn - cost;
		this.cashOnHand+=cost;
		return change;
	}
}
