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
		int [] RandomArray = new int[1000];
		int x; //declaring the "random" variable as x
		int q = 0; //initializing the first loop's variable
		while(q<RandomArray.length){
			x = (int)(Math.random()*(1000));
			RandomArray[q] = x;
			q++;
		}
		int p = 0;
		while(p<1000){
			System.out.println(RandomArray[p]);
			p++;
		}

		
	}
}
