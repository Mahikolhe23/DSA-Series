package gfg.array;

//https://practice.geeksforgeeks.org/problems/maximize-arrii-of-an-array0026/1?page=1&category[]=Arrays&category[]=Strings&curated[]=1&curated[]=8&curated[]=7&curated[]=2&sortBy=submissions
import java.util.Arrays;

public class MaximumSum {

	public static void main(String[] args) {
		int Arr[] = { 5, 3, 2, 4, 1 };
		System.out.println(Maximize(Arr, Arr.length));
	}

	public static int Maximize(int arr[], int n) {
		long sum = 0;
		Arrays.sort(arr);
		for (int i = 1; i < n; i++) {
			sum = sum + (long) i * arr[i];
		}
		return (int) (sum % 1000000007);
	}
}
