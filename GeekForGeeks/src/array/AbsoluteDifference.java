package array;

import java.util.Arrays;

public class AbsoluteDifference {

	public static void main(String[] args) {
		int[] A = { 4, 1, 8, 7 };
		int[] B = { 2, 3, 6, 5 };
		System.out.println(findMinSum(A, B, A.length));
	}

	public static long findMinSum(int[] A, int[] B, int N) {
		Arrays.sort(A);
		Arrays.sort(B);
		long sum = 0;
		for (int i = 0; i < A.length; i++) {
			if ((A[i] - B[i]) < 0) {
				sum = sum + ((A[i] - B[i]) * -1);
				System.out.print("i = " + i + " sum = " + sum + " ");
				continue;
			}
			sum = sum + (A[i] - B[i]);
			System.out.print("i = " + i + " sum = " + sum + " ");
		}
		return sum;
	}
}
