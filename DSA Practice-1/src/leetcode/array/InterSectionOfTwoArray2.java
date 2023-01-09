package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;

public class InterSectionOfTwoArray2 {

	public static void main(String[] args) {
		int[] nums1 = { 4, 9, 5 }, nums2 = { 9, 4, 9, 8, 4 };
		System.out.println(Arrays.toString(intersect(nums1, nums2)));
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		// HashSet<Integer> h = new HashSet<Integer>();
		ArrayList<Integer> h = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = i; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					h.add(nums1[i]);

				}
			}
		}
		int[] temp = new int[h.size()];
		for (int i = 0; i < h.size(); i++) {
			temp[i] = h.get(i);
		}
		return temp;
	}
}
