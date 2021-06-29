package String_Programs;

import java.util.Scanner;

public class Duplicate_Characterin_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string.");
		String s = sc.nextLine();
		int a = s.length();
		char A[] = new char[a];
		for (int i = 0; i < a; i++) {
			boolean flag = true;
			char b = s.charAt(i);
			int count = 1;
			if (s.charAt(i) != ' ') {

				for (int c = i + 1; c < a; c++) {
					if (b == s.charAt(c)) {
						count++;
					}

				}
				for (char x : A) {
					if (x == b) {
						flag = false;
						break;
					}
				}
				if(count>1) {if (flag) {
					System.out.println("The duplicate character is "+b+" and it is occuring " +  count +" times.");
				}
				}
			}
			A[i] = b;
		}
	}
}