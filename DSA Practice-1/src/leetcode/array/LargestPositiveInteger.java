package leetcode.array;

import java.util.Arrays;

public class LargestPositiveInteger {

	public static void main(String[] args) {
		int[] nums = { -1, 10, 6, 7, -7, 1 };
		System.out.println(findMaxK(nums));
	}

	public static int findMaxK(int[] nums) {
		int ans = 0;
		Arrays.sort(nums);
		int start = 0;
		int end = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[start] == nums[end] * -1 && nums[start] < nums[end]) {
					ans = nums[end];
					System.out.println(ans);
					start++;
					end--;
				}
			}
		}
		return ans;
	}
}
