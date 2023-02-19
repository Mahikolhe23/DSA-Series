package string;

//https://leetcode.com/problems/replace-all-digits-with-characters/
public class ReplaceAllDigitWithChar {
	public static void main(String[] args) {
		String s = "a1b2c3d4e";
		System.out.println(replaceDigits(s));
	}

	public static String replaceDigits(String s) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				ans += (char) ((s.charAt(i - 1) + s.charAt(i) - '0'));
			} else {
				ans += s.charAt(i);
			}
		}
		return ans;
	}
}
