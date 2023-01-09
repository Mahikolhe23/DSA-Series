package leetcode.string;

//https://leetcode.com/problems/add-strings/
public class AddString {

	public static void main(String[] args) {
		String num1 = "456", num2 = "77";
		System.out.println(addStrings(num1, num2));
	}

	public static String addStrings(String num1, String num2) {
//		long a = 0L;
//		long b = 0L;
//		for (int i = 0; i < num1.length(); i++) {
//			a = a * 10 + num1.charAt(i) - '0';
//		}
//		for (int i = 0; i < num2.length(); i++) {
//			b = b * 10 + num2.charAt(i) - '0';
//		}
//		long ans = a + b;
//		return Long.toString(ans);
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		StringBuilder sb = new StringBuilder();
		int c = 0;
		while (i >= 0 || j >= 0 || c > 0) {
			int n1 = 0;
			int n2 = 0;
			if (i >= 0) {
				n1 = num1.charAt(i) - '0';
				i--;
			}
			if (j >= 0) {
				n2 = num2.charAt(j) - '0';
				j--;
			}
			int num = (n1 + n2 + c) % 10;
			c = (n1 + n2 + c) >= 10 ? 1 : 0;
			sb.append(num);
		}
		return sb.reverse().toString();
	}
}
