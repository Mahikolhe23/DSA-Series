package basics;

//https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(3));
	}

	public static int climbStairs(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		int a = 1;
		int b = 2;
		int c = 0;
		for (int i = 1; i < n - 1; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
}
