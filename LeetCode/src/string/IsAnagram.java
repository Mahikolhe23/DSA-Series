package string;

//https://leetcode.com/problems/valid-anagram/?envType=study-plan&id=data-structure-i
public class IsAnagram {

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		int sumS = 0;
		int sumT = 0;
		for (int i = 0; i < s.length(); i++) {
			sumS = sumS + s.charAt(i) - '0';
			sumT = sumT + t.charAt(i) - '0';
		}
		return sumS == sumT;
	}
}
