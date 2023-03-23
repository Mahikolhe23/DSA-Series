package math;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/replace-all-0s-with-5/1?page=1&category[]=Arrays&sortBy=accuracy
public class ReplaceZeroFromNumber {

	public static void main(String[] args) {
		int[] arr = { 23, 2, 21, 17, 16, 22, 3, 9, 10, 14, 12, 20, 11, 6, 4, 8, 7, 23, 15, 18, 13, 1, 10, 19 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static int convertfive(int num) {
		String temp = Integer.toString(num);
		String ans = "";
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == '0') {
				ans += "5";
			} else
				ans += temp.charAt(i);
		}
		return Integer.parseInt(ans);
	}

}
