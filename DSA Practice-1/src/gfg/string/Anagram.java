package gfg.string;

public class Anagram {

	public static void main(String[] args) {
		String a = "allergy", b = "allergic";
		System.out.println(isAnagram(a, b));
	}

	public static boolean isAnagram(String a, String b) {
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(i) && a.charAt(j) == b.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
}
