package gfg.array;

//https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category[]=Arrays&curated[]=1&curated[]=8&sortBy=submissions
import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
		System.out.println(missingNumber(arr, arr.length));
	}

	public static int missingNumber(int[] array, int n) {
		Arrays.sort(array);
		int i;
		for (i = 0; i < array.length; i++) {
			if (i + 1 != array[i]) {
				return i + 1;
			}
		}
		return i+1;
	}
}
