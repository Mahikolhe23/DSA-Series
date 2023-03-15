package string;

//https://practice.geeksforgeeks.org/problems/palindrome-string0817/1?page=1&difficulty[]=0&category[]=Strings&sortBy=submissions
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int isPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start <= end) {
			if (s.charAt(start) != s.charAt(end))
				return 0;
			start++;
			end--;
		}
		return 1;
	}
}
