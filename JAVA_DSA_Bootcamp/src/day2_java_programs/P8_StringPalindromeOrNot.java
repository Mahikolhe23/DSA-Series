package day2_java_programs;

import java.util.Scanner;

public class P8_StringPalindromeOrNot {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.next();
		System.out.println(isPalindrome(s));
		in.close();
	}

	public static boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
}
