package string;

public class ReverseString {

	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		reverseWords(s);
	}

	@SuppressWarnings("null")
	public static String reverseWords(String S) {
		String[] m = null;
		for (int i = 0; i < S.length(); i++) {
			m = S.split("");
		}
		String[] k = null;
		for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
			k[i] = m[j];
		}
		System.out.println(k.toString());
		return null;
	}
}
