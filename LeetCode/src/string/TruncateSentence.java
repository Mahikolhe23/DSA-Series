package string;

//https://leetcode.com/problems/truncate-sentence/
public class TruncateSentence {
	public static void main(String[] args) {
		String s = "chopper is not a tanuki";
		int k = 4;
		System.out.println(truncateSentence(s, k));
	}

	public static String truncateSentence(String s, int k) {
		String[] arr = s.split(" ");
		String ans = "";
		for (int i = 0; i <=k; i++) {
			ans += arr[i] + " ";
		}
		return ans.stripTrailing();
	}
}
