package string;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class ReverseWordinString {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
		String[] arr = s.split(" ");
		String[] arr1 = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			String a = arr[i];
			String b = "";
			for (int j = a.length() - 1; j >= 0; j--) {
				b += a.charAt(j);
			}
			arr1[i] = b + " ";
		}
		String ans = "";
		for (int i = 0; i < arr1.length; i++) {
			ans += arr1[i];
		}
		return ans;
	}
}
