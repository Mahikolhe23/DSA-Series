package leetcode.array;

public class EqualSumInSubArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println(findSubarrays(nums));
	}

	public static boolean findSubarrays(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			sum = nums[i] + nums[i + 1];

		}System.out.println(sum);
		return false;
	}
}
