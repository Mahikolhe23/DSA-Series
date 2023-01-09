package leetcode.basics;

//https://leetcode.com/problems/happy-number/
public class HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}

	public static boolean isHappy(int n) {
		if (sum(n) == 1)
			return true;
		return isHappy(sum(n));
	}

	static int sum(int n) {
		int sum1 = 0;
		while (n > 0) {
			int rem = n % 10;
			sum1 = sum1 + rem * rem;
			n = n / 10;
		}
//		System.out.println(sum1);
		return sum1;
	}
}
