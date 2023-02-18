package array;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-subarray/?envType=study-plan&id=data-structure-i
public class MaximumSubArray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		int a = nums.length - 1;
		while (nums[a] > 0) {
			sum += nums[a];
			a--;
		}
		return sum;
	}
}
