package JAVA_NUMBER_PROGRAMS;

import java.util.Scanner;

public class Reversing_String_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.nextLine();
		int a = s.length();
		System.out.println("The length of the string is :" + a);
		int i;
		a = a - 1;
		for (i = a; i >= 0; i--) {
			char v = s.charAt(i);
			System.out.print(v);
		}
			
		}
	}

