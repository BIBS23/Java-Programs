/********************************************************************************************
Author      :Bibin Jose
Date        :13/12/2021
Program     :Program to to create an abstract class named Shape that contains an empty method named numberOfSides(). 
             Provide three classes named Rectangle, Triangle and Hexagon such that each one of the classes extends
             the class Shape. Each one of the classes contains only the method numberOfSides() that shows the number
             of sides in the given geometrical structures.
Version     :1.0
**********************************************************************************************/
package Day3;
import java.io.*;
import java.util.Scanner;
abstract class shape{
    public void numberOfSides(){

    }
}
class Triangle extends shape{
    public void numberOfSides(){
        System.out.println("TRIANGLE has 3 sides");
    }
}
class Rectangle extends shape{
    public void numberOfSides(){
        System.out.println("RECTANGLE has 4 sides");
    }
}
class Hexagon extends shape{
    public void numberOfSides(){
        System.out.println("HEXAGON has 6 sides");
    }
}
public class Abstract {
    public static void main(String[]args){
        Triangle triangle=new Triangle();
        Rectangle rectangle=new Rectangle();
        Hexagon hexagon=new Hexagon();
        triangle.numberOfSides();
        rectangle.numberOfSides();
        hexagon.numberOfSides();
    }
}
	
	
	
