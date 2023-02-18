package linklist;

import java.util.Arrays;

public class BubbleSort_21 {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 6, 2, 4 };
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubble(int[] arr) {
		// swap the neighbor element
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				// check and swap j element till last
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
