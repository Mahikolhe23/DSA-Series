package leetcode.basics;

//https://leetcode.com/problems/count-the-digits-that-divide-a-number/
public class CountDigitDivide {

	public static void main(String[] args) {
		System.out.println(countDigits(1248));
	}

	public static int countDigits(int num) {
		String n = Integer.toString(num);
		int c = 0;
		for (int i = 0; i < n.length(); i++) {
			if ((num % (n.charAt(i) - '0')) == 0)
				c++;
		}
		return c;
	}
}
