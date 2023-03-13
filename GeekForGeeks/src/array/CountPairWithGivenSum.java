package array;

//https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?page=1&difficulty[]=0&sortBy=submissions
public class CountPairWithGivenSum {

	public static void main(String[] args) {
		int n = 4, k = 6;
		int arr[] = { 1, 5, 7, 1 };
		System.out.println(getPairsCount(arr, n, k));
	}

	static int getPairsCount(int[] arr, int n, int k) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == k)
					sum++;
			}
		}
		return sum;
	}
}
