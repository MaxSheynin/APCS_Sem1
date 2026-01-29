/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Try to guess the random number (1-1000)!");
		int guess = sc.nextInt();
		
		int random = (int)(Math.random()*1000);
		
		if(guess==random){
			System.out.println("You got it!");
		}
		
		else if(guess>random){
			System.out.println("You were greater than the number: " + random);
		}
		
		else if(guess<random){
			System.out.println("You were smaller than the number: " + random);
		}
	}
}
