/*
 *	Author:  max s
 *  Date: 9/23/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		int Strength2 = 0;
		int Dexterity2 = 0;
		int Intelligence2 = 0;
		int Popularity2 = 0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Crescenta Valley...what's your name?");
		String name = sc.nextLine();
		System.out.println("Add a sick adjective to accompany your name:");
		String adj = sc.nextLine();
		
		System.out.println("What clique do you want to join: Nerds, Jocks, Normals?");
		String role = sc.nextLine();
		
		if(role.equals("Nerds")){
		System.out.println("Nerd! You're a Nerd!");
		}
		else if(role.equals("nerds")){
		System.out.println("Nerd! You're a Nerd!");
		}
		else if(role.equals("Jocks")){
		System.out.println("Jock! You're a Jock!");
		}
		else if(role.equals("jocks")){
		System.out.println("Jock! You're a Jock!");
		}
		else if(role.equals("Normals")){
		System.out.println("Normie! Typical!");
		}
		else if(role.equals("normals")){
		System.out.println("Normie! Typical!");
		}
		else{
		System.out.println("Alright...skipping the cliques...");
		}
		
		System.out.println("OK. You got 20 points! How are you going to spend them for:");
		System.out.println("Strength | Dexterity | Intelligence | Popularity");
		
		int Points = 20;
		
		System.out.print("Strength (1-10): ");
		int Strength = sc.nextInt();
		
		if(Strength>10){
		System.out.println("Please input a smaller integer:");
		Strength2 = sc.nextInt();
			if(Strength2>10){
				Points = (Points-Strength2);
				System.out.println("You have " + (Points) + " points left!");
			}
			if(Strength2<=10){
				Points = (Points-Strength2);
				System.out.println("You have " + (Points) + " points left!");
			}
		}
		if(Strength<=10){
		Points = (Points-Strength);
		System.out.println("You have " + (Points) + " points left!");
		}
		System.out.println(" "); //end of strength
		
		
		System.out.print("Dexterity (1-10): ");
		int Dexterity = sc.nextInt();
		
		if(Dexterity>10){
		System.out.println("Please input a smaller integer:");
		Dexterity2 = sc.nextInt();
			if(Dexterity2>10){
				Points = (Points-Dexterity2);
				System.out.println("You have " + (Points) + " points left!");
			}
			if(Dexterity2<=10){
				Points = (Points-Dexterity2);
				System.out.println("You have " + (Points) + " points left!");
			}
		}
		if(Dexterity<=10){
		Points = (Points-Dexterity);
		System.out.println("You have " + (Points) + " points left!");
		}
		System.out.println(" "); //end of Dexterity
		
		
		System.out.print("Intelligence (1-10): ");
		int Intelligence = sc.nextInt();
		
		if(Intelligence>10){
		System.out.println("Please input a smaller integer:");
		Intelligence2 = sc.nextInt();
			if(Intelligence2>10){
				Points = (Points-Intelligence2);
				System.out.println("You have " + (Points) + " points left!");
			}
			if(Intelligence2<=10){
				Points = (Points-Intelligence2);
				System.out.println("You have " + (Points) + " points left!");
			}
		}
		if(Intelligence<=10){
		Points = (Points-Intelligence);
		System.out.println("You have " + (Points) + " points left!");
		}
		System.out.println(" "); //end of Intelligence
		
		
		System.out.print("Popularity (1-10): ");
		int Popularity = sc.nextInt();
		
		if(Popularity>10){
		System.out.println("Please input a smaller integer:");
		Popularity2 = sc.nextInt();
			if(Popularity2>10){
				Points = (Points-Popularity2);
				System.out.println("You have " + (Points) + " points left!");
			}
			if(Popularity2<=10){
				Points = (Points-Popularity2);
				System.out.println("You have " + (Points) + " points left!");
			}
		}
		if(Popularity<=10){
		Points = (Points-Popularity);
		System.out.println("You have " + (Points) + " points left!");
		}
		System.out.println(" "); //end of Popularity
		
		System.out.println("--------------"); //start of end summary
		System.out.println("Welcome to CV " + adj + " " + name + "!");
		System.out.println("You are part of the " + role + "!");
		System.out.println("You have the following stats:");
		
		if(Strength<=10){
			System.out.println("Strength: " + Strength);}
		else{
			System.out.println("Strength: " + Strength2);}
		if(Dexterity<=10){
			System.out.println("Dexterity: " + Dexterity);}
		else{
			System.out.println("Dexterity: " + Dexterity2);}
		if(Intelligence<=10){
			System.out.println("Intelligence: " + Intelligence);}
		else{
		System.out.println("Intelligence: " + Intelligence2);}
		if(Popularity<=10){
			System.out.println("Popularity: " + Popularity);}
		else{
		System.out.println("Popularity: " + Popularity2);}
		System.out.println("Good luck!");
		

		
		
		
}
}
