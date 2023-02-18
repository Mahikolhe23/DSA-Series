package array;

//https://leetcode.com/problems/remove-element/
public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		System.out.println(removeElement(nums, val));
	}

	public static int removeElement(int[] nums, int val) {
		int l = nums.length;
		for (int i = 0; i < l; i++) {
			if (nums[i] == val) {
				nums[i--] = nums[--l];
			}
		}
		return l;
	}
}
