package leetcode.basic;

//https://leetcode.com/problems/valid-perfect-square/submissions/827406604/
public class PerfectSquare {

	public static void main(String[] args) {
		long num = 16;
		System.out.println(isPerfectSquare(num));
	}

	public static boolean isPerfectSquare(long num) {
		long start = 1;
		long end = num;
		boolean ans = false;
		if (num < 0)
			return false;
		if (num <= 1)
			return true;
		while (end >= start) {
			long mid = start + (end - start) / 2;
			if (mid * mid == num) {
				return true;
			} else if (mid * mid > num)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return ans;
	}
}
