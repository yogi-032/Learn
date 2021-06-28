package Array_Programs;

import java.util.Scanner;

public class printing_the_elements_in_reverse_order {
           public static void main(String[] args) {
        	   System.out.println("Enter the size of the array");
        	   Scanner sc=new Scanner(System.in);
        	   int a=sc.nextInt();
        	   int A[]=new int[a];
        	   System.out.println("Enter the elements of the array.");
        	   for(int i=0;i<a;i++) {
        		   A[i]=sc.nextInt();
        	   }
        	   for(int i=a-1;i>=0;i--) {
        		   System.out.println(A[i]);
        	   }
        	   
           }
}
