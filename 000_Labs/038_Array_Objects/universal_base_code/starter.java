/*
 *	Author:  max sheynin
 *  Date: 11/19/25
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		
	Wizard [] wizards = new Wizard[100];
        Warrior [] warriors = new Warrior[100];

        for(int count = 0; count < wizards.length; count++){
            wizards[count] = new Wizard();
        }
        for(int count = 0; count < warriors.length; count++){
            warriors[count] = new Warrior();
        }

        int WizardAmt = 100;
        int WarriorAmt = 100;

        while((WizardAmt > 0) && (WarriorAmt > 0)) {
            wizards[WizardAmt-1].attack(warriors[WarriorAmt-1]);
            if(warriors[WarriorAmt-1].isDead()){
                WarriorAmt--;
            }
            if(WarriorAmt==0){
            	break;
            }
            warriors[WarriorAmt-1].attack(wizards[WizardAmt-1]);
            if(wizards[WizardAmt-1].isDead()){
                WizardAmt--;
            }
            if(WizardAmt==0){
            	break;
            }
        }

        if(WarriorAmt==0){
            System.out.println("Wizards win! They have this many fighters left: " + WizardAmt);
        }
        if(WizardAmt==0){
            System.out.println("Warriors win! They have this many fighters left: " + WarriorAmt);
        }

    }
}
		
	
	

