package sort;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 1, 2 };
		inertion(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubble(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void selection(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int last = arr.length - i - 1;// find last index
			int maxInd = 0;// find max index
			for (int j = 0; j <= last; j++) { // iterate 0 to last index
				if (arr[maxInd] < arr[j]) {
					maxInd = j;
				}
			}
			int temp = arr[maxInd]; // swap max index with last index
			arr[maxInd] = arr[last];
			arr[last] = temp;
		}
	}

	public static void inertion(int[] arr) {
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
}
