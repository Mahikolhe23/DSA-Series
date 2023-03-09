package searching;

//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class MaximumCountOfPositiveInteger {
	public static void main(String[] args) {
		int[] nums = { -2, -1, -1, 1, 2, 3 };
		System.out.println(maximumCount(nums));
	}

	public static int maximumCount(int[] nums) {
		int pos = 0;
		int neg = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0)
				neg++;
			if (nums[i] > 0)
				pos++;
		}
		return Math.max(pos, neg);
	}
}
