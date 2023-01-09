package leetcode.array;

import java.util.Arrays;

//https://leetcode.com/problems/most-frequent-even-element/
public class MostFrequentNumber {

	public static void main(String[] args) {
		int[] nums = { 4, 4, 4, 9, 2, 4 };
		System.out.println(mostFrequentEven(nums));
	}

	public static int mostFrequentEven(int[] nums) {
		Arrays.sort(nums);
		//int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				for (int j = 0; j < nums.length; j++) {
					
					
				}

			}
		}

		return -1;
	}
}
