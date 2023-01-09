package leetcode.string;

//https://leetcode.com/problems/is-subsequence/
public class SubsequenceString {

	public static void main(String[] args) {
		String s = "abc", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}

	public static boolean isSubsequence(String s, String t) {
		int i = 0;
		int j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j))
				i++;
			j++;
		}
		return i == s.length();
	}
}
