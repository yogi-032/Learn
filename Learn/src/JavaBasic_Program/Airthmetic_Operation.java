package JavaBasic_Program;

import java.util.Scanner;

public class Airthmetic_Operation {

	public static void main(String[] args) {
		System.out.println("Enter any two positive numbers: ");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the number corresponding to your operation you want to perform::");
		System.out.println("Addition-1");
		System.out.println("Subtraction-2");
		System.out.println("Multiplication-3");
		System.out.println("Division-4");
		int c=sc.nextInt();
		int d=0;
		switch(c) {
		case 1:
			d=a+b;
		System.out.println("on adding these two numbers we get::"+d);
		break;
		case 2:
			if (a>b) {
				d=a-b;
				System.out.println("On subtracting these two numbers we get:"+d);
			}
			else {
				d=b-a;
				System.out.println("On subtracting these two numbers we get: "+d);
			}
			break;
		case 3:
			d=a*b;
			System.out.println("On multiplying these two numbers we get: "+d);
			break;
		case 4:
			d=a/b;
			System.out.println("On dividing these two numbers we get: "+d);
			break;
		} 
	}
}
	


