package giflorin;

import javax.swing.JOptionPane;

/**
===========================================================================================
 CLASS NAME	: TestGradeDistribution
 DESCRIPTION: A class used to test the methods in class GradeDistribution
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 10/2/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */
public class TestGradeDistribution {
	/**
	 * =====================================================================================================
	 * METHOD : main
	 * DESCRIPTION: tests the methods in GradeDistribution
	 * ====================================================================================================
	 */
	public static void main(String[]Args) {
		String message;
		GradeDistribution Gra = new GradeDistribution();
		
		Gra.setGrade('a', 1);
		Gra.setGrade('b', 4);
		Gra.setGrade('c', 6);
		Gra.setGrade('d', 2);
		Gra.setGrade('f', 1);
		
		message = "Total number of grades: "+ Gra.totalGradeCount();
		System.out.println(message);
		JOptionPane.showConfirmDialog(null, message, "Total Grade Count", -1, 1, null);
		
		message = "A Grade: " + Gra.readGrade('a') + "    Percent: "+ Gra.percentGrade('a');
		System.out.println(message);
		JOptionPane.showConfirmDialog(null, message, "No. of A's", -1, 1, null);
		
		message = "B Grade: " + Gra.readGrade('b') + "    Percent: "+ Gra.percentGrade('b');
		System.out.println(message);
		JOptionPane.showConfirmDialog(null, message, "No. of B's", -1, 1, null);
		
		message = "C Grade: " + Gra.readGrade('c') + "    Percent: "+ Gra.percentGrade('c');
		System.out.println(message);
		JOptionPane.showConfirmDialog(null, message, "No. of C's", -1, 1, null);
		
		message = "D Grade: " + Gra.readGrade('d') + "    Percent: "+ Gra.percentGrade('d');
		System.out.println(message);
		JOptionPane.showConfirmDialog(null, message, "No. of D's", -1, 1, null);
		
		message = "F Grade: " + Gra.readGrade('f') + "    Percent: "+ Gra.percentGrade('f');
		System.out.println(message);
		JOptionPane.showConfirmDialog(null, message, "No. of F's", -1, 1, null);
		
		
		message = Gra.drawGraph();
		JOptionPane.showConfirmDialog(null, message, "Draw Graph", JOptionPane.DEFAULT_OPTION, -1, null);
	}
}
