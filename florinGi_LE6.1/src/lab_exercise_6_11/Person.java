package lab_exercise_6_11;

/**
===========================================================================================
 CLASS NAME	: Person
 DESCRIPTION: A class that that creates an object Person.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 11/28/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class Person {
	
	/* =====================================================================================================
	 * Data fields
	 * ====================================================================================================*/
	private String name;
	private String address;
	private String phoneNum;
	private String email;
	
	
	/* =====================================================================================================
	 * No Arg Constructor
	 * DESCRIPTION: sets base value to the data fields
	 * ====================================================================================================*/
	Person(){
		this("","","","");
	}
	
	/* =====================================================================================================
	 * Constructor
	 * DESCRIPTION: sets values into the data fields
	 * PRE-CONDITION: 	in_name - value to set to name data field
	 * 							in_address - value to set to address data field 
	 * 							in_phoneNum - value to set to phoneName data field
	 * 							in_email - value to set to email data field
	 * ====================================================================================================*/
	Person(String in_name, String in_address, String in_phoneNum, String in_email){
		this.setName(in_name);
		this.setAddress(in_address);
		this.setPhoneNum(in_phoneNum);
		this.setEmail(in_email);
	}
	
	
	/* =====================================================================================================
	 * METHOD : toString
	 * DESCRIPTION: gives the details of the object
	 * POST-CONDITION: 	returns a string containing details of the object
	 * ====================================================================================================*/
	@Override
	public String toString() {
		return ("Person - " + this.getName());
	}
	
	/* =====================================================================================================
	 * SETTER METHODS  
	 * DESCRIPTION: sets values to data fields
	 * ====================================================================================================*/
	public void setName(String in_name) 		{this.name=in_name;	}
	public void setAddress(String in_address) 	{this.address=in_address;}
	public void setPhoneNum(String num) 		{this.phoneNum=num;		}
	public void setEmail(String in_email) 		{this.email=in_email;	}
	
	/* =====================================================================================================
	 * GETTER METHODS  
	 * DESCRIPTION: returns data field values
	 * ====================================================================================================*/
	public String getName() 	{return this.name;}
	public String getAddress()	{return this.address;}
	public String getPhoneNum(){return this.phoneNum;}
	public String getEmail()	{return this.email;}
}
