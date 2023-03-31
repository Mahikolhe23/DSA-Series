package sort;

import java.util.Arrays;

public class SortingAlgo {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 1, 2, 3, 3, -4, 0 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubble(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

	public static void selection(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int last = arr.length - i - 1;
			int max = 0;
			for (int j = 0; j <= last; j++) {
				if (arr[max] < arr[j]) {
					max = j;
				}
			}
			int temp = arr[max];
			arr[max] = arr[last];
			arr[last] = temp;
		}
	}

	public static void insertion(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

	public static int[] mergeSort(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}
		int mid = arr.length / 2;
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		return merge(left, right);
	}

	private static int[] merge(int[] left, int[] right) {
		int[] mix = new int[left.length + right.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				mix[k] = left[i];
				i++;
			} else {
				mix[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < left.length) {
			mix[k] = left[i];
			i++;
			k++;
		}
		while (j < right.length) {
			mix[k] = right[j];
			j++;
			k++;
		}
		return mix;
	}

	public static void quickSort(int[] arr, int low, int hi) {
		if (low >= hi)
			return;

		int s = low;
		int e = hi;
		int m = s + (e - s) / 2;
		int pivot = arr[m];
		while (s <= e) {
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
		quickSort(arr, low, e);
		quickSort(arr, s, hi);
	}
}
