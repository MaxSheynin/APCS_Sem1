/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		int number = ((int)(Math.random()*100)+1);
		System.out.println("First number: " + number);
		
		int number2 = ((int)(Math.random()*100+1));
		System.out.println("Second number: " + number2);
		
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