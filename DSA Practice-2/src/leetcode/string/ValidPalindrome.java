package leetcode.string;

//https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "0P";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
				ans = ans + s.charAt(i);
		}
		System.out.println(ans);
		String ans1 = ans.toLowerCase();
		int start = 0;
		int end = ans1.length() - 1;
		while (start <= end) {
			if (ans1.charAt(start) != ans1.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
}
