/*
 *	Author:  max s
 *  Date:	11/19/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int[] arr = new int[100];
		for(int count = 0; count < arr.length; count++){
			arr[count]=((int)(Math.random()*99+1));
		}
	
		toStringArray(arr);
		System.out.println(getArrayAverage(arr));
		System.out.println(getArrayMax(arr));
		System.out.println(getArrayMin(arr));
		
		}
		//methods should be outside the class!
		public static void toStringArray(int[] x){
			for(int count = 0; count<x.length; count++){
				System.out.println(x[count]);
			}
		}
		public static int getArrayAverage(int[] x){
			int a = 0;
			for(int count = 0; count < x.length; count++){
				a = x[count]+a;
			}
			a = a/(x.length);
			return a;
		}
		public static int getArrayMax(int[] x){
			int a = 0;
			for(int count = 0; count<x.length; count++){
				if(x[count]>a){
					a = x[count];
				}
			}
				return a;
		}
		public static int getArrayMin(int[] x){
			int a = 101;
			for(int count = 0; count<x.length; count++){
				if(x[count]<a){
					a = x[count];
				}
			}
				return a;
		}
}
