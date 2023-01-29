package assignment.array;

public class FloorOfNumber {
	public static void main(String[] args) {
		int[] arr = {-18,-12,-4,0,2,5,6,8,15,16,18,22,45,89};
		//int [] arr = {99,65,45,12,9};
		int target=17;
		int ans = floorofnum(arr,target);
		System.out.println(ans); 
	}
	static int floorofnum(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
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
		return end;
	}
}
