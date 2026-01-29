/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	public static int randAge(){
			int random = (int)(Math.random()*7);
			return random;
		}

	public static void main(String args[]) {
		// Your code goes below here
		int x = 0;
		
		PooleDwarf Drawf1 = new PooleDwarf(randName(), randAge());
		PooleDwarf Drawf2 = new PooleDwarf(randName(), randAge());
		PooleDwarf Drawf3 = new PooleDwarf(randName(), randAge());
		PooleDwarf Drawf4 = new PooleDwarf(randName(), randAge());
		PooleDwarf Drawf5 = new PooleDwarf(randName(), randAge());
		PooleDwarf Drawf6 = new PooleDwarf(randName(), randAge());
		PooleDwarf Drawf7 = new PooleDwarf(randName(), randAge());
		
		if(Drawf1.getName().equals(Drawf2.getName())){
			x = x + 1;
		}
		if(Drawf1.getName().equals(Drawf3.getName())){
			x = x + 1;
		}
		if(Drawf1.getName().equals(Drawf4.getName())){
			x = x + 1;
		}
		if(Drawf1.getName().equals(Drawf5.getName())){
			x = x + 1;
		}
		if(Drawf1.getName().equals(Drawf6.getName())){
			x = x + 1;
		}
		if(Drawf1.getName().equals(Drawf7.getName())){
			x = x + 1;
		}
		System.out.println(Drawf1.getName() + " was the name with " + x + " matches!");
	}
		
}
