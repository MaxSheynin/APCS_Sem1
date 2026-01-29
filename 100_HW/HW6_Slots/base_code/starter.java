/*
 *	Author: max
 *  Date: september
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int money = 100;
		System.out.println("You have $100...would you like to play slots?");
		System.out.println("(You can say Yes or No)");
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
		
		while(money>0&&(answer.equals("Yes")||answer.equals("Y")||answer.equals("yes"))||answer.equals("y")){
			System.out.println("How much are you wagering:");
			System.out.println("(You have " + money + " dollars by the way!)");
			int wager = sc.nextInt();
			int slot1 = (int)(Math.random()*10);
			int slot2 = (int)(Math.random()*10);
			int slot3 = (int)(Math.random()*10);
			System.out.println("|" + slot1 + "|" + slot2 + "|" + slot3 + "|");
			
			if(slot1==slot2||slot1==slot3||slot2==slot3){
				money = money + wager*2;
				System.out.println("You have " + money + " dollars now winner!");
			}
			else if(slot1==slot2&&slot2==slot3){
				money = money + wager*3;
				System.out.println("You have " + money + " dollars now winner!");
			}
			else{
				money = money - wager;
				System.out.println("You have " + money + " dollars left...");
			}
			
		}
		if(money==0||(answer.equals("No"))||(answer.equals("no"))||(answer.equals("N"))||(answer.equals("n"))){
			System.out.println("Okay you end with: " + money + " dollars!");
		}
		
	}
}
