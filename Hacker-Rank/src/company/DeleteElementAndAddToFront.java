package company;

import java.util.Arrays;
//cumulas hitachi
public class DeleteElementAndAddToFront {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		deleteFromLast(arr, 3);
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
}
