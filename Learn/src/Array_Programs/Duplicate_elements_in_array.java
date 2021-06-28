package Array_Programs;

import java.util.Scanner;

public class Duplicate_elements_in_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a = sc.nextInt();
		System.out.println("Enter the elements of the array.");
		int[] A = new int[a];
		int[] B = new int[a];
		for (int i = 0; i < a; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < a; i++) {
			int count = 1;
			boolean flag = true;
			for (int j = i + 1; j < a; j++) {
				if (A[i] == A[j]) {
					count++;
				}
			}
			for (int b = 0; b <= i; b++) {
				if (A[i] == B[b]) {
					flag = false;
					break;
				}
			}
			if (count > 2) {
				if (flag) {
					System.out.println(A[i] + "|" + count);
				}
			}
			B[i] = A[i];
		}
	}

}
