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
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the # of rows:");
	int rows = sc.nextInt();
	System.out.println("Enter the # of columns:");
	int columns = sc.nextInt();

	int[][] arr = new int[rows][columns];
	for(int count = 0; count < arr.length; count++){
		for(int count2 = 0; count2 < arr[count].length; count2++){
			arr[count][count2] = (int)(Math.random()*10);
			System.out.print(arr[count][count2]+ " ");
		}
		System.out.println();
	}
	
	System.out.println("What row do you want the average of?");
	int numb = sc.nextInt();
	System.out.println("The average of row " + numb + " is " + rowAverage(numb, arr));
	
	System.out.println("The entire average is " + allAverage(arr));
		
	}
	public static double rowAverage(int row, int[][] arr){
		int sum = 0;
		int total = 0;
		for(int i = 0; i < arr[0].length; i++){
			sum = arr[row][i] + sum;
			total++;
		}
		double average = 0.0;
		average = sum/total;
		return average;
	}
	public static double allAverage(int[][] arr){
		double sum2 = 0.0;
		double total2 = 0.0;
		for(int count = 0; count < arr.length; count++){
		for(int count2 = 0; count2 < arr[count].length; count2++){
			sum2 = arr[count][count2] + sum2;
			total2++;
		}
		}
		double allAverage = 0.0;
		allAverage = sum2/total2;
		return allAverage;
	
	}
}
