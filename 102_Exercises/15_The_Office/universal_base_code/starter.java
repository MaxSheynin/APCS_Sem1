/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();	
		//start of my code
		
		Employee a = new Employee(1987, "Dwight", "Schrute", 4416.66);
		
		Employee b = new Employee(2474, "Jim", "Halpert", 4416.66);
		
		Employee c = new Employee(2011, "Pam", "Beesly", 2250);
		
		Employee d = new Employee(6767, "Roy", "Anderson", 500.3);
		
		a.raiseSalary(25);
		b.raiseSalary(60);
		c.raiseSalary(70);
		d.raiseSalary(81);
		
		a.employeeToString();
		b.employeeToString();
		c.employeeToString();
		d.employeeToString();
		
		System.out.println("Annual salaries: ");
		System.out.println("Dwight: " + a.getAnnualSalary());
		System.out.println("Jim: " + b.getAnnualSalary());
		System.out.println("Pam: " + c.getAnnualSalary());
		System.out.println("Roy: " + d.getAnnualSalary());
		System.out.println("----------------------");
	}
}
