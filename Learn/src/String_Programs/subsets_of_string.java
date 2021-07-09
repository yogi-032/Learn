package String_Programs;

import java.util.Scanner;

public class subsets_of_string {

	public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter a string:");
   String s=sc.nextLine();
   int a=s.length();
   for(int i=0;i<a;i++) {
	   for(int j=i;j<a;j++) {
		   System.out.println(s.substring(i, j+1));
	   }
   }
   
   
	}

}
