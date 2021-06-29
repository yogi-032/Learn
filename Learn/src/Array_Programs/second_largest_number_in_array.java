package Array_Programs;

import java.util.Scanner;
import java.util.Arrays;

public class second_largest_number_in_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a=sc.nextInt();
		int[] A=new int[a];
		System.out.println("Enter the elements of the array.");
		for(int i=0;i<a;i++) {
			A[i]=sc.nextInt();
		}
		Arrays.sort(A);
		System.out.println(A[a-2]);
		
			}
		

	}


