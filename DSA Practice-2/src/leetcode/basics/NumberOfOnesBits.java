package leetcode.basics;

//https://leetcode.com/problems/number-of-1-bits/
public class NumberOfOnesBits {

	public static void main(String[] args) {
		int n = 00000000000000000000000000001011;
		System.out.println(hammingWeight(n));
	}

	public static int hammingWeight(int n) {
		return Integer.bitCount(n);
	}
}
