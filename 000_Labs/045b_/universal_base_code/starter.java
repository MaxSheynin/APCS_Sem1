/*
 *	Author:  
 *  Date: 
*/

import java.util.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
        
        System.out.println("Enter a word to be hidden in a crossword:");
        Scanner sc = new Scanner(System.in);
        String userWord = sc.nextLine();
        
        int lettersNum = userWord.length() + 1;
        String[][] arr = new String[5 + lettersNum][5 + lettersNum];
        
        int randNum = (int)(Math.random()*3);
        
        if(randNum == 0){ //horizontal
      
        		int randRow1 = (int)(Math.random()*(lettersNum+5));
        		int randCol1 = (int)(Math.random()*6);
        		
        		for(int j = 0; j<arr.length; j++){
        		    for(int p = 0; p<arr[0].length; p++){
        		        arr[j][p] = "a";
        		    }
        		}
        		
        		for(int i = 0; i<lettersNum-1; i++){
        		arr[randRow1][randCol1 + i] = userWord.substring(i, i+1);
        		}
        		
        		for(int j = 0; j<arr.length; j++){
        		    for(int p = 0; p<arr[0].length; p++){
        		        if(arr[j][p].equals("a")){
        		            int randLetter = (int)(Math.random()*26);
        		            arr[j][p]=letters[randLetter];
        		        }
        		    }
        		}
        		
        		printCrossword(arr);
        		
        }
        if(randNum == 1){ //vertical
        
        int randRow1 = (int)(Math.random()*6);
        int randCol1 = (int)(Math.random()*(lettersNum+5));
        		
        		for(int j = 0; j<arr.length; j++){
        		    for(int p = 0; p<arr[0].length; p++){
        		        arr[j][p] = "a";
        		    }
        		}
        		
        		for(int i = 0; i<lettersNum-1; i++){
        		arr[randRow1+i][randCol1] = userWord.substring(i, i+1);
        		}
        		
        		for(int j = 0; j<arr.length; j++){
        		    for(int p = 0; p<arr[0].length; p++){
        		        if(arr[j][p].equals("a")){
        		            int randLetter = (int)(Math.random()*26);
        		            arr[j][p]=letters[randLetter];
        		        }
        		    }
        		}
        		
        		printCrossword(arr);
        	
        }
        if(randNum == 2){ //diagonal
        	
        int randRow1 = (int)(Math.random()*6);
        int randCol1 = (int)(Math.random()*6);
        		
        		for(int j = 0; j<arr.length; j++){
        		    for(int p = 0; p<arr[0].length; p++){
        		        arr[j][p] = "a";
        		    }
        		}
        		
        		for(int i = 0; i<lettersNum-1; i++){
        		arr[randRow1+i][randCol1+i] = userWord.substring(i, i+1);
        		}
        		
        		for(int j = 0; j<arr.length; j++){
        		    for(int p = 0; p<arr[0].length; p++){
        		        if(arr[j][p].equals("a")){
        		            int randLetter = (int)(Math.random()*26);
        		            arr[j][p]=letters[randLetter];
        		        }
        		    }
        		}
        		
        		printCrossword(arr);
        	
        }

		
	}
	public static void printCrossword(String[][] arr){
		
		for(int r = 0; r<arr.length; r++){
			for(int c = 0; c<arr[0].length; c++){
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
	}
}
