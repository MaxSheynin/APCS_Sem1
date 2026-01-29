/*
 *	Author:  max sheynin
 *  Date: nov. 5th. 2025.
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		String [] array = new String[10];
		array[0]="Hello, it's me";
		array[1]="I was wondering if after all these years you'd like to meet";
		array[2]="To go over everything";
		array[3]="They say that time's supposed to heal ya, but I ain't done much healing";
		array[4]="Hello, can you hear me?";
		array[5]="I'm in California dreaming about who we used to be";
		array[6]="When we were younger and free";
		array[7]="I've forgotten how it felt before the world fell at our feet";
		array[8]="There's such a difference between us";
		array[9]="And a million miles";
		
		int x = 0;
		while(x<10){
			System.out.println(array[x]);
			x++;
		}
	
	}
}
