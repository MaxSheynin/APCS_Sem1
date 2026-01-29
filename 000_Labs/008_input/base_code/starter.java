/*
 *	Author:  max sheynin
 *  Date: 09/02/25
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program
		
		Scanner sc = new Scanner(System.in);
		System.out.println("I love to learn coding remotely. Also, what is your name?"); 
		String q1 = sc.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("OK. what is your age then?");
		int q2 = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("okay...and your birthday month is:");
		String q3 = sc3.nextLine();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("what is your birthday dayy");
		String q4 = sc4.nextLine();
		
		Scanner sc5 = new Scanner(System.in);
		System.out.println("birthday year????????");
		String q5 = sc5.nextLine();
		
		Scanner sc6 = new Scanner(System.in);
		System.out.println("How much is a buck fifty, hint: 1.50");
		String q6 = sc6.nextLine();
		
		System.out.println(" ");
		System.out.print("Ok " + q1 + " so you are " + q2);
		System.out.print(" and also your birthday month is " + q3 + ", your birthday day is: " + q4 + ", birthday year is ");
		System.out.println(q5 +  "? also you think a buck fifty is " + q6 + ".");
	}
}
