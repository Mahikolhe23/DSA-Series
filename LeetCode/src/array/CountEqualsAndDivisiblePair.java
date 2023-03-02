package array;

//https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
public class CountEqualsAndDivisiblePair {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 2, 2, 1, 3 };
		int k = 2;
		System.out.println(countPairs(nums, k));
	}

	public static int countPairs(int[] nums, int k) {
		int c = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] == nums[j]) && (i * j) % k == 0)
					c++;
			}
		}
		return c;
	}
}
