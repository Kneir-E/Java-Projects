package lab_exercise_6_11;

/**
===========================================================================================
 CLASS NAME	: Faculty
 DESCRIPTION: A class that creates an object faculty which extends the employee class.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 11/28/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */
public class Faculty extends Employee {
	/* =====================================================================================================
	 * Data fields
	 * Class also inherits the superclass data fields
	 * ====================================================================================================*/
	private String officeHours;
	private String rank;
	
	/* =====================================================================================================
	 * No Arg Constructor
	 * DESCRIPTION: sets base value to the data fields
	 * ====================================================================================================*/
	Faculty(){
		this("","","","","",0, new MyDate(),"","");
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
	 * 							dateOfHiring - value to set to dateHired data field
	 * 							officeHours - value to set to officeHours 	data field
	 * ====================================================================================================*/
	Faculty(String name, String address, String phoneNum, String email,
			String office, double salary, MyDate dateHired, 
			String officeHours, String rank){
		super(name, address, phoneNum, email, office, salary, dateHired);
		this.setOfficeHours(officeHours);
		this.setRank(rank);
	}
	
	/* =====================================================================================================
	 * SETTER METHODS  
	 * DESCRIPTION: sets values to data fields
	 * ====================================================================================================*/
	public void setOfficeHours(String newHours) {this.officeHours=newHours;}
	public void setRank(String newRank) {this.rank=newRank;}
	
	/* =====================================================================================================
	 * GETTER METHODS  
	 * DESCRIPTION: returns data field values
	 * ====================================================================================================*/
	public String getOfficeHours() 	{return this.officeHours;}
	public String getRank()			{return this.rank;}

	
	/* =====================================================================================================
	 * METHOD : toString
	 * DESCRIPTION: gives the details of the object
	 * POST-CONDITION: 	returns a string containing details of the object
	 * ====================================================================================================*/
	@Override
	public String toString() {
		return ("Faculty - " + this.getName());
	}
}
