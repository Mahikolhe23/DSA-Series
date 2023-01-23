package com.leetcode.string;

//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
public class MaxNumberInString {

	public static void main(String[] args) {
		String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
		System.out.println(mostWordsFound(sentences));
	}

	public static int mostWordsFound(String[] sentences) {
		int max = 0;
		for (int i = 0; i < sentences.length; i++) {
			String string = sentences[i];
			String[] arr = string.split(" ");
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				count++;
			}
			if (max < count)
				max = count;
		}
		return max;
	}
}
