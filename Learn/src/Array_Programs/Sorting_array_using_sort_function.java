package Array_Programs;

import java.util.Scanner;
import java.util.Arrays;

public class Sorting_array_using_sort_function {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of the array");
     int a=sc.nextInt();
      int[] A=new int[a];
      for(int i=0;i<a;i++) {
    	  A[i]=sc.nextInt();
      }
      Arrays.sort(A);//will sort the array in ascending order.
      for(int x:A) {
    	  System.out.println(x);
      }
      
	}

}
