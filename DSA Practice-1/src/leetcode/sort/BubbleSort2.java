package leetcode.sort;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 34, 6, 2, 9 };
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubble(int[] arr) {
		// iterate over the array
		for (int i = 0; i < arr.length; i++) {
			// check every element with its neighbor
			for (int j = 1; j < arr.length - i; j++) {
				// check and swap
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}
}
