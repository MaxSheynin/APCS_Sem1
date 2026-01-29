/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Tho dare to be a Wizard, Warrior, or Rogue?");
		Scanner sc = new Scanner(System.in);
		String role = sc.nextLine();
		if(role.equals("Wizard")){
			System.out.println("Welcome Wizard!");
		}
		else if(role.equals("wizard")){
			System.out.println("Welcome Wizard!");
		}
		else if(role.equals("Warrior")){
			System.out.println("Welcome Warrior!");
		}
		else if(role.equals("warrior")){
			System.out.println("Welcome Warrior!");
		}
		else if(role.equals("rogue")){
			System.out.println("Welcome Rogue!");
		}
		else if(role.equals("Rogue")){
			System.out.println("Welcome Rogue!");
		}
		else{
			System.out.println("How dareth thou not pick a role.");
		}
		}
		}
		
	

