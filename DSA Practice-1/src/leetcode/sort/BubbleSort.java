package leetcode.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of Array :");
		int len = in.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter the Element of Array to sort");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		bubble(arr);
		System.out.println("After the sorting Element of Array:");
		System.out.print(Arrays.toString(arr));
		in.close();
	}

	public static void bubble(int[] arr) {
		// run step n-1
		boolean swapped;
		for (int i = 0; i < arr.length; i++) {
			// for each step , max item will come to last position of array
			swapped = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					// swap number with last one
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}
}
