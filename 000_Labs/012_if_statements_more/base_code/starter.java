/*
 *	Author:  max sheynin
 *  Date: 09/09/2025
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Give me a random number: ");
		double number = sc.nextDouble();
		
		System.out.print("Give me another number: ");
		double number2 = sc.nextDouble();
		
			if(number!=number2)
		{ 
			System.out.println("They are different numbers!");
			
		}
		
		if(number==number2)
		{
			System.out.println("They are the same number!");
		}
	}
}
