package leetcode.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 9, 3, 4, 11, 2, };
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr, int low, int hi) {
		if (low >= hi) {
			return;
		}
		int s = low;
		int e = hi;
		int m = s + (e - s) / 2;
		while (s <= e) { 
			int pivot = arr[m]; 
			while (arr[s] < pivot) {
				s++;
			}
			while (arr[e] > pivot) {
				e--;
			}
			if (s <= e) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}
		sort(arr, low, e);
		sort(arr, s, hi);
	}
}
