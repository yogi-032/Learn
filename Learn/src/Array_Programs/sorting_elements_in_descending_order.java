package Array_Programs;

import java.util.Scanner;

public class sorting_elements_in_descending_order {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a =sc.nextInt();
		System.out.println("Enter the elements of the array");
		int[] A=new int[a];
		for(int i=0;i<a;i++) {
			A[i]=sc.nextInt();
		}
     for(int i=0;i<a;i++) {
    	 for(int j=i+1;j<a;j++) {
    		 if(A[i]<A[j]) {
    			 int temp=A[i];
    			 A[i]=A[j];
    			 A[j]=temp;
    		 }	 
    	 }
       }
     for(int x:A) {
    	 System.out.println(x);
     }

	}

}
