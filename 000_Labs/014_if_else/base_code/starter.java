/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a number between 1-1000");
		int number1 = sc.nextInt();
		int number2 = (int)(Math.random()*1000);
		
		if(number1==number2){
			System.out.println("Wow, you got the same number: " + number2);
		}
		else{
			System.out.println("Sorry... the number was " + number2);
		}
	}
}
