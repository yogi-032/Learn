package JavaBasic_Program;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter any number:");
	   int a=sc.nextInt();
	   int number=a;
	   int reverse=0;
      for(int i=0;a>0;i++) {
    	  int b=a%10;
    	  reverse=reverse*10+b;
    	  a=a/10;
      }
      if(number==reverse) {
    	  System.out.println("the given no is  a palindrome");
      }
      else {
    	  System.out.println("the given no is not a palindrome");
      }
	}

}
