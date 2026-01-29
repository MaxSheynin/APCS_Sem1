/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[20];
		int count = 0;
		int random; 
		int random2 = (int)(Math.random()*10+1);
		while(count<arr.length){
			random = (int)(Math.random()*10+1);
			arr[count]=random;
			count++;
		}
		int count2 = 0;
		System.out.println("Arrays that match the value " + random2);
		System.out.println(" ");
				System.out.println("Index(es): ");
		int count3 = 0;
		while(count2<arr.length){
			if(arr[count2]==random2){
				System.out.println(count2+" ");
				count3++;
			}
			count2++;
		}
		System.out.println(" ");
		System.out.println("Total amount of indexes (that match " + random2 + "):  " + count3);
		//end of thing ^    beginning of new thing v
		int count4 = 0;
		int count5 = 0;
		System.out.println("----------------------");
		while(count4<arr.length){
			if(arr[count4]==arr[count4+1]){
				System.out.println("Index " + count5 + " and Index " + (count5+1) + " are consecutively the same!");
				System.out.println("They are both: " + arr[count4]);
			}
			count4++;
			count5++;
		}
	}
}
