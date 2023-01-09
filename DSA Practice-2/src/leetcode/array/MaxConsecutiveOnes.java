package leetcode.array;

//https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 1, 1, 0, 1 };
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			if (nums[i] == 1) {
				while (i < nums.length && nums[i] != 0) {
					count++;
					i++;
				}
			}
			if (max < count)
				max = count;
		}
		return max;
	}
}
