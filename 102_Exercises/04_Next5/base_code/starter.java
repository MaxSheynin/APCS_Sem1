/*
 *	Author: max sheynin
 *  Date: 09/09/2025
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What number do you want to pick?");
		int number = sc.nextInt();
		
		System.out.println("Here are the five next numbers:");
		System.out.println(number + 1);
		System.out.println(number + 2);
		System.out.println(number + 3);
		System.out.println(number + 4);
		System.out.println(number + 5);
		
		System.out.println("Here are the five next multiples of " + number + ":");
		System.out.println(number);
		System.out.println(number*2);
		System.out.println(number*3);
		System.out.println(number*4);
		System.out.println(number*5);
		System.out.println(number*6);
		
		System.out.println("Here is your number, " + number + " divided by 100");
		System.out.println(number/100.0);
		
		System.out.println("Here is your number, " + number + " divided by 10");
		System.out.println(number/10.0);

	}
}
