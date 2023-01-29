package assignment.list;

import java.util.Arrays;

public class BinarySearch_27 {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 6, 2, 4, 9, 16, 8, 12, 7 };
		System.out.println(binarySearch(arr, 6));
	}

	public static int binarySearch(int[] arr, int target) {
		Arrays.sort(arr);
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int m = (s + e) / 2;
			if (target == arr[m])
				return m;
			if (target < arr[m])
				e = m - 1;
			else
				s = m + 1;
		}
		return -1;
	}
}
