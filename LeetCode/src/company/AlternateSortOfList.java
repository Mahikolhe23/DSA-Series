package company;

import java.util.Arrays;

public class AlternateSortOfList {
	// Sort the given list and return alternate char starting from 0
	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 5, 9, 10, 2, 6 };
		System.out.println(Arrays.toString(sortAlter(arr)));
	}

	public static int[] sortAlter(int[] arr) {
		int[] a = new int[arr.length / 2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				a[c] = arr[i];
				c++;
			}
		}
		return a;
	}
}
