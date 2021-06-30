
package String_Programs;

import java.util.Scanner;

public class punctuation_characters_in_string {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter any string.");
       String s=sc.nextLine();
       int count=0;
       for(int i=0;i<s.length();i++) {
    	   char c=s.charAt(i);
    	   if(c=='!'||c=='.'||c==','||c==';'||c=='"'||c=='?'||c=='-'||c=='\''||c=='\"'||c==':') {
    		   count++;
    	   }
       }
       System.out.println("The number of punctuations present in the given string is "+count);
	}
	

}
