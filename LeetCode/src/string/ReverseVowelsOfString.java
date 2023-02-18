package string;

//https://leetcode.com/problems/reverse-vowels-of-a-string/
public class ReverseVowelsOfString {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverseVowels(s));
	}

	public static String reverseVowels(String s) {
		if (s.length() == 0 || s == null)
			return s;
		char[] sm = s.toCharArray();
		String v = "aeiouAEIOU";
		int start = 0;
		int end = sm.length - 1;
		while (start < end) {
			while (start < end && !v.contains(sm[start] + ""))
				start++;
			while (start < end && !v.contains(sm[end] + ""))
				end--;
			char c = sm[start];
			sm[start] = sm[end];
			sm[end] = c;
			start++;
			end--;
		}
		return new String(sm);
	}
}
