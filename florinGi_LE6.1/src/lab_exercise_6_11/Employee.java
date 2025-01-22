package lab_exercise_6_11;

/**
===========================================================================================
 CLASS NAME	: Employee
 DESCRIPTION: A class that creates an object employee which extends the Person class.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 11/28/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class Employee extends Person {
	/* =====================================================================================================
	 * Data fields
	 * Class also inherits the superclass data fields
	 * ====================================================================================================*/
	private String office;
	private double salary;
	private MyDate dateHired;
	
	/* =====================================================================================================
	 * No Arg Constructor
	 * DESCRIPTION: sets base value to the data fields
	 * ====================================================================================================*/
	Employee(){
		this("","", "", "", "", 0, new MyDate());
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
	 * ====================================================================================================*/
	Employee(String newName, String newAddress, String newPhoneNum, 
			String newEmail, String newOffice, 
			double newSalary, MyDate dateOfHiring){
		super(newName,newAddress,newPhoneNum,newEmail);
		this.setOffice(newOffice);
		this.setSalary(newSalary);
		this.setDateHired(dateOfHiring);
	}
	
	/* =====================================================================================================
	 * METHOD : toString
	 * DESCRIPTION: gives the details of the object
	 * POST-CONDITION: 	returns a string containing details of the object
	 * ====================================================================================================*/
	@Override
	public String toString() {
		return ("Employee - " + this.getName());
	}
	
	/* =====================================================================================================
	 * SETTER METHODS  
	 * DESCRIPTION: sets values to data fields
	 * ====================================================================================================*/
	public void setOffice(String newOffice)  {this.office=newOffice;}
	public void setSalary(Double newSalary)  {this.salary=newSalary;}
	public void setDateHired(MyDate newDate) {this.dateHired=newDate;}
	
	/* =====================================================================================================
	 * GETTER METHODS  
	 * DESCRIPTION: returns data field values
	 * ====================================================================================================*/
	public String getOffice()	{return this.office;}
	public Double getSalary()	{return this.salary;}
	public MyDate getDateHired(){return this.dateHired;}
}
