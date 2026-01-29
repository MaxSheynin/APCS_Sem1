/*
 *	Author:max
 *  Date:09/29
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick one: Animal, Object, or Face!");
		String thing = sc.nextLine();
		
		if(thing.equals("Animal")||thing.equals("animal")){
			System.out.println("The animal is a PIG:");
			System.out.println("               ");
			System.out.println(" ^         ^ ");
			System.out.println(" ----------- ");
			System.out.println("|  0    0  |");
			System.out.println("|  ------  |");
			System.out.println("|  |o  o|  |");
			System.out.println("|  ------  |");
			System.out.println("------------");
			System.out.println("Oink oink!");
			System.out.println("           ");
		}
		
		else if(thing.equals("Object")||thing.equals("object")){
			System.out.println("The object is a PENCIL:");
			System.out.println("              ");
			System.out.println("      ^       ");
			System.out.println("     / \\     ");
			System.out.println("    /   \\   ");
			System.out.println("   /_____\\ ");
			System.out.println("   |     |");
			System.out.println("   |     |");
			System.out.println("   |     |");
			System.out.println("   |     |");
			System.out.println("   |     |");
			System.out.println("   |     |");
			System.out.println("   |     |");
			System.out.println("   |     |");
			System.out.println("   |     |");
			System.out.println("   |     |");
			System.out.println("   |     |");
			System.out.println("   |     |");
			System.out.println("   -------");
			System.out.println("   [     ]");
			System.out.println("   -------");
			System.out.println("Scribble scribble!");
			System.out.println("             ");
	}
		else if(thing.equals("Face")||thing.equals("face")){
			System.out.println("Here's the 😝 emoji: ");
			System.out.println("----------------");
			System.out.println("| \\      \\     |");
			System.out.println("| /      /     |");
			System.out.println("|              |");
			System.out.println("|------------  |");
			System.out.println("||   \\/     |  |");
			System.out.println("||__________|  |");
			System.out.println("----------------");
			System.out.println("blehhh");
		}
		else{
			System.out.println("RESTART THE CODE--TRY AGAIN!");
		}
	
	
	}
}
