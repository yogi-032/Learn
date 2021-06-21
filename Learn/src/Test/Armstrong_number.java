package Test;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int a=sc.nextInt();
		int sum=0;
		int temp=a;
		while(a>0) {
			int b=a%10;
			sum=sum+b*b*b;
			a=a/10;
		}
		if(temp==sum) {
			System.out.println("The given number is a armstrong number");
		}
		else {
		System.out.println("The given no is not a armstrong number.");
		}
	}

}
