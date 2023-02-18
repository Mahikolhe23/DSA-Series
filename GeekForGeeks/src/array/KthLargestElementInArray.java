package array;

import java.util.Arrays;

public class KthLargestElementInArray {

	public static void main(String[] args) {
		int[] arr = { 12, 5, 787, 1, 23 };
		System.out.println(Arrays.toString(kLargest(arr, arr.length, 2)));
	}

	public static int[] kLargest(int[] arr, int n, int k) {
		int temp[] = new int[k];
		Arrays.sort(arr);
		for (int i = 0; i < k; i++) {
			temp[i] = arr[n - 1 - i];
		}
		return temp;
	}
}
