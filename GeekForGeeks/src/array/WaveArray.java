package array;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1?page=1&category[]=Arrays&curated[]=1&curated[]=8&sortBy=submissions
public class WaveArray {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 7, 8, 9, 10 };
		convertToWave(arr.length, arr);
	}

	public static void convertToWave(int n, int[] a) {
		for (int i = 0; i < n - 1; i += 2) {
			int temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
