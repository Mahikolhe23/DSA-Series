package string;

import java.util.Arrays;

//https://leetcode.com/problems/count-the-number-of-consistent-strings/
public class CountTheNumberOfConsistentStrings {

	public static void main(String[] args) {
		String allowed = "ab";
		String[] words = { "ad", "bd", "aaab", "baa", "badab" };
		System.out.println(countConsistentStrings(allowed, words));
	}

	public static int countConsistentStrings(String allowed, String[] words) {
		int c = 0;
		for (int i = 0; i < words.length; i++) {
			char[] ca = words[i].toCharArray();
			Arrays.sort(ca);
			String ans = new String(ca);
			System.out.println(ans);
			if (allowed.contains(ans))
				c++;
		}
		return c;
	}
}
