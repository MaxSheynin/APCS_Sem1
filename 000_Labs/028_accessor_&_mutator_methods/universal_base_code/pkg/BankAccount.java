/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String owner;
	private double accountNumber;
	private double balance;
	private boolean isActive;
	private static int nextAccountNumber = (int)(Math.random()*(1000-50)+50);

	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "unknown";
		accountNumber = nextAccountNumber;
		balance = 0;
		isActive = true;
	}
	public BankAccount(String o){
		owner = o;
		accountNumber = nextAccountNumber;
		balance = 0;
		isActive = true;
	}
	public BankAccount(String o, double b){
		owner = o;
		accountNumber = nextAccountNumber;
		balance = b;
		isActive = true;
	}

	// -------METHODS-------
	public void checkBalance(){
		System.out.println("Your balance is: " + balance);
	}
	public void displayAccountInfo(){
		System.out.println("-------------");
		System.out.println("Name:" + owner);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Your account is active: " + isActive);
	}
	public String getOwner(){
		return owner;
	}
	public void setOwner(String a){
		owner = a;
	}
	public double getBalance(){
		return balance;
	}
	public void closeAccount(){
		System.out.println("Account closed!");
	}
	public boolean isActive(){
		return isActive;
	}
	public void deposit(double a){
		if(isActive){
		balance = balance + a;
		}
		else{
			System.out.println("You need an active account!");
		}
	}
	public void withdraw(double a){
		if((isActive)&&(balance>=a)){
			System.out.println("You withdrew: " + a);
		}
		else{
			System.out.println("You can't withdraw that much!");
		}
	}
	}
	
	
