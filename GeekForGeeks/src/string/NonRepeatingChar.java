package string;

import java.util.LinkedHashSet;

//https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1?page=1&difficulty[]=0&category[]=Strings&sortBy=submissions
public class NonRepeatingChar {

	public static void main(String[] args) {
		String S = "hello";
		System.out.println(nonrepeatingCharacter(S));
	}

	static char nonrepeatingCharacter(String S) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < S.length(); i++) {
			set.add(S.charAt(i));
		}
		Character[] arr = new Character[set.size()];
		arr = set.toArray(arr);
		return arr[0];
	}
}
