package string;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1?page=1&difficulty[]=0&category[]=Strings&sortBy=submissions
public class ReverseString {

	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		reverseWords(s);
	}

	public static String reverseWords(String S) {
		String[] m = S.split("[.']+");
		String k = "";
		System.out.println(Arrays.toString(m));
		for (int i = m.length - 1; i > 0; i--) {
			k += m[i] + ".";
		}
		return k + m[0];
	}
}
