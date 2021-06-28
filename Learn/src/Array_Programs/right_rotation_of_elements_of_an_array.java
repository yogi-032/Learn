package Array_Programs;

import java.util.Scanner;

public class right_rotation_of_elements_of_an_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a=sc.nextInt();
		int[] A=new int[a];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a;i++) {
			A[i]=sc.nextInt();
		}
         System.out.println("Enter the times of rotation:");
         int n=sc.nextInt();
         int temp;
         for(int i=0;i<n;i++) {
        	 temp=A[a-1];
        	 for(int j=a-1;j>0;j--) {
        		 A[j]=A[j-1];
        	 }
        	 A[0]=temp;
         }
         for(int x:A) {
        	 System.out.println(x);
         }

	}

}
