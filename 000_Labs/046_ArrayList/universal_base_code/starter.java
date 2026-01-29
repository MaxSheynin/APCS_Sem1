/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("How many cookies do you want?");
		Scanner sc = new Scanner(System.in);
		int numCookies = sc.nextInt();
		sc.nextLine();
		ArrayList<String> arr = new ArrayList<String>(numCookies);
		int count = 0;
		while(count<numCookies){
			String cookie = "";
			System.out.println("Name of cookie:");
			cookie = sc.nextLine();
			arr.add(cookie);
			count++;
		}
		count = 0;
		while(count<numCookies){
			System.out.println("Cookie #" + (count + 1) + " " + arr.get(count));
			count++;
		}

}
}