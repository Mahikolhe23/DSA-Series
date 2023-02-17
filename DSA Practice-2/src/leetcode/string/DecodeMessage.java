package leetcode.string;

//https://leetcode.com/problems/decode-the-message/
public class DecodeMessage {

	public static void main(String[] args) {
		String key = "the quick brown fox jumps over the lazy dog";
		String message = "vkbs bs t suepuv";
		System.out.println(key.replaceAll(" ", ""));
		System.out.println(decodeMessage(key, message));
	}

	public static String decodeMessage(String key, String message) {
		String atoz = "abcdefghijklmnopqrstuvwxyz";
		String ans1 = key.replaceAll(" ", "");
		String ans = "";
		for (int i = 0; i < key.length(); i++) {
			if (!(key.charAt(i) == ans1.charAt(i)))
				ans += key.charAt(i);
		}
		return ans;
	}
}
