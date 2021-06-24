package JAVA_NUMBER_PROGRAMS;

import java.util.Scanner;

public class Palindrome_String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a string.");
          String s=sc.nextLine();
          boolean flag=true;
          s=s.toLowerCase();
          for(int i=0;i<s.length()/2;i++) {
        	 if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
        		 flag=false;
        		 break;
        	 }
        	 
          }if(flag) {
         	 System.out.println("The string is  a palindrome");
        	 
           }else {
         	  System.out.println("The string is not a palindrome.");
           }
	}

}
