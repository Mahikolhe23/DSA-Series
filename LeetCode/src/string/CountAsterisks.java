package string;

//https://leetcode.com/problems/count-asterisks/
public class CountAsterisks {

	public static void main(String[] args) {
		String s = "yo|uar|e**|b|e***au|tifu|l";
		System.out.println(countAsterisks(s));
	}

	public static int countAsterisks(String s) {
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '|') {
				if (s.charAt(i) == '*')
					c++;
			} else {
				do {
					i++;
				} while (s.charAt(i) != '|');
			}
		}
		return c;
	}
}
