package String_Programs;

import java.util.Scanner;

public class dividing_string_in_equal_parts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		int a=s.length();
		System.out.println("Enter the number of parts you want to divide the string.");
		int b=sc.nextInt();
		int d=a/b;
		System.out.println(d);
		int i=0;
		int c=d;
		if(a%b!=0) {
			System.out.println("The string cannot be divided in "+b+" equal parts.");
		}
		
		else {
			while(b>0) {
		
				System.out.println(s.substring(i, d));
				i=d;
				d=d+c;
				b--;
			}
		}

	}

}
