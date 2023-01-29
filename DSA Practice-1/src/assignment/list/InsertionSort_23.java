package assignment.list;

import java.util.Arrays;

public class InsertionSort_23 {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 6, 2, 4 };
		insertion(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertion(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				// check j with previous element
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else
					break;
			}
		}
	}
}
