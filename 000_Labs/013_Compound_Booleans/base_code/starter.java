/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		System.out.println("Give me your first number: ");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		System.out.println("Give me your second number: ");
		double num2 = sc.nextDouble();
		System.out.println("Give me your third number: ");
		double num3 = sc.nextDouble();
		
		if((num1>num2) && (num1>num3)){
			System.out.println("Your largest number is: " + num1);
		}
		if((num2>num1) && (num2>num3)){
			System.out.println("Your largest number is: " + num2);
		}
		if((num3>num2) && (num3>num1)){
			System.out.println("Your largest number is: " + num3);
		}
		
		if((num1<num2) && (num1<num3)){
			System.out.println("Your smallest number is: " + num1);
		}
		if((num2<num1) && (num2<num3)){
			System.out.println("Your smallest number is: " + num2);
		}
		if((num3<num2) && (num3<num1)){
			System.out.println("Your smallest number is: " + num3);
		}
		
	}
}
