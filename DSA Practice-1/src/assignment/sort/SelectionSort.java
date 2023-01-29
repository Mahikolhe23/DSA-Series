package assignment.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of Array :");
		int len = in.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter the Element of Array to sort");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		selection(arr);
		System.out.println();
		System.out.print("Sorted Array : " + Arrays.toString(arr));
		in.close();
	}

	public static void selection(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int last = arr.length - i - 1;
			int maxIndex = getMaxindex(arr, 0, last);
			swap(arr, maxIndex, last);
		}
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	public static int getMaxindex(int[] arr, int start, int end) {
		int max = start;
		for (int i = start; i <= end; i++) {
			if (arr[start] < arr[i]) {
				max = i;
			}
		}
		return max;
	}
}