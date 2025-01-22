package giflorin;

import javax.swing.JOptionPane;

/**
===========================================================================================
 CLASS NAME	: PersonType
 DESCRIPTION: Class that specifies the members to implement a name
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 10/2/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */
public class PersonType {
	private String firstName, lastName;
	
	/**
	 * =====================================================================================================
	 * METHOD : PersonType
	 * DESCRIPTION: Creates a PersonType with null values. 
	 * ====================================================================================================
	 */
	PersonType(){
		firstName = null;
		lastName = null;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : PersonType
	 * DESCRIPTION: Assigns values to the first and last name
	 * PRE-CONDITION: first -> the first name
	 * 				  last -> the last name
	 * ====================================================================================================
	 */
	PersonType(String first, String last) {
		firstName = first;
		lastName = last;
	}
	/**
	 * =====================================================================================================
	 * METHOD : print
	 * DESCRIPTION: Prints the first and last name.
	 * ====================================================================================================
	 */
	public void print() {
		String message = "First Name: " + firstName + "   " +"Last Name: " + lastName;
		System.out.println(message);
		JOptionPane.showConfirmDialog(null, message, "print()", -1, -1);
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : setName
	 * DESCRIPTION: Assigns values to the first and last name
	 * PRE-CONDITION: first -> the first name
	 * 				  last -> the last name
	 * ====================================================================================================
	 */
	public void setName(String first, String last){
		firstName = first;
		lastName = last;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : getFirstName
	 * DESCRIPTION: reads the first name
	 * POST-CONDITION: returns the first name
	 * ====================================================================================================
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : getLastName
	 * DESCRIPTION: reads the last name
	 * POST-CONDITION: returns the last name
	 * ====================================================================================================
	 */
	public String getLastName() {
		return lastName;
	}
	
	
}
