package basics;

//https://leetcode.com/problems/number-of-common-factors/
public class CommonFactorInTwoNumber {
	public static void main(String[] args) {
		System.out.println(commonFactors(12, 6));
	}

	public static int commonFactors(int a, int b) {
		int c = 0;
		int m = Math.min(a, b);
		for (int i = 1; i <= m; i++) {
			if ((a % i == 0) && (b % i == 0))
				c++;
		}
		return c;
	}
}
