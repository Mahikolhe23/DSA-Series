package home.array;

public class BinarySearch {
	public static void main(String[] args) {
	int[] arr = {-18,-12,-4,0,2,5,6,8,15,16,18,22,45,89};
	int target=181;
	int ans = binarysearch(arr,target);
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
