/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	System.out.println("Welcome to the ATM!");
	System.out.println("What info do we know?");
	System.out.println("1 - Nothing");
	System.out.println("2 - Owner");
	System.out.println("3 - Owner and Initial Deposit");
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	Scanner sc3 = new Scanner(System.in);
	Scanner sc4 = new Scanner(System.in);
	Scanner sc5 = new Scanner(System.in);
	Scanner sc6 = new Scanner(System.in);
	Scanner sc7 = new Scanner(System.in);
	Scanner sc8 = new Scanner(System.in);
	int userResponse = sc.nextInt();
	String userResponse1a;
	String userResponse2a;
	String userResponse2b;
	String userResponse3a;
	double userResponse3b;
	String userResponse3c;
	
	if(userResponse==1){
		System.out.println("");
		BankAccount account = new BankAccount();
		account.displayAccountInfo();
		System.out.println("Would you like to check this account's balance (Y/N): ");
		userResponse1a = sc2.nextLine();
		if(userResponse1a.equals("Y")){
			account.checkBalance();
		}
		else if(userResponse1a.equals("N")){
			System.out.println("Okay, goodbye!");
		}
		else{
			System.out.println("Bye!");
		}
	}
	if(userResponse==2){
		System.out.println("What is your name?");
		userResponse2a = sc3.nextLine();
		BankAccount account2 = new BankAccount(userResponse2a);
		account2.displayAccountInfo();
		System.out.println("Would you like to check this account's balance (Y/N): ");
		userResponse2b = sc4.nextLine();
		if(userResponse2b.equals("Y")){
			account2.checkBalance();
			System.out.println("");
		}
		else if(userResponse2b.equals("N")){
			System.out.println("Okay, goodbye!");
		}
		else{
			System.out.println("Bye!");
		}
	}
	if(userResponse==3){
		System.out.println("What is your name?");
		userResponse3a = sc5.nextLine();
		System.out.println("How much are you depositing?");
		userResponse3b = sc6.nextDouble();
		BankAccount account3 = new BankAccount(userResponse3a, userResponse3b);
		account3.displayAccountInfo();
		System.out.println("");
		System.out.println("Would you like to check your balance? (Y/N)");
		userResponse3c = sc8.nextLine();
		if(userResponse3c.equals("Y")){
			account3.checkBalance();
			System.out.println("");
		}
		else if(userResponse3c.equals("N")){
			System.out.println("Okay, goodbye!");
		}
		else{
			System.out.println("Bye!");
		}
	}

		
	}
}
