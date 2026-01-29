/*
	Author: max s
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

		Spiderman a = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		Spiderman b = new Spiderman("Andrew Garfield", 40, "Electro");
		Spiderman c = new Spiderman("Tom Holland", 27, "The Vulture");
		Spiderman d = new Spiderman("Miles Morales", 15, "The Spot");
		
			System.out.println("Info: ");
			System.out.println("Spiderman A: " + a.getActor() + ", " +a.getAge() + ", " + a.getVillain() );
			System.out.println("Spiderman B: " + b.getActor() + ", " +b.getAge() + ", " + b.getVillain() );
			System.out.println("Spiderman C: " + c.getActor() + ", " +c.getAge() + ", " + c.getVillain() );
			System.out.println("Spiderman D: " + d.getActor() + ", " +d.getAge() + ", " + d.getVillain() );
	}
}
