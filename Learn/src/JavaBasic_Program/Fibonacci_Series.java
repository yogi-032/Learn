package JavaBasic_Program;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number till which you want to get the fibonacci series:");
	int a=sc.nextInt();
	int  A[]=new int[a];
	A[0]=0;
	A[1]=1;
	int i=1;
	for(i=2;i<=a-1;i++) {
		A[i]=A[i-2]+A[i-1];
	}
	for(int c=0;c<i;c++) {
		System.out.println(A[c]);
	}

}
}