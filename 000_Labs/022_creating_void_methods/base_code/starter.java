/*
 *	Author:  
 *  Date: 
*/
	import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Write whatever you want:");
	String string1 = sc.nextLine();
	System.out.println("Write whatever you want (again):");
	String string2 = sc.nextLine();
		
	toString(string1);	
	toStringCombined(string1, string2);
		
	}
	public static void toString(String a){
		System.out.println(a);
	}
	public static void toStringCombined(String a, String b){
		System.out.println(a+b);
	}
}
