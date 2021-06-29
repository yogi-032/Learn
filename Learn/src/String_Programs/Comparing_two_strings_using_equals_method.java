package String_Programs;

import java.util.Scanner;

public class Comparing_two_strings_using_equals_method {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter your first string.");
		   String a=sc.nextLine();
		   System.out.println("Enter the second string.");
		   String b=sc.nextLine();
		   if(a.equalsIgnoreCase(a)) {
			   System.out.println("Both the strings are same.");
		   }
		   else {
			   System.out.println("Both the strings are not same");
		   }

	}

}
