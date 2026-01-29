/*
 *	Author:  max s
 *  Date:	10/7/25
*/

import java.util.Scanner;


class starter {
	public static int pow(int a, int b){
		int x = 0;
		int answer = 1;
		while(x<b){
			answer = answer*a;
			x = x + 1;
				  }
		return answer;
									   }
	public static void main(String args[]) {
		
		System.out.println("Give me your first/base integer:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Give me your second integer:");
		int num2 = sc.nextInt();
		
		System.out.println("Your number is: " + pow(num1, num2));
		
										   }
			   }
