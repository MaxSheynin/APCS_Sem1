/*
 *	Author:  max s
 *  Date: october
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("Give me an integer!");
	int number = sc.nextInt();
	int x = 0;
	
	while(true){
			if(x==number){
		break;
	}
		System.out.println((x) + "." + " " + name);
	
		x = x + 1; 
	}
		
	}
}
