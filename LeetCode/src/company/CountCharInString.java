package company;

import java.util.Arrays;

public class CountCharInString {

	public static void main(String[] args) {
		String s = "ABCDEFAEIOUABCD";
//		countChar(s);
//		count(s);
		getOccuringChar(s);
	}

	// count number of char in string
	public static void countChar(String s) {
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			c = 0;
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					c++;
			}
			System.out.print("char = " + s.charAt(i) + " count = " + c);
		}
	}

	public static void count(String t) {
		char[] arr = t.toCharArray();
		Arrays.sort(arr);
		String s = new String(arr);
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i) + 1) {
				char m = s.charAt(i + 1);
				int c = 0;
				while (s.charAt(i) == s.charAt(i + 1)) {
					c++;
					i++;
				}
				System.out.println("char = " + m + " count = " + c);
			} else
				System.out.println("char = " + s.charAt(i) + " count = " + 1);
		}
	}

	static final int MAX_CHAR = 256;

	static void getOccuringChar(String str) {
		int count[] = new int[MAX_CHAR];
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;
		System.out.println(Arrays.toString(count));
		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == ch[j])
					find++;
			}
			if (find == 1)
				System.out.println("The occurrence of " + str.charAt(i) + " is: " + count[str.charAt(i)]);
		}
	}
}
