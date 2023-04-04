package company;

import java.util.Arrays;
//cumulas hitachi
public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = { 11, 13, 14, 16, 17, 15 };
		System.out.println(missing(arr));
	}

	public static int missing(int arr[]) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] + 1 != arr[i + 1]) {
				return arr[i] + 1;
			}
		}
		return -1;
	}
}
