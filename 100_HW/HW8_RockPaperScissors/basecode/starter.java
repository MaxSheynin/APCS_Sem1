/*
 *	Author: max sheynin
 *  Date: 10/17/25
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    
    public static String getObject(int a){
        if(a==1){
            return "rock";
        }
        if(a==2){
            return "paper";
        }
        else{
            return "scissors";
         }
                                         }

    public static int compare2(String player1, String player2){
        if((player1.equals("rock"))&&(player2.equals("rock"))){
            return 0;
        }
        else if((player1.equals("rock"))&&(player2.equals("paper"))){
            return 2;
        }
        else if((player1.equals("rock"))&&(player2.equals("scissors"))){
            return 1;
        }
        else if((player1.equals("paper"))&&(player2.equals("paper"))){
            return 0;
        }
        else if((player1.equals("paper"))&&(player2.equals("rock"))){
            return 1;
        }
        else if((player1.equals("paper"))&&(player2.equals("scissors"))){
            return 2;
        }
        else if((player1.equals("scissors"))&&(player2.equals("scissors"))){
            return 0;
        }
        else if((player1.equals("scissors"))&&(player2.equals("paper"))){
            return 1;
        }
        else{
            return 2;
        }
                                                                }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String userInput;
        String userMove = "";

        while(true){
            System.out.println("Would you like to play the computer? (yes/no/done)");
            userInput = sc.nextLine();
            
            if(userInput.equals("done")){
                System.out.println("Goodbye!");
                break;
            }

            if(userInput.equals("yes")){
                System.out.println("-----------");
                while(true){
                    System.out.println("Please enter rock/paper/scissors:");
                    userMove = sc.nextLine();
                    if((userMove.equals("rock"))||(userMove.equals("paper"))||(userMove.equals("scissors"))){
                        break;
                    }
                }

                int randomNum = (int)(Math.random() * 3) + 1; 
                String computerMove = getObject(randomNum);

                System.out.println("You did: " + userMove);
                System.out.println("The computer did: " + computerMove);

                if(userMove.equals(computerMove)){
                    System.out.println("Tie!");
                }
                else if((userMove.equals("rock"))&&(computerMove.equals("scissors"))){
                    System.out.println("You win!");
                }
                else if((userMove.equals("scissors"))&&(computerMove.equals("paper"))){
                    System.out.println("You win!");
                }
                else if((userMove.equals("paper"))&&(computerMove.equals("rock"))){
                    System.out.println("You win!");
                }
                else{
                    System.out.println("You lose!");
                }
            }

            if(userInput.equals("no")){
                System.out.println("--------");
                System.out.println("How many times would you like the computer to play itself?");
                int userInput2 = sc2.nextInt();

                int player1Wins = 0;
                int player2Wins = 0;
                int ties = 0;
                int thing = 0;

               while (thing < userInput2){
             int num1 = (int)(Math.random() * 3) + 1;
                    int num2 = (int)(Math.random() * 3) + 1;
                    String player1 = getObject(num1);
                    String player2 = getObject(num2);

                    int result = compare2(player1, player2);

                    if(result == 0){
                        ties = ties + 1;
                    }
                    if(result == 1){
                        player1Wins = player1Wins + 1;
                    }
                    if(result == 2){
                        player2Wins = player2Wins + 1;
                    }

                    thing = thing + 1;
                                    }

                System.out.println("SUMMARY!");
                System.out.println("Player 1 wins: " + player1Wins);
                System.out.println("Player 2 wins: " + player2Wins);
                System.out.println("Ties: " + ties);
                    } 
             }
                                             }
                 }       
    