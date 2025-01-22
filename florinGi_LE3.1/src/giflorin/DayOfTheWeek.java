package giflorin;
import java.util.Scanner;

/**
===========================================================================================
 CLASS NAME	: DayOfTheWeek
 DESCRIPTION: Uses Zeller's Congruence Theorem to calculate the day of the week.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 9/13/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class DayOfTheWeek {

	
	/**
	=====================================================================================================
	 METHOD	: main
	 DESCRIPTION: Uses Zeller's Congruence Theorem to calculate the day of the week.
	 ====================================================================================================
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year, m, q, h;
		System.out.print("Enter year (e.g., 2012): ");
		year = s.nextInt();
		System.out.print("Enter month (1-12): ");
		m = s.nextInt();
		if(m<=2) {
			m=m+12;
			year--;
		}
		System.out.print("Enter the day of the month (1-31): ");
		q= s.nextInt();
		
		h = (q + 26*(m+1)/10 + year%100 + year%100/4 + year/100/4 + 5*(year/100))%7;
		
		System.out.print("Day of the week is ");
		
		switch(h){
			case(0):
				System.out.print("Saturday");
				break;
			case(1):
				System.out.print("Sunday");
				break;
			case(2):
				System.out.print("Monday");
				break;
			case(3):
				System.out.print("Tuesday");
				break;
			case(4):
				System.out.print("Wednesday");
				break;
			case(5):
				System.out.print("Thursday");
				break;
			case(6):
				System.out.print("Friday");
				break;
		}
		s.close();
	}

}
