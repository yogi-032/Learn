package Array_Programs;

import java.util.Scanner;

public class Frequency_of_elements_of_an_array {
           public static void main(String[] args) {
        	   Scanner sc=new Scanner(System.in);
        	   System.out.println("Enter the size of the array:");
        	   int a=sc.nextInt();
        	   int[] A=new int[a];
        	   int[] B=new int[a];
        	   System.out.println("Enter the elements of the array");
        	  for(int i=0;i<a;i++) {
        		  A[i]=sc.nextInt();
        	  }
        	  int visited=-1;
        	
        	  for(int i=0;i<a;i++) {
        		  int count=1;
        		  boolean flag=true;
        		  for(int j=i+1;j<a;j++) {
        			  if(A[i]==A[j]) {
        				  count++;
        				  B[j]=visited;
        			  }
        			  
        		  }
        		  if(B[i]!=visited) {
        			  B[i]=count;
        		  }
        	  }
        	  for(int i=0;i<a;i++) {
        		  if(B[i]!=visited) {
        			  System.out.println(A[i]+"|"+B[i]);
        		  }
        	  }
        	   
           }
}