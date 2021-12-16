/**************************************
 FILE  NAME  : PALINROME
 PROGRAM     : Write a program to display the engineer salary and to display
               from Employee class using a single object instantiation.            
 AUTHOR      : BIBIN JOSE
 DATE        : 13/12/2021
**************************************/
package Day3;
import java.util.Scanner;
class Employee{
	float GrossSalary;
	void display(double GrossSalary) {
		System.out.println("The Gross Salary of Engineer is : "+GrossSalary);	
		
	}
	void CalSalary(int bs,float da,float hra) {
		GrossSalary=(bs+(da/100)*bs+(hra/100)*bs);
		
	}
	
}
class Engineer extends Employee{ 
		
}

public class InheritEmployee {

	public static void main(String[] args) {
		int basicsalary;
		float hra,da;
		double GrossSalary;
		Scanner Sc = new Scanner(System.in);
	    Engineer engineer = new Engineer();
	    System.out.println("Enter the Basic Salary of the Engineer :");
	    basicsalary=Sc.nextInt();
	    System.out.println("Enter the DA of the Engineer :");
	    da=Sc.nextInt();
	    System.out.println("Enter the HRA of the Engineer :");
	    hra=Sc.nextInt();	
	    engineer.CalSalary(basicsalary,da,hra);
	    GrossSalary=engineer.GrossSalary;
	    engineer.display(GrossSalary);
		
	}

}
