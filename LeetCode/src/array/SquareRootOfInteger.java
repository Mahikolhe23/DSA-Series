package array;

//https://leetcode.com/problems/sqrtx/
public class SquareRootOfInteger {

	public static void main(String[] args) {
		System.out.println(mySqrt(5));
	}

	public static int mySqrt(int x) {
		long r = x;
		while (r * r > x)
			r = (r + x / r) / 2;
		return (int) r;
	}
}