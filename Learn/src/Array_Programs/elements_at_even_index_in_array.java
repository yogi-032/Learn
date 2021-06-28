package Array_Programs;

import java.util.Scanner;

public class elements_at_even_index_in_array {

	public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of an array");
            int a=sc.nextInt();
            System.out.println("Enter the elements of the array");
	       int A[]=new int[a];
	       for(int i=0;i<a;i++) {
	    	   A[i]=sc.nextInt();
	       }
	       for(int i=0;i<a;i++) {
	    	   if(i%2!=0) {
	    		    System.out.println(A[i]);
	    	   }
	       }
	   
	}

}
