/*
 *	Author:  max s 
 *  Date: oct 13
*/

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.util.Scanner;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) throws InterruptedException {
		// Write your code here!
		System.out.println("Welcome to Type Quest!");	//intro stuff
		System.out.println("It is currently " + getTime() + " and we're ready to play!");
		System.out.println("Given a sentence, type it as fast as possible!");
		System.out.println("");
		System.out.println("------------------------------------------");
		
		while(true){
		System.out.println("Would you like to:");
		System.out.println("1 - Play random");
		System.out.println("2 - Play set");
		System.out.println("3 - Quit");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		int play = sc.nextInt();
		String answer = "";
		
		if(play == 1){	//this whole thing is for like when user picks opt. 1 (play random)
			System.out.println("You've chosen to randomly select a sentence.");
			System.out.println("----Your sentence is:----");
			String givenSentence = getSentence();
			System.out.println(givenSentence);
			System.out.println("");
			
			countdown();			//this part basically is when user is typing their answer
			startTimer();			//timer and typing starts!
			System.out.println("");
			System.out.println("Type it out:");
			String userSentence = sc2.nextLine();
			endTimer();				//hm i wodner what this does (ends timer)
			
			System.out.println("");
			System.out.println("Wow! Great job!");
			System.out.println("Time: " + endTimer());
			System.out.println("Errors: " + compareSentences(givenSentence,userSentence));
			System.out.println("Letters per minute: " + (lettersInSentence(userSentence))/(endTimer()));
			System.out.println("Words per minute: " + (wordsInSentence(userSentence))/(endTimer()));
			System.out.println("------------------");
		}	//brackets ending if(play = 1)
		if(play==2){
			System.out.println("Please enter what number sentence you'd like to play:");
			int sentenceNumber = sc3.nextInt();
			System.out.println("----Your sentence is:----");
			String givenSentence2 = getSentence(sentenceNumber);
			System.out.println(givenSentence2);
			System.out.println("");
			countdown();			//this part basically is when user is typing their answer
			startTimer();
			System.out.println("Type it out:");
			String userSentence2 = sc4.nextLine();
			endTimer();	
			
			System.out.println("");
			System.out.println("Wow! Great job!");
			System.out.println("Time: " + endTimer());
			System.out.println("Errors: " + compareSentences(givenSentence2,userSentence2));
			System.out.println("Letters per minute: " + (lettersInSentence(userSentence2))/(endTimer()));
			System.out.println("Words per minute: " + (wordsInSentence(userSentence2))/(endTimer()));
			System.out.println("------------------");
		}
		if(play==3){
			System.out.println("Okay, bye!");
			System.out.println("Thanks for playing.");
			break;
		}
		} // brackets ending the while statement

		
	}

	// This method returns the local current time as a String
	public static String getTime(){
		LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
	}

	// This method starts a clock that can be used throughout the program
	public static void startTimer(){
		startTime = System.nanoTime();
	}

	// This method stops the timer clock and returns a double of the seconds and milliseconds of the stopwatch
	public static double endTimer() throws InterruptedException{
		long endTime = System.nanoTime();
		long timeSeconds = ((endTime - startTime)/1000000);
		double decSeconds = timeSeconds/1000.0;
		return decSeconds;
	}

	// This method does a 3 second countdown and prints it to the terminal
	public static void countdown(){
		System.out.println("Starting countdown...");
		for (int i = 0; i < 3; i++) {
			System.out.println(3-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Go!");
	}

	// This method sets up a list of sentences to be called from. 
	// This should only be called once prior to getting sentences.
	private static void populateArrayList(){
		File f = new File("sentences.txt");
		try(Scanner fsc = new Scanner(f)){
			while(fsc.hasNextLine()){
				arr.add(fsc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.err.println("File not found: " + e.getMessage());
		}
	}

	// This chooses 1 of the 100 sentences in the list to return.
	public static String getSentence(){
		populateArrayList();
		int rand = (int)(Math.random()*100);
		return arr.get(rand);
	}

	// This returns the same sentence for the same integer given.
	public static String getSentence(int index){
		populateArrayList();
		return arr.get(index%100);
	}

	//  This returns the number of letters, spaces, and punctuations in a sentence.
	public static int lettersInSentence(String sent){
		return sent.length();
	}
	
	// This returns the number of words in a sentence
	public static int wordsInSentence(String sent){
		int spaceCount = 0;
		while(sent.indexOf(" ") > -1){
			spaceCount++;
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		return ++spaceCount;
	}

	// This method does a letter by letter comparison of each word and returns the number of errors.
	public static int compareSentences(String given, String typed){
		int errors = 0;
		while(given.length() > 0 && typed.length() > 0){
			if(!given.substring(0,1).equals(typed.substring(0,1)))
				errors++;
			given = given.substring(1);
			typed = typed.substring(1);
		}
		return errors;
	}

}
