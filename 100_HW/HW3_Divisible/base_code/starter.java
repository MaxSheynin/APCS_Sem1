/*
 *	Author: max sheynin
 *  Date: 09/09/2025
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me a number: ");
		int number = sc.nextInt(); //number = number 1
		
		System.out.println("Give me another number: ");
		int numba = sc.nextInt(); //numba = number 2
		
		if(number%2==1)
		{
			System.out.println(number + " is odd!");
		}
		if(number%2!=1)
		{
			System.out.println(number + " is even!");
		}
		
		if(numba%2==1)
		{
			System.out.println(numba + " is odd!");
		}
		if(numba%2!=1)
		{
			System.out.println(numba + " is even!");
		} 
		if(number%3==0)
		{
			System.out.println(number + " IS divisible by 3");
		}
		else
		{
			System.out.println(number + " is NOT divisible by 3");
		}
		if(number%4==0)
		{
			System.out.println(number + " IS divisible by 4");
		}
		else
		{
			System.out.println(number + " is NOT divisible by 4");
		}
		if(number%5==0)
		{
			System.out.println(number + " IS divisible by 5");
		}
		else
		{
			System.out.println(number + " is NOT divisible by 5");
		}
		if(numba%3==0)
		{
			System.out.println(numba + " IS divisible by 3");
		}
		else
		{
			System.out.println(numba + " is NOT divisible by 3");
		}
		if(numba%4==0)
		{
			System.out.println(numba + " IS divisible by 4");
		}
		else
		{
			System.out.println(numba + " is NOT divisible by 4");
		}
		if(numba%5==0)
		{
			System.out.println(numba + " IS divisible by 5");
		}
		else
		{
			System.out.println(numba + " is NOT divisible by 5");
		}
	}
}
