/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Your objective is to guess the number I am thinking of...1-1000:");
		System.out.println("First guess:");
		int number = (int)(Math.random()*(1000-1)+1);
		while(true){
			int guess = sc.nextInt();
			if(guess==number){
				break;
			}
			if(guess>number){
				System.out.println(guess + " is too high!");
			}
			if(guess<number){
				System.out.println(guess + " is too low!");
			}
		}
		System.out.println("Winner! It was: " + number);
		



		
	}
}
