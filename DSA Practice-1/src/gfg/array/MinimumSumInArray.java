package gfg.array;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/1?page=1&category[]=Arrays&curated[]=1&curated[]=8&sortBy=submissions

public class MinimumSumInArray {

	public static void main(String[] args) {
		long A[] = { 6, 1, 9, 5, 4 };// 1 4 5 6 9
		long B[] = { 3, 4, 8, 2, 4 };// 8 4 4 3 2
		System.out.println(minValue(A, B, A.length));
	}

	public static long minValue(long a[], long b[], long n) {
		Arrays.sort(a);
		Arrays.sort(b);
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + a[i] * b[(int) n - 1 - i];
		}
		return sum;

	}
}
