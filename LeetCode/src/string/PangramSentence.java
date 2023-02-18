package string;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class PangramSentence {

	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));
	}

	public static boolean checkIfPangram(String sentence) {
		boolean[] letters = new boolean[26];

		for (char c : sentence.toCharArray()) {
			letters[c - 'a'] = true;
		}

		// find any letter that not exist
		for (boolean existLetter : letters) {
			if (!existLetter)
				return false;
		}

		return true;
	}
}
