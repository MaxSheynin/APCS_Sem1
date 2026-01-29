/*
 *	Author:Max Sheynin
 *  Date:November
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a difficulty level: 1, 2, or 3");
        int diff = sc.nextInt();
        sc.nextLine();

        /* 
            Basics of the game:
            - Given a set of words, the player must memorize the colors
            - After a 5 second delay, the player must type in each color one at a time on separate lines
            - At any point, if they type in an incorrect color, the game ends. The game will print out the correct colors.
            - If they get them all right, the game will continue and add one more word to the series.
            - The series changes every round.
        */

        //  Given the Colors class, use the following method calls to help this program.
        /*
        Colors.print("Test 1");         // This prints out the value given without a new line   
        Colors.println("Test 2");       // This prints out the value given then a new line
        Colors.print("Test 3", "BRIGHT_Red");       // 2 String parameters: Value, Color of text
        Colors.println("Test 4", "BRIGHT_Red");     // 2 String parameters: Value, Color of text WITH a new line after
        Colors.print("Test 5", "BRIGHT_Red", "BG_Blue");         // 3 String parameters: Value, Color of text, Color of background
        Colors.println("Test 6", "BRIGHT_Red", "BG_Blue");       // 3 String parameters: Value, Color of text, Color of background WITH a new line after
        // Notice: for the colors, you must concatenate "BRIGHT_" or "BG_" to the input parameter to get the bright or background versions of the colors.
        */
        // Feel free to comment out the test code above when you start your assignment

        if(diff == 1){
            boolean status = true;
            String border = "--------------------------------------";
            int level = 1;
            boolean levelUp = true;

        while(status){
                String [] arr = new String[level];
                for(int count = 0; count < arr.length; count++){
                arr[count] = getColorWord();
                }
        System.out.println(border);                                             
        printArray(arr);
        System.out.println(border); 
        System.out.println("Memorize the phrase above!");
        System.out.println("You have: ");
        delay(5);

        for(int count = 0; count < 25; count++){
            System.out.println("");
        }

        String [] response = new String[level];
        for(int count = 0; count < arr.length; count++){
            response[count] = sc.nextLine();
        }

        for(int count = 0; count < arr.length; count++){
            if(!response[count].equals(arr[count])){
                levelUp = false;
                break;
            }
        }

        if(levelUp){
            System.out.println("You got it! Onto the next level.");
            level++;
        }
        else{
            System.out.println("You got it wrong! Try again!");
            System.out.println("The Correct Order: " );
            printArray(arr);
            status = false;
        }
                    }
                
        }
        else if(diff == 2){
            /*
                Difficulty level 2:
                    This should act the same as difficulty level 1 with the following changes:
                    The user will receive a series of colors as words AND as text color (ex. "Red", "Blue", "Green", etc.)
                    The computer will randomly choose either to check the word as text or as a color
                    The user must type in the colors in the correct order by either text or text color
                    Both the text words and the text colors should be stored to be checked later
            */
         boolean status = true;
            String border = "--------------------------------------";
            int level = 1;
            boolean levelUp = true;

        while(status){
                String [] arr = new String[level];
                for(int count = 0; count < arr.length; count++){
                arr[count] = getColorWord();
                }
                String [] arr2 = new String[level];
                for(int count = 0; count<arr.length; count++){
                arr2[count] = randomTextColor();
                }
        System.out.println(border);                                             
        for(int count = 0; count < arr.length; count++){
            Colors.println(arr[count], arr2[count]);
        }
        System.out.println(border); 
        System.out.println("Memorize the phrase above!");
        System.out.println("You have: ");
        delay(5);

        for(int count = 0; count < 25; count++){
            System.out.println("");
        }
        
        int x = ((int)(Math.random()*2+1));
        
        if(x==1){
        System.out.println("Enter the TEXTS: ");
        String [] response = new String[level];
        for(int count = 0; count < arr.length; count++){
            response[count] = sc.nextLine();
        }

        for(int count = 0; count < arr.length; count++){
            if(!response[count].equals(arr[count])){
                levelUp = false;
                break;
            }
        }
        }
        if(x==2){
            System.out.println("Enter the COLORS: ");
            String [] response = new String[level];
        for(int count = 0; count < arr.length; count++){
            response[count] = sc.nextLine();
        }
        for(int count = 0; count < arr.length; count++){
            if(!response[count].equals(arr2[count])){
                levelUp = false;
                break;
            }
        }
        }
        
        

        if(levelUp){
            System.out.println("You got it! Onto the next level.");
            level++;
        }
        else{
            System.out.println("You got it wrong! Try again!");
            System.out.println("The Correct Order: " );
            printArray(arr);
            status = false;
        }
                    }
                
        }   


        
        else if(diff == 3){
            /*
                Difficulty level 3:
                    This should act the same as difficulty level 2 with the following changes:
                    The user will receive a series of colors as words, as text color, and as background color (ex. "Red", "Blue", "Green", etc.)
                    The computer will randomly choose either to check the word as text, as a color, or as background color
                    The user must type in the colors in the correct order
                    All of the text words, the text colors and the background colors should be stored to be checked later
            */
        boolean status = true;
            String border = "--------------------------------------";
            int level = 1;
            boolean levelUp = true;

        while(status){
                String [] arr = new String[level];
                for(int count = 0; count < arr.length; count++){
                arr[count] = getColorWord();
                }
                String [] arr2 = new String[level];
                for(int count = 0; count<arr.length; count++){
                arr2[count] = randomTextColor();
                }
                String [] arr3 = new String[level];
                for(int count = 0; count<arr.length; count++){
                    arr3[count] = randomBGColor();
                }
        System.out.println(border);                                             
        for(int count = 0; count < arr.length; count++){
            Colors.println(arr[count], arr2[count], arr3[count]);
        }
        System.out.println(border); 
        System.out.println("Memorize the phrase above!");
        System.out.println("You have: ");
        delay(5);

        for(int count = 0; count < 25; count++){
            System.out.println("");
        }
        
        int x = ((int)(Math.random()*3+1));
        
        if(x==1){
        System.out.println("Enter the TEXTS: ");
        String [] response = new String[level];
        for(int count = 0; count < arr.length; count++){
            response[count] = sc.nextLine();
        }

        for(int count = 0; count < arr.length; count++){
            if(!response[count].equals(arr[count])){
                levelUp = false;
                break;
            }
        }
        }
        if(x==2){
            System.out.println("Enter the COLORS: ");
            String [] response = new String[level];
        for(int count = 0; count < arr.length; count++){
            response[count] = sc.nextLine();
        }
        for(int count = 0; count < arr.length; count++){
            if(!response[count].equals(arr2[count])){
                levelUp = false;
                break;
            }
        }
        }
        if(x==3){
            System.out.println("Enter the BACKGROUNDS: ");
            String [] response = new String[level];
        for(int count = 0; count < arr3.length; count++){
            response[count] = sc.nextLine();
        }
        for(int count = 0; count < arr3.length; count++){
            if(!response[count].equals(arr3[count])){
                levelUp = false;
                break;
            }
        }
        }
        
        

        if(levelUp){
            System.out.println("You got it! Onto the next level.");
            level++;
        }
        else{
            System.out.println("You got it wrong! Try again!");
            System.out.println("The Correct Order: " );
            printArray(arr);
            status = false;
        }
                    }
                
        }  

        
        else {
            System.out.println("Wrong number, try again.");
        }
    }

    // This method should take in a String array as a parameter and print out each element in the array.
    public static void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
	}


    // This method can be called to return a random color. This syntax is the correct syntax for the Colors class. 
    public static String getColorWord(){
        int rand = (int)(Math.random()*5);
        switch (rand){
            case 0: return "Purple";
            case 1: return "Red";
            case 2: return "Green";
            case 3: return "Yellow";
            case 4: return "Blue";
            default: return "White";
        }
    }

    // This method can be called to delay for a certain number of seconds.
    // The parameter count represents the number of seconds to delay.
    public static void delay(int count){
        for (int i = 0; i < count; i++) {
			System.out.print(count-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }
    public static String randomTextColor(){
        String [] arr = new String[8];
        arr[0] = "BRIGHT_BLACK";
        arr[1] = "BRIGHT_RED";
        arr[2] = "BRIGHT_GREEN";
        arr[3] = "BRIGHT_YELLOW";
        arr[4] = "BRIGHT_BLUE";
        arr[5] = "BRIGHT_PURPLE";
        arr[6] = "BRIGHT_CYAN";
        arr[7] = "BRIGHT_WHITE";
        int x = ((int)(Math.random()*8));
        return arr[x];
    }
    public static String randomBGColor(){
        String [] arr = new String[8];
        arr[0] = "BG_BLACK";
        arr[1] = "BG_RED";
        arr[2] = "BG_GREEN";
        arr[3] = "BG_YELLOW";
        arr[4] = "BG_BLUE";
        arr[5] = "BG_PURPLE";
        arr[6] = "BG_CYAN";
        arr[7] = "BG_WHITE";
        int x = ((int)(Math.random()*8));
        return arr[x];
    }
}
