package giflorin;
import javax.swing.JOptionPane;
/**
===========================================================================================
 CLASS NAME	: TestPersonType
 DESCRIPTION: A class that tests the methods in class PersonType.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 10/2/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */
public class TestPersonType {
	/**
	 * =====================================================================================================
	 * METHOD : main
	 * DESCRIPTION: method used to test the methods in PersonType.
	 * ====================================================================================================
	 */
	public static void main(String[]Args) {
		String message;
		String 	fn1="Gillian", ln1="Florin",
				fn2="Naillig", ln2="Nirolf";
		
		PersonType pt = new PersonType();
		
		pt.print();
		
		pt.setName(fn1, ln1);
		message = "Name set to "+ fn1 + " " + ln1;
		System.out.println(message);
		JOptionPane.showConfirmDialog(null, message, "setName", -1, -1);
		
		message = "First name: " +pt.getFirstName();
		System.out.println(message);
		JOptionPane.showConfirmDialog(null, message, "getFirstName", -1, -1);
		
		message = "Last name: " +pt.getLastName();
		System.out.println(message);
		JOptionPane.showConfirmDialog(null, message, "getLastName", -1, -1);
		
		
		PersonType pt2 = new PersonType(fn2,ln2);
		
		pt2.print();
	}
}
