package string;

//https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(s));
	}

	public static int lengthOfLastWord(String s) {
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				count++;
			} else if (count > 0)
				return count;
		}
		return count;
	}
}

