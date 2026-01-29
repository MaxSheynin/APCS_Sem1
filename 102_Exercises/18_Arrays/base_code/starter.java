/*
 *	Author: max	s
 *  Date:	november 6th 2025
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		//first array list
		int [] arr1 = new int[1001];
		int x = 0;
		int q = 1;
		while(x<arr1.length){
			arr1[x]=(3*q);
			x++;
			q++;
		}
		int p = 0;
		while(p<arr1.length){
			System.out.println(arr1[p]);
			p++;
		}
		
		System.out.println("------------------------------");
		
		//second array list
		int [] arr2 = new int[1001];
		int y = 0;
		int z = 0;
		while(y<arr2.length){
			arr2[y]=(1000-z);
			y++;
			z++;
		}
		int k = 0;
		while(k<arr2.length){
			System.out.println(arr2[k]);
			k++;
		}
	}
}
