package gfg.basic;

import java.util.Arrays;

public class SwapEvenOdd {

	public static void main(String[] args) {
		int arr[] = { 9, 3, 8, 8 };
		reArrange(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	static void reArrange(int[] arr, int N) {
		for (int i = 0; i < arr.length - 1;) {
			if (arr[i] % 2 == 0 && i % 2 != 0) {
			}
		}
	}
}
