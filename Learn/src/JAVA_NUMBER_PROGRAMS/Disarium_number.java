package JAVA_NUMBER_PROGRAMS;

import static java.lang.Math.*;
import java.util.Scanner;

public class Disarium_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int a = sc.nextInt();
		double sum = 0;
		int temp = a;
		int length = 0;
		long d = 1;
		while (d <= a) {
			length++;
			d *= 10;
		}
		System.out.println(length);
		double e = 0;
		for (int i = length - 1; i >= 0; i--) {
			e = a % 10;
			sum = sum + Math.pow(e, i + 1);
			a = a / 10;
		}

		if (sum == temp) {
			System.out.println("The number is a Disarium number");
		} else {
			System.out.println("The number is not a Disarium number");
		}
	}

}
