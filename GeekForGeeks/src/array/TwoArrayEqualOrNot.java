package array;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=1&category[]=Arrays&curated[]=1&curated[]=8&sortBy=submissions
public class TwoArrayEqualOrNot {

	public static void main(String[] args) {
		long A[] = { 1, 2, 5, 4, 0 };
		long B[] = { 2, 4, 5, 0, 1 };
		System.out.println(check(A, B, A.length));
	}

	public static boolean check(long A[], long B[], int N) {
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i]) {
				return false;
			}
		}
		return true;
	}
}
