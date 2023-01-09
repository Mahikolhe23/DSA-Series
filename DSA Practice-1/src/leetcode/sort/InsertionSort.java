package leetcode.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 9, 3, 4, 11, 2, 1, 5 };
		insertion(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void insertion(int[] arr) {
		// assume that left most element is already sorted , pick one element from right
		// side and put into left side
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				// check the j and prev value ans swap
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}
		}
	}
}
