package array;

import java.util.Arrays;

//https://leetcode.com/problems/decode-xored-array/
public class DecodeXORArray {
	public static void main(String[] args) {
		int[] encoded = { 1, 2, 3 };
		int first = 1;
		System.out.println(Arrays.toString(decode(encoded, first)));
	}

	public static int[] decode(int[] encoded, int first) {
		int[] ans = new int[encoded.length + 1];
		ans[0] = first;
		for (int j = 0; j < encoded.length; j++) {
			ans[j + 1] = ans[j] ^ encoded[j];
		}
		return ans;
	}
}
