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

}