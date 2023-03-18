package basic;

import java.util.Arrays;

public class MediumOfSubArray {

	public static void main(String[] args) {
		int N = 9;
		int M = 8;
		int A[] = { 10, 8, 8, 4, 9, 1, 6, 3, 5 };
		System.out.println(countSubarray(N, A, M));
	}

	static long countSubarray(int N, int A[], int M) {
		long c = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j <= N; j++) {
				if (check(Arrays.copyOfRange(A, i, j), M)) {
					c++;
				}
			}
		}
		return c;
	}

	static boolean check(int[] arr, int n) {
		Arrays.sort(arr);
		return (arr[arr.length / 2] == n);
	}
}
