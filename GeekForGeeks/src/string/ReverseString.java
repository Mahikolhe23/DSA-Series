package string;

//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1?page=1&difficulty[]=0&category[]=Strings&sortBy=submissions
public class ReverseString {

	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		System.out.println(reverseWords(s));
		pattern(5);
	}

	public static String reverseWords(String S) {
		String[] m = S.split("\\.");
		String k = "";
		for (int i = m.length - 1; i > 0; i--) {
			k += m[i] + ".";
		}
		return k + m[0];
	}

	static void pattern(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
