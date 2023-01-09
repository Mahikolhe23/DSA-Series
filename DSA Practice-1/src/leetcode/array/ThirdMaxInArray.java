package leetcode.array;

import java.util.Arrays;

//https://leetcode.com/problems/third-maximum-number/
public class ThirdMaxInArray {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1 };
		System.out.println(thirdMax(nums));
	}

	public static int thirdMax(int[] nums) {
		// sort the array
		Arrays.sort(nums);
		// remove duplicate from array
		int i = 1;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[j - 1]) {
				nums[i++] = nums[j];
			}
		}
		// when less than 3 element return max
		if (i < 3)
			return nums[i - 1];
		return nums[i - 3];
	}
}
