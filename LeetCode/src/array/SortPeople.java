package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/sort-the-people/
public class SortPeople {

	public static void main(String[] args) {
		String[] names = { "Mary", "John", "Emma" };
		int[] h = { 180, 165, 170 };
		System.out.println(Arrays.toString(sortPeople(names, h)));
	}

	public static String[] sortPeople(String[] names, int[] heights) {
		Map<Integer, String> m = new HashMap<>();
		for (int i = 0; i < heights.length; i++) {
			m.put(heights[i], names[i]);
		}
		Arrays.sort(heights);
		String[] ans = new String[heights.length];
		int index = 0;
		for (int i = heights.length - 1; i >= 0; i--) {
			ans[index] = m.get(heights[i]);
			index++;
		}
		return ans;
	}
}
