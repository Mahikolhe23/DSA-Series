package leetcode.array;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 4, 5, 6, 0, 0, 0 }, nums2 = { 1, 2, 3 };
		int n = 3, m = 3;
		merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int t1 = m - 1;
		int t2 = n - 1;
		int last = m + n - 1;
		while (t1 >= 0 && t2 >= 0) {
			nums1[last--] = (nums1[t1] > nums2[t2]) ? nums1[t1--] : nums2[t2--];
		}
		while (t2 >= 0) {
			nums1[last--] = nums2[t2--];
		}
	}
}
