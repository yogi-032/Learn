package Array_Programs;

public class copying_elements_of_array {

	public static void main(String[] args) {
       int A[]={1,2,3,4,5};
       int B[]=new int[A.length];
      for(int i=0;i<A.length;i++) {
    	  B[i]=A[i];
      }
    	  System.out.print("The elements of the old array is: ");
      for(int i=0;i<A.length;i++) {
    	     System.out.print(A[i]+" ");
      }
      System.out.println( );
    	     System.out.print("The elements of the new array is: ");
      for(int i=0;i<A.length;i++) {
      System.out.print(B[i]+" "); 
      }
	}
}
