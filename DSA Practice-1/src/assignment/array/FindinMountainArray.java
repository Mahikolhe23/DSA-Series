package assignment.array;

public class FindinMountainArray {

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,3,1 };
		int target = 3;
		int ans = search(arr, target);
		System.out.println(ans);
	}

	public static int search(int[] arr, int target) {
		int peak = peakIndexInMountainArray(arr);
		int firstTry = orderAgnosticBS(arr, target, 0, peak);
		if (firstTry != -1) {
			return firstTry;
		}
		return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
	}

	public static int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				// you are in decreasing part of array
				// this may be the ans , but looked at the left
				// this is why end!=mid-1
				end = mid;
			} else {
				// you are in increasing part of array
				// because we know that mid+1 element >mid element
				start = mid + 1;
			}
		}
		// in the end start == end and pointing to the largest number because of the 2
		// checks above
		// start and end always find max element
		return start;
	}

	static int orderAgnosticBS(int[] arr, int target, int start, int end) {
		// Find Whether Array is sorted in Ascending or Descending
		boolean isAsc = arr[start] < arr[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else if (target > arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
