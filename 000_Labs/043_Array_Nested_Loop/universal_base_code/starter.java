/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("What symbol would you like to use (ex: &, %, etc):");
		Scanner sc = new Scanner(System.in);
		String symbol = sc.nextLine();
		
		System.out.println("What's the width of your box (enter a number):");
		int width = sc.nextInt();
		
		System.out.println("Whats the height of your box (enter a number):");
		int height = sc.nextInt();
		
		for(int i = 0; i < height + 1; i++){
			for(int q = 0; q < width; q++){
				System.out.print(symbol);
			}
			System.out.println();
		}

		
	}
}
