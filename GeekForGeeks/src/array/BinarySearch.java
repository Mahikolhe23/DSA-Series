package array;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 7, 8, 9, 11, 12, 14, 15, 19, 20, 22, 25, 26, 28, 32, 33, 35, 36, 37, 38, 41, 43, 44,
				45, 46, 49, 50, 51, 52, 53, 55, 59, 60, 61, 62, 65, 66, 67, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
				80, 81, 82, 83, 84, 88, 92, 93, 94, 95, 96, 98, 99 };
		int k = 222;
		System.out.println(binarysearch(arr, arr.length, k));
	}

	public static int binarysearch(int arr[], int n, int k) {
		int s = 0;
		int e = n - 1;
		while (s <= e) {
			int m = s + (e - s) / 2;
			if (k < arr[m]) {
				e = m - 1;
			} else if (k > arr[m]) {
				s = m + 1;
			} else
				return m;
		}
		return -1;
	}
}
