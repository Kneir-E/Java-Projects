package giflorin;

/**
===========================================================================================
 CLASS NAME	: GradeDistribution
 DESCRIPTION: A class that represents a grade distribution for a given course.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 10/2/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class Rectangle {
	double width, height;
	
	/**
	 * =====================================================================================================
	 * METHOD : Rectangle
	 * DESCRIPTION: creates a rectangle of the default width and height 
	 * ====================================================================================================
	 */
	Rectangle(){
		width = 1;
		height = 1;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : Rectangle
	 * DESCRIPTION: creates a rectangle of a specific width and height
	 * PRE-CONDITIONS: newWidth - the width to set to the rectangle
	 * 				   newHeight - the height to set to the rectangle
	 * ====================================================================================================
	 */
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : getArea
	 * DESCRIPTION: calculates the area of the rectangle
	 * POST-CONDITIONS: returns the area
	 * ====================================================================================================
	 */
	double getArea() {
		return width*height;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : getPerimeter
	 * DESCRIPTION: calculates the perimeter of the rectangle
	 * POST-CONDITIONS: returns the perimeter
	 * ====================================================================================================
	 */
	double getPerimeter(){
		return 2* (width+height);
	}
	
	
}
