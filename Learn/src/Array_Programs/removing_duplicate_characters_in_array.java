package Array_Programs;

import java.util.Scanner;

public class removing_duplicate_characters_in_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int a = sc.nextInt();
		System.out.println("Enter the elements of the array.");
		int[] A = new int[a];
		int[] B = new int[a];
		int b = 0;
		for (int i = 0; i < a; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < a; i++) {
			int count = 1;
			for (int j = i + 1; j < a; j++) {
				if (A[i] == A[j]) {
					count++;
				}
			}
			if (count <= 1) {
				B[b++] = A[i];
			}
		}
		for (int i=0;i<b;i++) {
			System.out.println(B[i]);
		}
	}

}
