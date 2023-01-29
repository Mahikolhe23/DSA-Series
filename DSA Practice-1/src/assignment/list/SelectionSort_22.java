package assignment.list;

import java.util.Arrays;

public class SelectionSort_22 {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 6, 2, 4 };
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selection(int[] arr) {
		// select the max element and put it at last index
		for (int i = 0; i < arr.length; i++) {
			// find the last index in every iteration
			int last = arr.length - i - 1;
			// find the max element index between 0 to last updated index
			int max = 0;
			for (int j = 0; j <= last; j++) {
				if (arr[max] < arr[j]) {
					max = j;
				}
			}
			// swap the max index to last index
			int temp = arr[max];
			arr[max] = arr[last];
			arr[last] = temp;
		}
	}
}
