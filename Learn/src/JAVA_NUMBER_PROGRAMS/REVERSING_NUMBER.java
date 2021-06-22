package JAVA_NUMBER_PROGRAMS;

import java.util.Scanner;

public class REVERSING_NUMBER {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter any number:");
       int a=sc.nextInt();
       int reverse=0;
       while(a>0) {
    	   int b=a%10;
    	   reverse=reverse*10+b;
    	   a=a/10;
       }
       System.out.println("The reverse of the number is "+reverse);
	}

}
