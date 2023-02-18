package array;

//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&category[]=Arrays&sortBy=submissions
public class MaxSumInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -2, 5 };
		System.out.println(maxSubarraySum(arr, arr.length));
	}

	public static long maxSubarraySum(int arr[], int n) {
		int i;
		int sum = 0;
		for (i = 0; i < arr.length; i++) {
			if (0 < arr[i]) {
				sum = sum + arr[i];
			}
		}
		if (sum > 0) {
			return sum;
		}
		return -1;
	}
}
