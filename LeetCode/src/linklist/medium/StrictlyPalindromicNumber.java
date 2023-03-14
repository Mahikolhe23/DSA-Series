package linklist.medium;

//https://leetcode.com/problems/strictly-palindromic-number/
public class StrictlyPalindromicNumber {

	public static void main(String[] args) {
		System.out.println(isStrictlyPalindromic(9));
	}

	public static boolean isStrictlyPalindromic(int n) {
		boolean flag = true;
		for (int i = 2; i < n - 1; i++) {
			if (!check(Integer.toString(n, i))) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static boolean check(String n) {
		int left = 0;
		int right = n.length() - 1;
		while (left < right) {
			if (n.charAt(left) != n.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
}
