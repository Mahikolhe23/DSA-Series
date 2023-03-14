package string;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1?page=1&difficulty[]=0&category[]=Strings&sortBy=submissions
public class ReverseString {

	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		reverseWords(s);
	}

	public static String reverseWords(String s) {
		String[] m = s.split(".");
		String k = "";
		System.out.println(Arrays.toString(m));
		for (int i = 0; i < m.length; i++) {
			k = k + m[i];
		}
		return k;
	}
}
