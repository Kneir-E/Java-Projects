package lab_exercise_6_12;

import java.util.Scanner;

/**
===========================================================================================
 CLASS NAME	: Perfect_Square
 DESCRIPTION: A class that tests the NumToFindSquareFactor
 					class.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 11/28/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class Perfect_Square {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		NumToFindSquareFactor obj = new NumToFindSquareFactor(s.nextInt());
		
		System.out.println("The smallest number n for m * n to be a perfect square is " + obj.getSquareFactor());
		System.out.println("m * n is " + (obj.getNum()*obj.getSquareFactor()));
		s.close();
	}


}
