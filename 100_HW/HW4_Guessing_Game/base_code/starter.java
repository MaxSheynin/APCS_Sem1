/*
 *	Author: max s
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*3+1); 
		
		String guess1a = "";
		String guess2a = "";
		String guess3a = "";
		
		if(a == 1){
			System.out.println("Here is the game's objective: ");
			System.out.println("You need to guess what subject I am thinking of...");
			System.out.println("What's your first guess?");
			guess1a = sc.nextLine();
			if(guess1a.equals("math")||guess1a.equals("Math")){
				System.out.println("Correct! It was math.");
			}
			else{
				System.out.println("Try again (it's associated with blue):");
				String guess1b = sc.nextLine();
				if(guess1b.equals("math")||guess1b.equals("Math")){
				System.out.println("YOU GOT IT!");
				}
				else{
					System.out.println("It was math!");
				}
			}
		}
		if(a == 2){
			System.out.println("Here is the game's objective: ");
			System.out.println("You need to guess what subject I am thinking of...");
			System.out.println("What's your first guess?");
			guess2a = sc.nextLine();
			if(guess2a.equals("english")||guess2a.equals("English")){
				System.out.println("Correct! It was english.");
			}
			else{
				System.out.println("Try again (it's associated with red):");
				String guess2b = sc.nextLine();
				if(guess2b.equals("english")||guess2b.equals("English")){
				System.out.println("YOU GOT IT!");
				}
				else{
					System.out.println("It was english!");
				}
			}
		}	
		if(a == 3){
			System.out.println("Here is the game's objective: ");
			System.out.println("You need to guess what subject I am thinking of...");
			System.out.println("What's your first guess?");
			guess3a = sc.nextLine();
			if(guess3a.equals("history")||guess3a.equals("History")){
				System.out.println("Correct! It was history.");
			}
			else{
				System.out.println("Try again (it's associated with yellow):");
				String guess3b = sc.nextLine();
				if(guess3b.equals("history")||guess3b.equals("History")){
				System.out.println("YOU GOT IT!");
				}
				else{
					System.out.println("It was history!");
				}
			}
		}
			
			
			
			
			}
}


