package leetcode.array;

public class LinearSearch {

	public static void main(String[] args) {
		int[] nums = { 23, 19, 45, 2, 3, 6, 7, 5, 49, 75, -11, -3 };
		int target = 199;
		int ans = linearSearch(nums, target);
		System.out.println(ans);
	}

	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {
			// check for every element at every index it its = target
			int element = arr[index];
			if (element == target)
				return index;
		}
		return -1;
	}
}
