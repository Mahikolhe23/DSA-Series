package array;

import java.util.ArrayList;
import java.util.Arrays;

public class InterSectionOfTwoArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1, 5, 6, 9, 7 };
		int[] nums2 = { 2, 2, 6, 5 };
		int[] ans = intersection(nums1, nums2);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		ArrayList<Integer> list = new ArrayList<>();

		int i = 0;
		int j = 0;
		while (i < nums1.length && j < nums2.length) {
			if (i > 0 && nums1[i] == nums1[i - 1]) { // condition for remove the duplicate element
				i++;
				continue;
			}
			if (nums1[i] == nums2[j]) { // if both the array has same element then put that element in the list
				list.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] > nums2[j]) { // as both the array is sorted, so adjust the index by comparing the
												// element
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			}
		}

		int[] ans = new int[list.size()]; // store the list value in an array
		for (int k = 0; k < ans.length; k++) {
			ans[k] = list.get(k);
		}
		return ans;
	}
}
