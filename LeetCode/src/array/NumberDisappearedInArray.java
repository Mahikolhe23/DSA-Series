package array;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.List;
public class NumberDisappearedInArray {

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(nums));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		int[] res = new int[nums.length + 1];
		for (int num : nums) {
			res[num] = num;
		}
		List<Integer> result = new ArrayList<>(res.length);
		for (int i = 1; i < res.length; i++) {
			if (res[i] == 0) {
				result.add(i);
			}
		}
		return result;
	}
}
