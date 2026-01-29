/*
 *	Author: max sheynin
 *  Date: october
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a){
			int x = 2;
			if(a<=1){
				return false;
			}
			while(x<a){
				if(a%x==0){
					return false;
				}
				x++;
			}
			return true;
		}
	public static void printPrimes(int a){
		int x = 0;
		while (x <= a){
			if(checkPrime(x)){
			System.out.println(x);
			}
			x++;
		}
	}
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Input a number and we'll print out every prime until that number: ");
		Scanner sc = new Scanner(System.in);
		int userNumber = sc.nextInt();
		System.out.println("Your number is prime: " + checkPrime(userNumber));
		printPrimes(userNumber);
	}
}
