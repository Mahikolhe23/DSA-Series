package basic;

import java.util.ArrayList;
import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/common-elements1132/1?page=1&difficulty[]=0&sortBy=submissions
public class CommonElement {

	public static void main(String[] args) {
		int n1 = 6;
		int[] A = { 1, 5, 10, 20, 40, 80 };
		int n2 = 5;
		int[] B = { 6, 7, 20, 80, 100 };
		int n3 = 8;
		int[] C = { 3, 4, 15, 20, 30, 70, 80, 120 };
		System.out.println(commonElements(A, B, C, n1, n2, n3));
	}

	public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
		int len = Math.min(n1, (Math.min(n2, n3)));
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		for (int i = 0; i < len; i++) {
			if (A[i] == B[i] && B[i] == C[i])
				list.add(A[i]);
		}
		return list;
	}
}
