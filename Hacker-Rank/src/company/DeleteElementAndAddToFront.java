package company;

import java.util.Arrays;

//cumulas hitachi
public class DeleteElementAndAddToFront {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };// 5,4,3,2,1//3,4,5,2,1//3,4,5,1,2
//		deleteFromLast(arr, 3);
		rotate(arr, 2);
		System.out.println(Arrays.toString(arr));
	}

	public static void deleteFromLast(int[] arr, int k) {
		int m = 1;
		while (m <= k) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
			m++;
		}
	}

	public static void rotate(int[] arr, int k) {
		k = k % arr.length;
		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
