package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/arithmetic-subarrays/
public class ArithmeticSubarrays {
	public static void main(String[] args) {
		int[] nums = { -12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10 };
		int[] l = { 0, 1, 6, 4, 8, 7 }, r = { 4, 4, 9, 7, 9, 10 };
		System.out.println(checkArithmeticSubarrays(nums, l, r));
	}

	public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
		List<Boolean> list = new ArrayList<Boolean>();
		for (int i = 0; i < l.length; i++) {
			int[] temp = new int[nums.length];
			List<Integer> listi = new ArrayList<Integer>();
			for (int j = l[i]; j <= r[i]; j++) {
				temp[j] = nums[j];
				listi.add(nums[j]);
			}
			list.add(check(listi));
		}
		return list;
	}

	public static boolean check(List<Integer> temp) {
		Collections.sort(temp);
		System.out.println(temp);
		int diff = temp.get(1) - temp.get(0);
		for (int i = 1; i < temp.size(); i++) {
			if ((temp.get(i) - temp.get(i - 1)) != diff)
				return false;
		}
		return true;
	}
}