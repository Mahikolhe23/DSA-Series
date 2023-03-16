package math;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/game-with-nos3123/1?page=1&category[]=Arrays&sortBy=accuracy
public class XorOperationOnArray {

	public static void main(String[] args) {
		int n = 5;
		int arr[] = { 10, 11, 1, 2, 3 };
		System.out.println(Arrays.toString(game_with_number_XOR(arr, n)));
		System.out.println(Arrays.toString(game_with_number_OR(arr, n)));
	}

	public static int[] game_with_number_XOR(int arr[], int n) {
		int[] temp = new int[n];
		for (int i = 0; i < arr.length - 1; i++) {
			temp[i] = arr[i] ^ arr[i + 1];
		}
		temp[n - 1] = arr[n - 1];
		return temp;
	}

	public static int[] game_with_number_OR(int arr[], int n) {
		int[] temp = new int[n];
		for (int i = 0; i < arr.length - 1; i++) {
			temp[i] = arr[i] | arr[i + 1];
		}
		temp[n - 1] = arr[n - 1];
		return temp;
	}
}
