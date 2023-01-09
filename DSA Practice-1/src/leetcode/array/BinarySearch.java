package leetcode.array;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 7, 8, 9, 11, 12, 14, 15, 19, 20, 22, 25, 26, 28, 32, 33, 35, 36, 37, 38, 41, 43, 44,
				45, 46, 49, 50, 51, 52, 53, 55, 59, 60, 61, 62, 65, 66, 67, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
				80, 81, 82, 83, 84, 88, 92, 93, 94, 95, 96, 98, 99 };
		int target = 222;
		int ans = binarysearch(arr, target);
		System.out.println(ans);
	}

	// Return the index
	// Return the -1 if target not found
	static int binarysearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			// find middle element
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
