package leetcode.string;

//https://leetcode.com/problems/find-the-difference/
public class FindDiffernce {

	public static void main(String[] args) {
		String s = "", t = "y";
		System.out.println(findTheDifference(s, t));
	}

	public static char findTheDifference(String s, String t) {
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < t.length() - 1; i++) {
			sum = sum + s.charAt(i) - '0';
			sum1 = sum1 + t.charAt(i) - '0';
		}
		sum1 += t.charAt(t.length() - 1);
		return (char) (sum1 - sum);
	}
}
