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
	
	
	
	/*int count = 0;
	int count2 = 0;
	while(count<arr.length&&count2<arr[0].length){
		arr[count][count2]=(int)(Math.random()*10);
		count2++;
	}
	count = 0;
	while(count<arr.length&&count<arr[0].length){
		System.out.print(arr[count][count]);
		count++;
	}


		*/
	}
	public static double rowAverage(int row, int[][] arr){
		int sum = 0;
		int total = 0;
		for(int i = 0; i < arr[0].length; i++){
			sum = arr[row][i] + sum;
			total++;
		}
		double average = 0;
		average = sum/total;
		return average;
}
