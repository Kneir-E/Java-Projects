package giflorin;
import java.util.Scanner;

/**
===========================================================================================
 CLASS NAME	: DecToHex
 DESCRIPTION: Converts Decimal to Hexadecimal.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 9/13/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class DecToHex {
	/**
	=====================================================================================================
	 METHOD	: main
	 DESCRIPTION: Converts Decimal to Hexadecimal.
	 ====================================================================================================
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a decimal number \t:");
		int a= s.nextInt();
		String str = "";
		System.out.print("Hexadecimal number \t:");
		
		while(a!=0) {
			if(a%16<10){
				str = a%16 + str;
			}else{
				str = (char)(65 +a%16-10) + str;
			}
				a=a/16;
		}
		
		System.out.print(str);
		s.close();
	}
}
