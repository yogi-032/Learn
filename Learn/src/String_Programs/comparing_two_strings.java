package String_Programs;

import java.util.Scanner;

public class comparing_two_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your first string.");
   String a=sc.nextLine();
   System.out.println("Enter the second string.");
   String b=sc.nextLine();
   boolean flag=true;
   if(a.length()==b.length()) {
	   for(int i=0;i<a.length();i++) {
		   if(a.charAt(i)!=b.charAt(i)) {
			   flag=false;
			   break;
		   }
	   }
	   if(flag) {
		   System.out.println("Both the strings are same.");
	   }else {
		   System.out.println("Both the strings are not same.");
	   }
   }
	}

}
