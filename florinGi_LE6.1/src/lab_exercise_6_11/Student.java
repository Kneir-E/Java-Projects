package lab_exercise_6_11;

/**
===========================================================================================
 CLASS NAME	: Student
 DESCRIPTION: A class that creates an object student which extends the Person class.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 11/28/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class Student extends Person {
	
	/* =====================================================================================================
	 * Data fields
	 * Class also inherits the superclass data fields
	 * ====================================================================================================*/
	private final String classStatus;
	
	/* =====================================================================================================
	 * No Arg Constructor
	 * DESCRIPTION: sets base value to the data fields
	 * ====================================================================================================*/
	Student(){
		this("","",null,"","");
	}
	
	/* =====================================================================================================
	 * Constructor
	 * DESCRIPTION: sets values into the data fields
	 * PRE-CONDITION: 	name - value to set to name data field
	 * 							address - value to set to address data field 
	 * 							phoneNum - value to set to phoneName data field
	 * 							email - value to set to email data field
	 * 							cstatus - value to set to class status data field
	 * ====================================================================================================*/
	Student(String name, String address, String phoneNum, String email, String cStatus){
		super(name,address,phoneNum,email);
		this.classStatus=cStatus;
	}
	
	
	//No setters since the only data field is a constant
	
	
	/* =====================================================================================================
	 * GETTER METHODS  
	 * DESCRIPTION: returns data field values
	 * ====================================================================================================*/
	public String getClassStatus() 		{return this.classStatus;}
	
	/* =====================================================================================================
	 * METHOD : toString
	 * DESCRIPTION: gives the details of the object
	 * POST-CONDITION: 	returns a string containing details of the object
	 * ====================================================================================================*/
	@Override
	public String toString() {
		return ("Student - " + this.getName());
	}
}
