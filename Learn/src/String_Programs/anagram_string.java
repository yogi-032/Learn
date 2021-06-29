package String_Programs;

import java.util.Scanner;
import java.util.Arrays;

public class anagram_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string.");
		String a = sc.nextLine();
		System.out.println("Enter the second string.");
		String b = sc.nextLine();
		System.out.println(a.length());
		System.out.println( b.length());
		if (a.length() == b.length()) {
			a = a.toLowerCase();
			b = b.toLowerCase();
			System.out.println(a);
			System.out.println(b);
			char[] A = a.toCharArray();
			char[] B = b.toCharArray();
			Arrays.sort(A);
			Arrays.sort(B);
		//	if (A.toString().equals(B.toString()))
			if(Arrays.equals(A, B)){
				System.out.println("Both the strings are anagram.");
			} else {
				System.out.println("Both the strings are not anagram.");
			}

		} else {
			System.out.println("Both the strings are not anagram.");
		}
	}
}
