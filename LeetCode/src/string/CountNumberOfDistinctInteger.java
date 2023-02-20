package string;

//https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/
import java.util.Arrays;
import java.util.HashSet;

public class CountNumberOfDistinctInteger {
	public static void main(String[] args) {
		int[] nums = { 89904, 846787, 965070, 396570, 847607, 625317, 851503, 143414, 954838, 837423, 988190, 916423,
				771555, 680073, 575614, 967207, 965688 };
		System.out.println(nums.length);
		System.out.println(countDistinctIntegers(nums));
	}

	public static int countDistinctIntegers(int[] nums) {
		int[] temp = new int[nums.length * 2];
		for (int i = 0; i < nums.length; i++) {
			temp[i] = nums[i];
			temp[nums.length + i] = reverse(nums[i]);
		}
		Arrays.sort(temp);
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < temp.length; i++) {
			set.add(temp[i]);
		}
		return set.size();
	}

	public static int reverse(int n) {
		int rev = 0;
		while (n > 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		return rev;
	}
}
