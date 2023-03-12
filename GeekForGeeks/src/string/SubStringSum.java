package string;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&difficulty[]=-1&difficulty[]=0&sortBy=submissions
public class SubStringSum {

	public static void main(String[] args) {
		int N = 5, S = 12;
		int A[] = { 1, 2, 3, 7, 5 };
		System.out.println(subarraySum(A, N, S));
	}

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		ArrayList<Integer> list = new ArrayList<>();
		int[] l = new int[2];
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum == s) {
					l[0] = i - 1;
					l[1] = j - 1;
				}
			}
		}
		return list;
	}
}
