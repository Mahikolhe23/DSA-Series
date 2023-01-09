package gfg.array;
//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1?page=1&category[]=Arrays&category[]=Strings&curated[]=1&curated[]=8&curated[]=7&curated[]=2&sortBy=submissions
import java.util.Arrays;

public class RoatateArray {

	public static void main(String[] args) {
		int A[] = { 1, 2 };
		rotate(A, A.length);
		System.out.println(Arrays.toString(A));
	}

	public static void rotate(int arr[], int n) {
		int temp = arr[n - 1];
		for (int i = 1; i < n; i++) {
			arr[n - i] = arr[n - 1 - i];
		}
		arr[0] = temp;
	}
}
