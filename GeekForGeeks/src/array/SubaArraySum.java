package array;

import java.util.ArrayList;

public class SubaArraySum {
//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&category[]=Searching&category[]=Binary%20Search&sortBy=submissions
	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 7, 5 };
		int N = 5, S = 12;
		System.out.println(subarraySum(A, N, S));
	}

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			list.add(i);
			if (sum == s) {
				break;
			}
		}
		return list;
	}
}
