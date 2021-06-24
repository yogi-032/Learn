package JAVA_NUMBER_PROGRAMS;

import java.util.Scanner;

public class Palinndrome_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		int b=s.length();
		char A[]=new char[b];
		b=b-1;
		for(int i=b;i>=0;i--) {
			A[b-i]=s.charAt(i);
					
		}
	  String c=s;
	  for(int d=0;d<=b;d++) {
		  c=s.replace(s.charAt(d), A[d]);
	  }
	  if(s.equals(c)) {
		  System.out.println("The string is a palindrome.");
	  }
	  else {
		  System.out.println("The string is not a palindrome");
	  }

	}

}
