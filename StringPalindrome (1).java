/**************************************
 FILE  NAME  : PALINROME
 PROGRAM     : WRITE A PROGRAM TO CHECK WHETHER THE GIVEN 
               STRING IS PALINDROME OR NOT.             
 AUTHOR      : BIBIN JOSE
 DATE        : 29/11/2021
**************************************/
 
package Day1;
import java.util.*;
public class StringPalindrome {

	public static void main(String [] args) {
		   String s1 = new String();
			  Scanner SC = new Scanner(System.in);
			  System.out.println("Enter the string");
			  s1 = SC.next();
			  SC.close();
			  int len=s1.length();
			  String s2="";
			  for(int i=len-1;i>=0;i--) {
				  s2 = s2 + s1.charAt(i);
				    }
			 if(s1.equals(s2)){
				 System.out.println("It is a palindrome");
	            }
				 else {
					 System.out.println("It is not a palindrome");
				 }
			 }
	}	 
			 
			
			    
			   
				
			

	


