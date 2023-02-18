package string;

//https://leetcode.com/problems/add-binary/
public class BinaryAddition {

	public static void main(String[] args) {
		String a = "1010", b = "1011";
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {
		if (a.length() == 0)
			return b;
		if (b.length() == 0)
			return a;
		StringBuilder s = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int c = 0;
		while (i >= 0 || j >= 0) {
			int sum = c;
			if (i >= 0)
				sum = sum + a.charAt(i--) - '0';
			if (j >= 0)
				sum = sum + b.charAt(j--) - '0';
			c = sum > 1 ? 1 : 0;
			s.append(sum % 2);
		}
		if (c != 0)
			s.append(c);
		return s.reverse().toString();
	}
}
