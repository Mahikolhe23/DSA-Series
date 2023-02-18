package string;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String Str = "geeksforgeeks";
		System.out.println(removeDuplicates(Str));
	}

	public static String removeDuplicates(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) != str.charAt(j)) {
					s = s + str.charAt(j);
				}
			}
		}
		return s;
	}
}
