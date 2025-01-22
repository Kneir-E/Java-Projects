package giflorin;

import javax.swing.JOptionPane;

/**
===========================================================================================
 CLASS NAME	: TestRectangle
 DESCRIPTION: A class that tests the methods in class Rectangle.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 10/2/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class TestRectangle {
	/**
	 * =====================================================================================================
	 * METHOD : main
	 * DESCRIPTION: method used to test methods in Rectangle.
	 * ====================================================================================================
	 */
	public static void main(String[]Args) {
		String message;
		Rectangle rectA = new Rectangle(4.0,40);
		message = String.format("Rectangle A\n   Width: %.2f\n   Height: %.2f\n   Area: %.2f\n   Perimeter: %.2f", rectA.width, rectA.height, rectA.getArea(), rectA.getPerimeter());
		System.out.println(message);
		JOptionPane.showConfirmDialog(null, message, "Rectangle A", -1, -1);
		
		Rectangle rectB = new Rectangle(3.5,35.9);
		message = String.format("Rectangle B\n   Width: %.2f\n   Height: %.2f\n   Area: %.2f\n   Perimeter: %.2f", rectB.width, rectB.height, rectB.getArea(), rectB.getPerimeter());
		System.out.println(message);
		JOptionPane.showConfirmDialog(null, message, "Rectangle B", -1, -1);
		
	}
}
