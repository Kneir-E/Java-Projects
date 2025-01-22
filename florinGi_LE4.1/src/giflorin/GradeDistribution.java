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

public class GradeDistribution {
	private int a, b, c, d, f;
	
	/**
	 * =====================================================================================================
	 * METHOD : GradeDistribution
	 * DESCRIPTION: creates a default grade distribution with 0 grades.
	 * ====================================================================================================
	 */
	GradeDistribution(){
		a=0; b=0; c=0; d=0; f=0;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : setGrade
	 * DESCRIPTION: Sets the quantity of grades of a given letter. 
	 * PRE-CONDITION: grad -> the letter of the grade to be updated
	 * 				  qtty -> the value to set the grade to
	 * ====================================================================================================
	 */
	void setGrade(char grad, int qtty) {
		switch(grad) {
			case 'a':
				a=qtty;
			case 'b':
				b=qtty;
			case 'c':
				c=qtty;
			case 'd':
				d=qtty;
			case 'f':
				f=qtty;
		}
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : readGrade
	 * DESCRIPTION: Reads the quantity of grades of a given letter. 
	 * PRE-CONDITION: grad -> the letter of the grade to be read
	 * POST-CONDITION: 	grade -> the quantity of grades in the given letter
	 * ====================================================================================================
	 */
	int readGrade(char grad) {
		int grade = 0;
		switch(grad) {
			case 'a':
				grade=a;
				break;
			case 'b':
				grade=b;
				break;
			case 'c':
				grade=c;
				break;
			case 'd':
				grade=d;
				break;
			case 'f':
				grade=f;
				break;
		}
		return grade;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : totalGradeCount
	 * DESCRIPTION: Calculates the total number of grades 
	 * POST-CONDITION: 	returns the total number of grades.
	 * ====================================================================================================
	 */
	int totalGradeCount() {
		return a+b+c+d+f;
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : percentGrade
	 * DESCRIPTION: Reads the percentage of the given letter relative to the total grade count. 
	 * PRE-CONDITION: grad -> the letter of the grade to be calculated the percentage of
	 * POST-CONDITION: 	returns the percentage of the given letter
	 * ====================================================================================================
	 */
	int percentGrade(char grad) {
		double percent = 0;
		switch(grad) {
		case 'a':
			percent=a;
			break;
		case 'b':
			percent=b;
			break;
		case 'c':
			percent=c;
			break;
		case 'd':
			percent=d;
			break;
		case 'f':
			percent=f;
			break;
	}
		return (int)Math.round(percent/(totalGradeCount())*100.0);
	}
	
	/**
	 * =====================================================================================================
	 * METHOD : drawGraph
	 * DESCRIPTION: Draws a graph of the distribution of grades from A to F. 
	 * POST-CONDITION: Returns message - a string value of the output.
	 * ====================================================================================================
	 */
	public String drawGraph() {
		String message = "0      10    20   30    40    50   60    70    80   90  100";
		message = message + "\n" + "|        |       |       |        |       |       |        |       |       |      |";
		message = message + "\n" + "**************************************************" + "\n";
		
		System.out.println("0    10   20   30   40   50   60   70   80   90  100");
		System.out.println("|    |    |    |    |    |    |    |    |    |   |");
		System.out.println("**************************************************");
		

		char gradeChar = 'a';
		int currper = 0; 
				int i=0;
		while(gradeChar<'g') {
			//currper = percentGrade(gradeChar);
			currper = (int)Math.round(readGrade(gradeChar)/(double)totalGradeCount()*50.0);
			for(i=0; i<currper;i++) {
				message = message + "*";
				System.out.print("*");
			}
			System.out.println(" "+Character.toUpperCase(gradeChar));
			message = message + " " + Character.toUpperCase(gradeChar) +"\n";
			if(gradeChar=='d') {
				gradeChar = 'f';
			}else {
				gradeChar = (char) (gradeChar+1);
			}
			
			
		}
		return message;
	}
}
