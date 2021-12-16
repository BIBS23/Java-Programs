/**************************************
 FILE  NAME  : PALINROME
 PROGRAM     : WRITE A PROGRAM TO PRINT FREAQUENCY OF CHARACTOR.            
 AUTHOR      : BIBIN JOSE
 DATE        : 29/11/2021
**************************************/
package Day1;
import java.util.*;
public class Frequencyofchar {

	public static void main(String[] args) {
		String str;
		char ch;
		int frequency=0;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the string : ");
		str = SC.next();
	    System.out.println("Enter the charactor");
		int len = str.length();
		ch = SC.next().charAt(0);
		SC.close();
		
		for(int i=0;i<len;i++) {
			if(ch==str.charAt(i)) {
				frequency++;
			}
		}
		System.out.println("The frequency is : "+frequency);
		

	}

}
