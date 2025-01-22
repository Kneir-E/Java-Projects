package lab_exercise_6_12;

import java.util.ArrayList;

/**
===========================================================================================
 CLASS NAME	: NumToFindSquareFactor
 DESCRIPTION: A class that creates a number object to find the
 					square factor
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 11/28/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class NumToFindSquareFactor {
	/* =====================================================================================================
	 * Data fields
	 * Class also inherits the superclass data fields
	 * ====================================================================================================*/
	private int number;
	private ArrayList<Integer> primeFactors=new ArrayList<Integer>();
	
	/* =====================================================================================================
	 * No Arg Constructor
	 * DESCRIPTION: sets 1 to the number data field
	 * ====================================================================================================*/
	NumToFindSquareFactor(){
		this(1);
	}
	
	/* =====================================================================================================
	 * Constructor
	 * DESCRIPTION: sets values into the data fields
	 * PRE-CONDITION: num - an integer to find the square factor of	
	 * ====================================================================================================*/
	NumToFindSquareFactor(int num){
		this.setNum(num);
		this.setPrimeFactors();
	}
	
	/* =====================================================================================================
	 * SETTER METHODS 
	 * DESCRIPTION: sets values to data fields
	 * ====================================================================================================*/
	public void setNum(int num) {
		this.number = num;
	}
	
	public void setPrimeFactors() {
		int y = this.getNum();
		for(int i = 2; i <= y; i++) {
			while( y%i == 0) {
				this.primeFactors.add(i);
				y = y/i;
			}
		}
	}
	
	/* =====================================================================================================
	 * GETTER METHODS
	 * DESCRIPTION: returns data field value
	 * ====================================================================================================*/
	public int getNum() {
		return this.number;
	}
	
	public ArrayList<Integer> getPrimeFactors(){
		return this.primeFactors;
	}
	
	/* =====================================================================================================
	 * METHOD : getSquareFactor
	 * DESCRIPTION: calculates the square factor
	 * POST-CONDITION: 	returns the square factor
	 * ====================================================================================================*/
	public int getSquareFactor() {
		int i=0;
		int current=2;
		int count=0;
		int squareFactor=1;
		while(i<this.getPrimeFactors().size()) {
			while(this.getPrimeFactors().get(i)==current) {
				count++;
				if(++i>=this.getPrimeFactors().size()) break;
			}
			if(count%2==1)squareFactor*=current;
			count=0;
			current++;
		}
		return squareFactor;
	}
}
