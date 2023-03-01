package array;

//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
import java.util.Arrays;

public class SumOfOddSubArray {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 5, 3 };
		System.out.println(sumOddLengthSubarrays(arr));
	}

	public static int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Arrays.copyOfRange(arr, 0, i).length % 2 != 0)
				sum += sum(Arrays.copyOfRange(arr, 0, i));
		}
		return sum;
	}

	public static int sum(int[] arr) {
		int sum = 0;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
