package Test;

import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number.");
		int a=sc.nextInt();
	    int factorial=1;
        for(int i=a;i>0;i--){
        	factorial=factorial*i;
        }
        System.out.println("The factorial of the given no is:"+factorial);
	}

}
