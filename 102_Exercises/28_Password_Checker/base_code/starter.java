import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		
	   int countt = 0;
	   String word = "";
	   int strength1count = 0;
	   int strength2count = 0;
	   int strength4count = 0;
	   int strength3count = 0;
	   
	   while(countt < passwords.length){
	       word = passwords[countt];
	       if((word.length()>=8)&&(word.contains("!")||word.contains("@")||word.contains("#")||word.contains("$")||word.contains("%")||word.contains("^")||word.contains("&")||word.contains("*"))){
	       strength3count++;
	       }
	       else if(word.length()>=8){
               strength1count++;
           }
           else if(word.contains("!")||word.contains("@")||word.contains("#")||word.contains("$")||word.contains("%")||word.contains("^")||word.contains("&")||word.contains("*")){
               strength2count++;
           }
           else{
               strength4count++;
           }
	       countt++;
	   }
	   
       System.out.println("Passwords with 8 characters: " + strength1count);
       System.out.println("Passwords with symbol: " + strength2count);
       System.out.println("Passwords with both conditions: " + strength3count);
       System.out.println("Passwords with neither condition: " + strength4count);
       //-----------------------------------------------------------------------//
       int randomnumber = (int)(Math.random()*1000000);
	   String random2 = passwords[randomnumber];
       System.out.println("Random password generated: " + random2);
		
	}
}
