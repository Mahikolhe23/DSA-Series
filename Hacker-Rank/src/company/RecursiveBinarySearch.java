package company;

//cumulas hitachi
public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(binarySearch(arr, 0, arr.length - 1, 14));
	}

	public static int binarySearch(int[] arr, int l, int r, int x) {
		if (r >= l && l <= arr.length - 1) {
			int m = l + (r - l) / 2;
			if (arr[m] == x) {
				return m;
			}
			if (arr[m] > x) {
				return binarySearch(arr, l, m - 1, x);
			}
			return binarySearch(arr, m + 1, r, x);
		}
		return -1;
	}
}
