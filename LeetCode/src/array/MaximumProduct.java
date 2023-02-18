package array;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-product-of-three-numbers/
public class MaximumProduct {

	public static void main(String[] args) {
		int[] arr = { -100, 98, 1, 2, 3, 4 };
		System.out.println(maximumProduct(arr));
	}

	public static int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int l = nums.length;
		return Math.max(nums[0] * nums[1] * nums[l - 1], nums[l - 1] * nums[l - 2] * nums[l - 3]);
	}
}