package Array_Programs;

import java.util.Scanner;

public class largest_element_of_an_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a=sc.nextInt();
		int[] A=new int[a];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a;i++) {
			A[i]=sc.nextInt();
		}
		int max=A[0];
          for(int i=0;i<a-1;i++) {
        	  if(A[i]<A[i+1]) {
        		  max=A[i+1];
        	  }
          }
          System.out.println("The largest element in the array is "+max);
	}

}
