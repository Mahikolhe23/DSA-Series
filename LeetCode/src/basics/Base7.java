package basics;

//https://leetcode.com/problems/base-7/
public class Base7 {
	public static void main(String[] args) {
		System.out.println(convertToBase7(-7));
	}

	public static String convertToBase7(int num) {
		int count = 0, res = 0;
		while (num != 0) {
			int dig = num % 7;
			res += dig * (int) Math.pow(10, count);
			count++;
			num /= 7;
		}
		return Integer.toString(res);
	}
}
