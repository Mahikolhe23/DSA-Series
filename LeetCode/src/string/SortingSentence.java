package string;

//https://leetcode.com/problems/sorting-the-sentence/
public class SortingSentence {

	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));
	}

	public static String sortSentence(String s) {
		String[] arr = s.split(" ");
		String ans = "";
		int c = 1;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if ((arr[i].charAt(arr[i].length() - 1)) - '0' == c) {
					ans += arr[i].substring(0, arr[i].length() - 1) + " ";
					c++;
				}
			}
		}
		return ans.stripTrailing();
	}
}
