/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        
        double item1Price = 3.29;
        double item2Price = 1.03;
        double item3Price = 5.71;
        
        System.out.println();
        System.out.println("Welcome to my super cool boba shop 🧋");
        System.out.println();
        System.out.println("Here is THE MENU:");
        System.out.println("boba drink 🧋- " + item1Price);
        System.out.println("matcha 🍵 - " + item2Price);
        System.out.println("asparagus 🥬 -"+ item3Price);
        
        
        System.out.println();
        System.out.println("What's the name for your order?");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("How many boba drinks do u want to consume?");
        int quantity1 = sc.nextInt();
        System.out.println();
        
        System.out.println("How much matcha u want to drink?");
        int quantity2 = sc.nextInt();
        System.out.println();
        
        System.out.println("how many asparagus u eat???");
        int quantity3 = sc.nextInt();
        System.out.println();
        
        double total1 = (item1Price * quantity1);
        double total2 = (item2Price * quantity2);
        double total3 = (item3Price * quantity3);
        double currentTotal = total1 + total2 + total3;
        System.out.println("ur current total is: $" + currentTotal);
        
        System.out.println();
        System.out.println("what percent do u want to tip?");
        double tipPercent = sc.nextDouble();
        double tip = (currentTotal*(tipPercent/100));
        
        double grandTotal = (currentTotal + tip);
        
        System.out.println();
        System.out.println("here is " + name + "'s" + " receipt:");
        System.out.println(quantity1 + " x" + " boba drink = " + total1);
        System.out.println(quantity2 + " x" + " matcha = " + total2);
        System.out.println(quantity3 + " x" + " asparagus = " + total3);
        System.out.println("Tip Percent: " + tipPercent);
        System.out.println(); 
        System.out.println("Grand total: " + grandTotal);
        
        
        
	}
}
