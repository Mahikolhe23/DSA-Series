package array;

//https://practice.geeksforgeeks.org/problems/0960a833f70b09c59444ea487f99729929fc8910/1
public class NumberOfSubArrayZero {

	public static void main(String[] args) {
		int N = 4;
		int arr[] = { 0, 0, 1, 0 };
		System.out.println(no_of_subarrays(N, arr));
	}

	static long no_of_subarrays(int N, int[] arr) {
		long subarrsCount = 0;
		long currentsubLen = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] == 0) {
				currentsubLen++;
			}
			if (arr[i] == 1 || i == N - 1) {
				subarrsCount += currentsubLen * (currentsubLen + 1) / 2;
				currentsubLen = 0;
			}
		}
		return subarrsCount;
	}
}