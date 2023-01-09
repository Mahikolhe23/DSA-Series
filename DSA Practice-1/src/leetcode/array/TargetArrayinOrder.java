package leetcode.array;

import java.util.Arrays;

//https://leetcode.com/problems/create-target-array-in-the-given-order/
public class TargetArrayinOrder {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 3, 4 };
		int[] index = { 0, 1, 2, 2, 1 };
		System.out.println(Arrays.toString(createTargetArray(nums, index)));
	}

	public static int[] createTargetArray(int[] nums, int[] index) {
		int[] ans = new int[nums.length];
		for (int i = 0; i < index.length; i++) {
			if (index[i] < i) {
				for (int j = ans.length - 1; j > index[i]; j--)
					ans[j] = ans[j - 1];
				ans[index[i]] = nums[i];
			} else
				ans[index[i]] = nums[i];
		}
		return ans;
	}
}
