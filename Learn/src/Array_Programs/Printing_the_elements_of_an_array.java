package Array_Programs;

import java.util.Scanner;

public class Printing_the_elements_of_an_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a=sc.nextInt();
		int[] A=new int[a];
		System.out.println("Enter the elements of the array.");
		for(int i=0;i<a;i++) {
			A[i]=sc.nextInt();
		}
		
		for(int x:A) {
		System.out.println(x);
		}
		for(int i=0;i<a;i++) {
			System.out.println(A[i]);
		
		}
	}

}
