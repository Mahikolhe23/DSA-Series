package leetcode.array;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
		int m = 3, n = 3;
		merge(nums1, m, nums2, n);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] temp = new int[nums1.length];
		for (int i = 0; i < nums2.length; i++) {
			if (nums1[i] < nums2[i]) {
				temp[i] = nums1[i];
			} else {
				temp[i] = nums2[i];
			}
		}
		
	}
}
