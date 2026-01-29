/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	
		Dog dogA = new Dog("Bob", 15);
		Dog dogB = new Dog("Joe", "Maltese");
		
		if(dogA.isSleeping()){
			System.out.println("DogA is sleeping!");
		}
		else{
			dogA.bark();
		}
		
		if((dogB.isSleeping())&&(!dogA.isSleeping())){
			dogB.bark();
		}
		

	}
}
