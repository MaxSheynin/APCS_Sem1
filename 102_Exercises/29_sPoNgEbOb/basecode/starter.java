/*
	Author: max sheynin
	Date: 1/12/26
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phrase:");
		String sent = sc.nextLine();
		
		while(sent.indexOf(" ")!=-1){
			String word = sent.substring(0, sent.indexOf(" "));
			System.out.print(spongeify(word+" "));
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		System.out.println(spongeify(sent));
		
		
	}
		public static String spongeify(String word){
		String ans = "";
		for(int i = 0; i < word.length(); i++){
			String letter = word.substring(i, i+1);
			if(i%2==0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			ans = ans + letter;
		}
		return ans;
		}
		
	
}
