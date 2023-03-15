package string;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/anagram-1587115620/1?page=1&difficulty[]=0&category[]=Strings&sortBy=submissions
public class Anagram {

	public static void main(String[] args) {
		String a = "allergy", b = "allergic";
		System.out.println(isAnagram(a, b));
	}

	public static boolean isAnagram(String a, String b) {
		if (a.length() != b.length())
			return false;
		char[] a1 = a.toCharArray();
		Arrays.sort(a1);
		String ans1 = new String(a1);
		char[] b1 = b.toCharArray();
		Arrays.sort(b1);
		String ans2 = new String(b1);
		for (int i = 0; i < ans1.length(); i++) {
			if (ans1.charAt(i) != ans2.charAt(i))
				return false;
		}
		return true;
	}
}
