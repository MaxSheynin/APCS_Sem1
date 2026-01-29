/*
   * Author: max sheynin
   * Date: 12/9/25
   * Collaborator(s):
*/
import java.util.Scanner;
class starter {
	
	public static String FirstRule(String theirSentence){
		boolean condition1 = ((theirSentence.substring(0,1)).equals("a")||(theirSentence.substring(0,1)).equals("A")||(theirSentence.substring(0,1)).equals("e")||(theirSentence.substring(0,1)).equals("E")||(theirSentence.substring(0,1)).equals("i")||(theirSentence.substring(0,1)).equals("I")||(theirSentence.substring(0,1)).equals("o")||(theirSentence.substring(0,1)).equals("O")||(theirSentence.substring(0,1)).equals("u")||(theirSentence.substring(0,1)).equals("U"));
		boolean condition2 = ((theirSentence.substring(1,2)).equals("a")||(theirSentence.substring(1,2)).equals("A")||(theirSentence.substring(1,2)).equals("e")||(theirSentence.substring(1,2)).equals("E")||(theirSentence.substring(1,2)).equals("i")||(theirSentence.substring(1,2)).equals("I")||(theirSentence.substring(1,2)).equals("o")||(theirSentence.substring(1,2)).equals("O")||(theirSentence.substring(1,2)).equals("u")||(theirSentence.substring(1,2)).equals("U"));
		String word = "";
		if(condition2&&!condition1){
			word = (theirSentence.substring(1) + "-" + theirSentence.substring(0,1) + "ay");
		}
		return word;
	}
	
	public static String SecondRule(String theirSentence){
		boolean condition1 = ((theirSentence.substring(0,1)).equals("a")||(theirSentence.substring(0,1)).equals("A")||(theirSentence.substring(0,1)).equals("e")||(theirSentence.substring(0,1)).equals("E")||(theirSentence.substring(0,1)).equals("i")||(theirSentence.substring(0,1)).equals("I")||(theirSentence.substring(0,1)).equals("o")||(theirSentence.substring(0,1)).equals("O")||(theirSentence.substring(0,1)).equals("u")||(theirSentence.substring(0,1)).equals("U"));
		boolean condition2 = ((theirSentence.substring(1,2)).equals("a")||(theirSentence.substring(1,2)).equals("A")||(theirSentence.substring(1,2)).equals("e")||(theirSentence.substring(1,2)).equals("E")||(theirSentence.substring(1,2)).equals("i")||(theirSentence.substring(1,2)).equals("I")||(theirSentence.substring(1,2)).equals("o")||(theirSentence.substring(1,2)).equals("O")||(theirSentence.substring(1,2)).equals("u")||(theirSentence.substring(1,2)).equals("U")); 
		String word = "";
		if(!condition1&&!condition2&theirSentence.length()>2){
			word = (theirSentence.substring(2) + "-" + theirSentence.substring(0,2) + "ay");
		}
		return word;
	}
	
	public static String ThirdRule(String theirSentence){
		boolean condition1 = ((theirSentence.substring(0,1)).equals("a")||(theirSentence.substring(0,1)).equals("A")||(theirSentence.substring(0,1)).equals("e")||(theirSentence.substring(0,1)).equals("E")||(theirSentence.substring(0,1)).equals("i")||(theirSentence.substring(0,1)).equals("I")||(theirSentence.substring(0,1)).equals("o")||(theirSentence.substring(0,1)).equals("O")||(theirSentence.substring(0,1)).equals("u")||(theirSentence.substring(0,1)).equals("U"));
		String word = "";
		if(condition1){
			word = (theirSentence+"-way");
		}
		else{
			word = (theirSentence.substring(0)+"-way");
		}
		return word;
	}
	
	public static void main(String args[]) {
		
		System.out.println("Enter a sentence that you want translated into Pig Latin!");
		Scanner sc = new Scanner(System.in);
		String theirSentence = sc.nextLine();
		
		int count2 = 0;
		while(count2 < theirSentence.length()){
			String word = "";
			int nextSpace = theirSentence.indexOf(" ", count2);
			if(nextSpace!=-1){
			word = theirSentence.substring(count2, nextSpace);
			}
			else{
			word = theirSentence.substring(count2);
			}
			String result = FirstRule(word);
			if(result.equals("")){
				result = SecondRule(word);
			}
			if(result.equals("")){
				result = ThirdRule(word);
			}
			System.out.print(result + " ");
			if(nextSpace==-1){
				break;
			}
			count2 = nextSpace+1;
		}
		
		
	
		
	}
}
/** backup code IGNORE: String theirSentence = sc.nextLine();
		int theirSentenceLength = theirSentence.length();
		String theirSentenceInPigLatin = "";
		int x = theirSentence.indexOf(" ");
		
		while(){
		if((theirSentence.substring(0,1)).equals("a")||(theirSentence.substring(0,1)).equals("A")||(theirSentence.substring(0,1)).equals("e")||(theirSentence.substring(0,1)).equals("E")||(theirSentence.substring(0,1)).equals("i")||(theirSentence.substring(0,1)).equals("I")||(theirSentence.substring(0,1)).equals("o")||(theirSentence.substring(0,1)).equals("O")||(theirSentence.substring(0,1)).equals("u")||(theirSentence.substring(0,1)).equals("U")){
			if(x==-1){
			theirSentenceInPigLatin = (theirSentence.substring(0) + "-way");
			}
			else{
			theirSentenceInPigLatin = (theirSentence.substring(0, x) + "-way");	
			}
			x = theirSentence.indexOf(" ", x+1);
		}
		if((theirSentence.substring(x+1, x + 2)).equals("a")||(theirSentence.substring(x+1, x + 2)).equals("A")||(theirSentence.substring(x+1, x + 2)).equals("e")||(theirSentence.substring(x+1, x + 2)).equals("E")||(theirSentence.substring(x+1, x + 2)).equals("i")||(theirSentence.substring(x+1, x + 2)).equals("I")||(theirSentence.substring(x+1, x + 2)).equals("o")||(theirSentence.substring(x+1, x + 2)).equals("O")||(theirSentence.substring(x+1, x + 2)).equals("u")||(theirSentence.substring(x+1, x + 2)).equals("U")){
			int y = theirSentence.indexOf(" ", x+1);
			if(x!=-1){
			theirSentenceInPigLatin = (theirSentenceInPigLatin + " " + theirSentence.substring(x, y) + "-way");	
			x = theirSentence.indexOf(" ", x+1);
			}
		}
		System.out.println(theirSentenceInPigLatin);
		
		
	}
}*/