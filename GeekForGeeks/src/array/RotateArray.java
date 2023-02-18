package array;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1?page=1&difficulty[]=0&category[]=Arrays&sortBy=submissions
public class RotateArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		rotateArr(arr, 2, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	public static void rotateArr(int arr[], int d, int n) {
		for (int i = 0; i < arr.length - 2; i++) {
			arr[i] = arr[i + 2];
		}
	}
}
