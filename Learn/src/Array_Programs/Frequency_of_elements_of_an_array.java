package Array_Programs;

import java.util.Scanner;

public class Frequency_of_elements_of_an_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		System.out.println("Enter a charcter you want to know the occurence: ");
		char c=sc.next().charAt(0);
		int l=s.length();
		int count=0;
		for(int i=0;i<l;i++) {
			char d=s.charAt(i);
			if(d==c) {
				count++;
			}
			else {
				continue;
			}
		}
		System.out.println("The character you have inserted is occuring  " + count+" times.");

	}

}
