package home.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of Array :");
		int len = in.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter the Element of Array to sort");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		insertion(arr);
		System.out.println();
		System.out.print("Sorted Array : " + Arrays.toString(arr));
		in.close();
	}

	static void insertion(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
