package Day3;

import java.util.Scanner;

class Employee1{
	
	String name,Address;
	int age,salary;
	long phoneNumber;
	void printSalary() {
		System.out.println("The salary of the employee is "+ salary);
	}
	
}
class Officer extends Employee1{
	String specialization;
}
class Manager extends  Employee1{
	String department;
}

public class Inherit_Employee_2 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Officer officer = new Officer();
		Manager manager = new Manager();
		System.out.println("---------OFFICER-------");
		System.out.println("Enter the name : ");
		officer.name=sc.next();
		System.out.println("Enter the age : ");
		officer.age=sc.nextInt();
		System.out.println("Enter the phone number :");
		officer.phoneNumber=sc.nextLong();
		System.out.println("Enter the address : ");
		officer.Address=sc.next();
		System.out.println("Enter the salary : ");
		officer.salary=sc.nextInt();
		System.out.println("Enter the specialization : ");
		officer.specialization=sc.next();
		System.out.println("---------MANAGER--------");
		System.out.println("Enter the name : ");
		manager.name=sc.next();
		System.out.println("Enter the age : ");
		manager.age=sc.nextInt();
		System.out.println("Enter the phone number :");
		manager.phoneNumber=sc.nextLong();
		System.out.println("Enter the address : ");
		manager.Address=sc.next();
		System.out.println("Enter the salary : ");
		manager.salary=sc.nextInt();
		System.out.println("Enter the department : ");
		manager.department=sc.next();
		officer.printSalary();
		manager.printSalary();
		System.out.println("Officer : ");
		System.out.println("Name : "+officer.name);
		System.out.println("Age : "+officer.age);
		System.out.println("Phone Number : "+officer.phoneNumber);
		System.out.println("Address : "+officer.Address);
		System.out.println("Salary : "+officer.salary);
		System.out.println("Specialization : "+officer.specialization);
		System.out.println("Manager : ");
		System.out.println("Name : "+manager.name);
		System.out.println("Age : "+manager.age);
		System.out.println("Phone Number : "+manager.phoneNumber);
		System.out.println("Address : "+manager.Address);
		System.out.println("Salary : "+manager.salary);
		System.out.println("Department : "+manager.department);
	sc.close();	
	}
}
