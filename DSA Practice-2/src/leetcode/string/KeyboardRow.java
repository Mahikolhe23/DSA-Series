package leetcode.string;

import java.util.Arrays;

//https://leetcode.com/problems/keyboard-row/
public class KeyboardRow {

	public static void main(String[] args) {
		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		System.out.println(Arrays.toString(findWords(words)));
	}

	public static String[] findWords(String[] words) {
		String s1 = "qwertyuiop";
		String s2 = "asdfghjkl";
		String s3 = "zxcvbnm";
		for (int i = 0; i < words.length; i++) {
			String ans = words[i].toLowerCase();
			for (int j = 0; j < ans.length(); j++) {

			}

		}

		return words;
	}
}
