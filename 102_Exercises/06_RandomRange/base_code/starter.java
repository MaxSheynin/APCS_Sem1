/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give me two integers.");
		System.out.println("Input your first integer: ");
		int number1 = sc.nextInt();
		
		System.out.println("Input your second integer (larger than " + number1 + "):");
		int number2 = sc.nextInt();
		
		if(number2>number1){
		
		System.out.println("Your range is from " + number1 + " to " + number2);
		int random1 = (int)(Math.random()*(number2 - number1)+number1);
		int random2 = (int)(Math.random()*(number2 - number1)+number1);
		int random3 = (int)(Math.random()*(number2 - number1)+number1);
		int random4 = (int)(Math.random()*(number2 - number1)+number1);
		int random5 = (int)(Math.random()*(number2 - number1)+number1);
		System.out.print("Five random numbers between your range: " + random1 + " " + random2 + " " + random3 + " " + random4 + " " + random5);
		}
		
		if(number2<number1){
		
		System.out.println("That number is not larger...");
		}


		
	}
}
