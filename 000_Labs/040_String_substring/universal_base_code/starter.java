/*
 *	Author:  max s
 *  Date: 12/3/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		String string = sc.nextLine();
		
		System.out.println("Letter by letter:");
		for(int i=0; i<string.length(); i++){
			System.out.println(i + " " + string.substring(i, i+1));
		}
		
	}
}
