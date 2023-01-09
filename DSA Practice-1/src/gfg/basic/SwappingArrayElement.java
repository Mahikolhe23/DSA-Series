package gfg.basic;

import java.util.Arrays;

public class SwappingArrayElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		swapElements(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	public static void swapElements(int[] arr, int n) {
		for (int i = 0; i < n - 2; i++) {
			int temp = arr[i];
			arr[i] = arr[i+2];
			arr[i+2] = temp;
		}
	}
}
