package Day2;

import java.util.Scanner;

public class Areaofshapes {
	
	public float area(int radius) {
		
		return (float) (3.14*radius*radius);
	}
	
public int area(int len , int breadth) {
		
		return len*breadth;
	}

public float area(float height , float base) {
	
	return (float)(0.5*height*base);
}

public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Areaofshapes a = new Areaofshapes();
	
	int choice;
	
	System.out.println(">>>>>>>>>>>>>>> AREAS <<<<<<<<<<<<<<\n");
	
	System.out.println("ENTER YOUR CHOICE\n1. CIRCLE\n2. RECTANGLE\n3. TRIANGLE\n");
	
	choice=sc.nextInt();
	
	switch(choice) {
	
	case 1 :
		int rad;
		System.out.println("Enter the radius of circle : \n");
		
		rad=sc.nextInt();
		
		float circleArea= a.area(rad);
		
		System.out.println("The area of circle:  "+circleArea);
		
		break;
		
	case 2 :
		int length, breadth;
		System.out.println("Enter the length of rectangle : \n");
		
		length=sc.nextInt();
		
         System.out.println("Enter the breadth of rectangle : \n");
		
		breadth=sc.nextInt();
		
		int rectanglArea= a.area(length,breadth);
		
		System.out.println("The area of rectangle:   "+rectanglArea);
		
		break;
		
	case 3 :
		float base, height;
		System.out.println("Enter the height of triangle : \n");
		
		height=sc.nextFloat();
		
         System.out.println("Enter the baselength of rectangle : \n");
		
		base=sc.nextFloat();
		
		float trianglenglArea= a.area(height,base);
		
		System.out.println("The area of triangle:   "+trianglenglArea);
		
		break;
		
		default :
			System.out.println("Do enter a valid choice");
	}
	
	
}
		
        
}
