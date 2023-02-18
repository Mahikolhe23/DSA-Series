package string;

//https://leetcode.com/problems/first-unique-character-in-a-string/?envType=study-plan&id=data-structure-i
public class UniqueChar {

	public static void main(String[] args) {
		String s = "loveleetcode";
		int a = firstUniqChar(s);
		System.out.println(s.charAt(a));
	}

	public static int firstUniqChar(String s) {
		int ans = Integer.MAX_VALUE;
		// check a-z and if first and last index is same then this is only one char
		for (char c = 'a'; c <= 'z'; c++) {
			if (s.indexOf(c) != -1 && s.indexOf(c) == s.lastIndexOf(c))
				ans = Math.min(ans, s.indexOf(c));
		}
		// if max value is same as it is then no unique char in string
		return ans == Integer.MAX_VALUE ? -1 : ans;
	}
}
