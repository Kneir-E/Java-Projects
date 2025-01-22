package lab_exercise_6_11;

/**
===========================================================================================
 CLASS NAME	: Staff
 DESCRIPTION: A class that creates an object staff which extends the employee class.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 11/28/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class Staff extends Employee {
	/* =====================================================================================================
	 * Data field
	 * Class also inherits the superclass data fields
	 * ====================================================================================================*/
	public String title;
	
	/* =====================================================================================================
	 * No Arg Constructor
	 * DESCRIPTION: sets base value to the data fields
	 * ====================================================================================================*/
	Staff(){
		this("", "", "", "", "", 0, new MyDate(), "");
	}
	
	/* =====================================================================================================
	 * Constructor
	 * DESCRIPTION: sets values into the data fields
	 * PRE-CONDITION: 	name - value to set to name data field
	 * 							address - value to set to address data field 
	 * 							phoneNum - value to set to phoneName data field
	 * 							email - value to set to email data field
	 * 							newOffice - value to set to office data field
	 * 							newSalary - value to set to salary data field
	 * 							newTitle - value to set to title data field
	 * ====================================================================================================*/
	Staff(String newName, String newAddress, String newPhoneNum, 
			String newEmail, String newOffice, 
			double newSalary, MyDate newDate, String newTitle){
		super(newName, newAddress, newPhoneNum, newEmail, newOffice, newSalary, newDate);
		this.setTitle(newTitle);
	}
	
	/* =====================================================================================================
	 * SETTER METHODS 
	 * DESCRIPTION: sets values to data fields
	 * ====================================================================================================*/
	public void setTitle(String newTitle) {this.title=newTitle;}
	
	/* =====================================================================================================
	 * GETTER METHODS
	 * DESCRIPTION: returns data field value
	 * ====================================================================================================*/
	public String getTitle() {return this.title;}
	
	/* =====================================================================================================
	 * METHOD : toString
	 * DESCRIPTION: gives the details of the object
	 * POST-CONDITION: 	returns a string containing details of the object
	 * ====================================================================================================*/
	@Override
	public String toString() {return "Staff - " + this.getName();}
}
