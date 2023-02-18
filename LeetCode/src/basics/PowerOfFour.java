package basics;

//https://leetcode.com/problems/power-of-four/
public class PowerOfFour {

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(4));
	}

	public static boolean isPowerOfFour(int n) {
		if (n == 1) {
			return true;
		}
		if (n == 0) {
			return false;
		}
		return Math.log10(n) / Math.log10(4) % 1 == 0;
	}
}
