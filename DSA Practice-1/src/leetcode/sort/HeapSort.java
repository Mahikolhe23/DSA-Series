package leetcode.sort;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = { 9, 3, 4, 11, 2, };
		heap(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	// using min heap
	public static void heap(int[] arr, int len) {
		if (len <= 1) {
			return;
		}
		for (int i = len - 1; i > 0; i--) {
			if (arr[i] > arr[(i - 1) / 2]) {// i=3 => 9, 11, 4, 3, 2, .....i=2=>11, 9, 4, 3, 2
				int temp = arr[i];
				arr[i] = arr[(i - 1) / 2];
				arr[(i - 1) / 2] = temp;
			}
		}
		int temp = arr[0];
		arr[0] = arr[len - 1];
		arr[len - 1] = temp;
		heap(arr, --len);
		return;
	}
}
