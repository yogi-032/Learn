package JavaBasic_Program;

import java.util.Random;
import java.util.Scanner;

public class RANDOM_NUMBER_BYCLASS {
	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many random number you want to be displayed on your screen.");
		int a=sc.nextInt();
		Random random=new Random();
		
		for(int i=1;i<=a;i++) {
			System.out.println("the "+i+" random number is "+random.nextInt(10000));
			}
		
		

	}

}
