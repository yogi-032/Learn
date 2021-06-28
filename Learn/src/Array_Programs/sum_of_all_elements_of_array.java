package Array_Programs;

import java.util.Scanner;

public class sum_of_all_elements_of_array {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a=sc.nextInt();
		int[] A=new int[a];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a;i++) {
			A[i]=sc.nextInt();
		}
        int sum=0;
        for(int i=0;i<a;i++) {
        	sum=sum+A[i];
        }
        System.out.println(sum);
	}

}
