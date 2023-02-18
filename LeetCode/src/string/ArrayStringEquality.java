package string;

//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class ArrayStringEquality {

	public static void main(String[] args) {
		String[] word1 = { "a", "cb" }, word2 = { "ab", "c" };
		System.out.println(arrayStringsAreEqual(word1, word2));
	}

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < word1.length; i++) {
			s1 += word1[i];
		}
		for (int i = 0; i < word2.length; i++) {
			s2 += word2[i];
		}
		return s1.endsWith(s2);
	}
}
