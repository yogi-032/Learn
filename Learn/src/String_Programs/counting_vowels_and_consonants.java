package String_Programs;

import java.util.Scanner;

public class counting_vowels_and_consonants {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a string:");
          String s=sc.nextLine();
          int a=s.length();
          int vowels=0;
          int consonants=0;
         s= s.toLowerCase();
          for(int i=0;i<a;i++) {
        	 char c=s.charAt(i);
        	 
        	  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
        		  vowels ++;
        	  }
        	  else if(c>='a'&&c<='z'){
        		  consonants++;
        	  }
        	  else {
        		  continue;
        	  }
          }
          System.out.println("The number of the consonants in the string is "+vowels);
          System.out.println("The number of the consonants in the string is "+consonants);
	}
}
