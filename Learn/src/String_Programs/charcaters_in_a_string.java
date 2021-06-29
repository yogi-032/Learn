package String_Programs;

import java.util.Scanner;

public class charcaters_in_a_string {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any string: ");
     String s=sc.nextLine();
     int count=0;
     for(int i=0;i<s.length();i++) {
    	if(s.charAt(i)!=' ') {
    		count++;
    	}
    
     }
 	System.out.println("The total numbers of the characters in the given string is "+count);
	}

}
