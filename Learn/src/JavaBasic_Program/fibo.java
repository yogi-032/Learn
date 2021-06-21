package JavaBasic_Program;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c=0;
		int n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n-2;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}

	}

}
