package company;

public class CountCharInString {

	public static void main(String[] args) {
		String s = "ABCDEFAEIOUABCD";
		countChar(s);
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
			System.out.println("char = " + s.charAt(i) + " count = " + c);
		}
	}
}
