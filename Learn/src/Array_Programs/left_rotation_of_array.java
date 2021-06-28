package Array_Programs;

import java.util.Scanner;

public class left_rotation_of_array {

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
         
         for(int i=0;i<n;i++) {
        	int  temp=A[0];
        	
             for(int j=0;j<a-1;j++) {
        		 A[j]=A[j+1];
        	 }
        	 A[a-1]=temp;
         }
         for(int x:A) {
     		System.out.println(x);
     		}
	}

}
