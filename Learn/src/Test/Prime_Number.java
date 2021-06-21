package Test;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int a = sc.nextInt();
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
			else {
				continue;
			}
		}
       if(count>2) {
    	   System.out.println("The no is not a prime number.");
       }
       else if(count<2) {
    	   System.out.println("number is neither prime nor a composite number");
       }
       else {
    	   System.out.println("The no is a prime number.");
       }
	}

}
