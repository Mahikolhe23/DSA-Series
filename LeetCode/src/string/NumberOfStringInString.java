package string;

//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
public class NumberOfStringInString {
	public static void main(String[] args) {
		String[] patterns = { "a", "b", "c" };
		String word = "aaaaabbbbb";
		System.out.println(numOfStrings(patterns, word));
	}

	public static int numOfStrings(String[] patterns, String word) {
		int c = 0;
		for (int i = 0; i < patterns.length; i++) {
			if (word.contains(patterns[i])) {
				c++;
			}
		}
		return c;
	}
}
