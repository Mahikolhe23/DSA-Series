package linklist;

import java.util.Arrays;

public class QuickSort_24 {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 6, 2, 4 };
		quick(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quick(int[] arr, int low, int hi) {
		if (low >= hi) {
			return;
		}
		int s = low;
		int e = hi;
		int m = s + (e - s) / 2;
		while (s <= e) {
			int pivot = arr[m];
			while (arr[s] < pivot)
				s++;
			while (arr[e] > pivot)
				e--;
			if (s <= e) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}
		quick(arr, low, e);
		quick(arr, s, hi);
	}
}
