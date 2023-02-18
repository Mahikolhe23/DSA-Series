package sort;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 2, 3, 9, 1, 86, 4, 16, };
		int target = 5;
		System.out.println(binarysearch(arr, target));
	}

	public static int binarysearch(int[] arr, int target) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (target == arr[mid]) {
				return mid;
			}
			if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
