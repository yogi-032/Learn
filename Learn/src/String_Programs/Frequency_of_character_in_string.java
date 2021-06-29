package String_Programs;

import java.util.Scanner;

public class Frequency_of_character_in_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		System.out.println("Enter a charcter you want to know the occurence: ");
		String c=sc.next();
		int l=s.length();
		int count=0;
		if(c.length()<=1) {
		for(int i=0;i<l;i++) {
			char d=s.charAt(i);
			if(d==c.charAt(0)) {
				count++;
			}
			else {
				continue;
			}
		
		}
		System.out.println("The character you have inserted is occuring  " + count+" times.");
		}
		else {
			System.out.println("We cannot find the occurence please kindly enter only one character.");
		}
	}

}