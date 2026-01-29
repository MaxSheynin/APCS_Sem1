/*
 *	Author: max s 
 *  Date:  12/3/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("Enter a first name and last name with a space in the middle.");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine(); 
		
		int stringlength = string.length();
		int wherethespaceis = string.indexOf(" ");
		
		String lastname = string.substring(wherethespaceis+1);
		System.out.println("Your last name is: " + lastname);


		
	}
}
