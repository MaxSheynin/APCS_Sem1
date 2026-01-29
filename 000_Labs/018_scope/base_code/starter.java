/*
 *	Author:max s
 *  Date:9/30/25
*/

import java.util.*;

public class starter {
    public static void main(String[] args) {
        
        String message = "";
        int number = 10;

        if (number > 5) {
            message = "Number is greater than 5!";
        }

        System.out.println(message);
        
        int bonus = 0;

        if (number < 20) {
            bonus = 5;
            number = number + bonus;
        }

        System.out.println("Bonus was: " + bonus);
        
        int x = 0;

        if (x == 0) {
            System.out.println("x is zero!");
        }
        x = 0;

        number = 100;
        System.out.println("Final number: " + number);
    }
}
