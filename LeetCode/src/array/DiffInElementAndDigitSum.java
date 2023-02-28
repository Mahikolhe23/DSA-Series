package array;

//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
public class DiffInElementAndDigitSum {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(differenceOfSum(nums));
	}

	public static int differenceOfSum(int[] nums) {
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (nums[i] > 9) {
				int a = nums[i];
				while (a > 0) {
					int r = a % 10;
					ans += r;
					a /= 10;
				}
			} else
				ans += nums[i];
		}
		return Math.abs(sum - ans);
	}
}
