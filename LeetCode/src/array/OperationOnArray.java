package array;

import java.util.Arrays;

//https://leetcode.com/problems/apply-operations-to-an-array/
public class OperationOnArray {

	public static void main(String[] args) {
		int[] nums = { 847, 847, 0, 0, 0, 399, 416, 416, 879, 879, 206, 206, 206, 272 };
		System.out.println(Arrays.toString(applyOperations(nums)));
	}

	public static int[] applyOperations(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
				nums[i] = nums[i] * 2;
				nums[i + 1] = 0;
			}
		}
		int[] temp = new int[nums.length];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				temp[j] = nums[i];
				j++;
			}
		}
		return temp;
	}
}
