package array;

//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
public class SumOfOddLength {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 5, 3 };
		System.out.println(sumOddLengthSubarrays(arr));
	}

	public static int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
