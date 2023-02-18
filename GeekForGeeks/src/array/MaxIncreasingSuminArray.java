package array;

public class MaxIncreasingSuminArray {
//https://practice.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence4749/1?page=4&category[]=Arrays&category[]=Dynamic%20Programming&sortBy=submissions
	public static void main(String[] args) {
		int arr[] = { 20, 8, 27, 37, 9, 12, 46 };
		System.out.println(maxSumIS(arr, arr.length));
	}

	public static int maxSumIS(int arr[], int n) {
		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				sum = sum + arr[i];
				System.out.print(sum + " " + i + " ");
			}
		}
		if (arr[arr.length - 2] < arr[arr.length - 1]) {
			sum = sum + arr[arr.length - 1];
		}
		return sum;
	}
}
