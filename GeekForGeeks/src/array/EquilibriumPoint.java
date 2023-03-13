package array;

//https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&difficulty[]=0&sortBy=submissions
public class EquilibriumPoint {

	public static void main(String[] args) {
		long A[] = { 20, 17, 42, 25, 32, 32, 30, 32, 37, 9, 2, 33, 31, 17, 14, 40, 9, 12, 36, 21, 8, 33, 6, 6, 10, 37,
				12, 26, 21, 3 };
		// long B[] = { 1, 3, 5, 2, 2 };
		System.out.println(equilibriumPoint(A, A.length));
	}

	public static int equilibriumPoint(long arr[], int n) {
		for (int i = 0; i < n - 1; i++) {
			System.out.print("i=" + i + " ");
			long sum = 0;
			long sum1 = 0;
			for (int j = 0; j < i; j++) {
				sum = sum + arr[j];
			}
			System.out.print(sum + " ");
			for (int k = i; k < n - 1; k++) {
				sum1 = sum1 + arr[k + 1];
			}
			System.out.print(sum1 + " ");
			if (sum == sum1) {
				return i + 1;
			}
		}
		if (arr.length < 2) {
			return 1;
		}
		return -1;
	}
}
