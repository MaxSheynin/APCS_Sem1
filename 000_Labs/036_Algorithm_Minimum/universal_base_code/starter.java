/*
 *	Author:  max sheynin
 *  Date: nov 13
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int x = (int)(Math.random()*149+51);
		int [] arr = new int[x];
		int c1 = 0;
		
		while(c1<arr.length){
			int y = (int)(Math.random()*99+1);
			arr[c1]=y;
			c1++;
		}
		//minimum!:
		int minimum = Integer.MAX_VALUE;
		for(int m = 0; m<arr.length; m++){
			if(arr[m]<minimum){
				minimum = arr[m];
			}
		}
		System.out.println("The minimum value is: " + minimum);
		System.out.println("---------------------------");
		//maximum:
		int maximum = Integer.MIN_VALUE;
		for(int m2 = 0; m2<arr.length; m2++){
			if(arr[m2]>maximum){
				maximum = arr[m2];
			}
		}
		System.out.println("The maximum value is: " + maximum);
		System.out.println("---------------------------");
		//average:
		int totalAvg = 0;
		for(int m3 = 0; m3<arr.length; m3++){
			totalAvg = totalAvg + arr[m3];
		}
		System.out.print("The average value is: ");
		System.out.println(totalAvg/arr.length);
		System.out.println("---------------------------");
		//total elements:
		System.out.println("Total number of elements: " + arr.length);


		
	}
}
