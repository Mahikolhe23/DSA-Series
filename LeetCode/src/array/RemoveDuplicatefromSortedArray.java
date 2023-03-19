package array;

import java.util.Arrays;

public class RemoveDuplicatefromSortedArray {
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(nums));
		int arr[] = { 2, 3, 4, -2, 6, 8, 9, 11 };
		Arrays.sort(arr);
		pairedElements(arr, 6);
	}

	public static int removeDuplicates(int[] nums) {
		int i = 1;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[j - 1]) {
				nums[i++] = nums[j];
			}
		}
//		System.out.println(Arrays.toString(nums));
		return i;
	}

	public static void pairedElements(int arr[], int sum) {
		int low = 0;
		int high = arr.length - 1;
		System.out.println(Arrays.toString(arr));
		while (low < high) {
			if (arr[low] + arr[high] == sum) {
				System.out.println("The pair is : (" + arr[low] + ", " + arr[high] + ")");
			}
			if (arr[low] + arr[high] > sum) {
				high--;
			} else {
				low++;
			}
		}
	}
}