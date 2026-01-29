/*
 *	Author:  Max Sheynin
 *  Date: 12/9/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence (that will be entered backwards!): ");
		String sentence = sc.nextLine();
		
		String reversed = "";
		while(sentence.indexOf(" ")!=-1){
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			sentence = sentence.substring(space+1);
			reversed = word + " " + reversed;
		}
		System.out.println(sentence+" " + reversed);
		
		
		
		/*// old code (IGNOREEEEEEEEEEEEEEEEEEEEEE)
		int count = (sentence.length()-1);
		int numberOfSpaces = 0;
		
		while(count>0){
			count--;
			if(sentence.substring(count, count+1).equals(" ")){
				numberOfSpaces++;
			}
		}
		
		int numberOfWords = numberOfSpaces + 1;

		count = 0;
		int indexOfSpace = sentence.indexOf(" ");
		int indexOfNextSpace = 0;
		int thing = 0;
		String reversedSentence = "";
		while((count < numberOfWords+1)&&(indexOfNextSpace!=-1)){
			//indexOfSpace = sentence.indexOf(" ");
			//indexOfNextSpace = sentence.indexOf(" ", indexOfSpace + 1);
			if(thing == 0){
			reversedSentence = sentence.substring(thing, indexOfSpace);
			thing = indexOfSpace;
			}
			else{
			reversedSentence = sentence.substring(indexOfSpace+1, indexOfNextSpace) + " " + reversedSentence;
			}
			if(indexOfNextSpace!=0){
			indexOfSpace = indexOfNextSpace;
			}
			indexOfNextSpace = sentence.indexOf(" ", indexOfSpace+1);
			count++;
		}
		
		System.out.println(sentence.substring(indexOfNextSpace) + " " + reversedSentence); //OK so now u just gotta print the last word, in a new loop!
		
		
		/*int count2 = 0;
		int space = 0;
		int index = 0;
		String word = "";
		while((count2<numberOfWords+1)&(index!=-1)){
			index = sentence.indexOf(" ");
			space = (space + index);
			word = (sentence.substring(count2, space));
			System.out.print(word + " ");
			count2 = count2 + space;
		}
		*/
	
		


		
	}
}
