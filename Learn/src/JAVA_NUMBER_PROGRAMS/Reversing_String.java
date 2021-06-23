package JAVA_NUMBER_PROGRAMS;

import java.util.Scanner;

public class Reversing_String {
	static String s;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		s=sc.nextLine();
		int a=s.length();
		String b = null;
		System.out.println("The length of the string:"+a);
	     char A[]=new char[a];
	     int i=0;
	     a=a-1;
		for( i=0;i<=a;i++)
		{  char v =s.charAt(i);
			A[a-i]=v;
			
//			System.out.println(v);
		}  
		System.out.println(A);
	}
	}