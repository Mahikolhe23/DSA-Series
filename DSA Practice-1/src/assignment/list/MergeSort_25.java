package assignment.list;

import java.util.Arrays;

public class MergeSort_25 {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 6, 2, 4 };
		System.out.println(Arrays.toString(merge(arr)));
	}

	public static int[] merge(int[] arr) {
		if (arr.length == 1) { 
			return arr;
		}
		int mid = arr.length / 2;
		int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
		int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));
		return mergeSort(left, right);
	}

	private static int[] mergeSort(int[] left, int[] right) {
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
			k++;
			i++;
		}
		while (j < right.length) {
			mix[k] = right[j];
			k++;
			j++;
		}
		return mix;
	}
}
