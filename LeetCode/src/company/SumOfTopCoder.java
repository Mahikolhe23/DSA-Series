package company;

import java.util.Arrays;

public class SumOfTopCoder {
	// sum of top coder marks
	public static void main(String[] args) {
		int n = 4;
		int k = 2;
		int[] arr = { 4, 1, 2, 5 };
		System.out.println(sumOfMarksOfCoders(n, k, arr));
	}

	public static int sumOfMarksOfCoders(int n, int k, int[] arr) {
		int sum = 0;
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= k; i--) {
			sum += arr[i];
		}
		return sum;
	}
}
