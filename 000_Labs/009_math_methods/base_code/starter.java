/*
 *	Author:  max sheynin
 *  Date: 9/4/2025
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		
		double q1 = Math.max(13-6*11, 30%7*(-2));
		double q2 = Math.sqrt(3*8+31%7);
		double q3 = Math.pow(37/3, 35%21);
		
		double q4a = Math.pow(2, 14%3);
		double q4b = Math.sqrt(2*6);
		
		double q4 = Math.max(q4a, q4b);
		
		System.out.println("Answer to question a: " + q1);
		System.out.println("Answer to question b: " + q2);
		System.out.println("Answer to question c: " + q3);
		System.out.println("Answer to question d: " + q4);
		
		//extra
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me your first number value:");
		double num1 = sc.nextDouble();
		
		System.out.println("Give me your second number value:");
		double num2 = sc.nextDouble();
		
		System.out.println("This is the max: " + Math.max(num1, num2));
		System.out.println("This is the square root of your second number: "  + Math.sqrt(num2));
		System.out.println("This is your first number to the power of your second number: " + Math.pow(num1, num2));
	}
}
