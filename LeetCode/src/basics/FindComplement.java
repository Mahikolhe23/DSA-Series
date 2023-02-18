package basics;

//https://leetcode.com/problems/number-complement/
public class FindComplement {

	public static void main(String[] args) {
		System.out.println(findComplement(2));
	}

	public static int findComplement(int num) {
		String ans = Integer.toBinaryString(num);
		int sum = 0;
		//System.out.println(ans);
		String m = "";
		for (int i = ans.length() - 1; i >= 0; i--) {
			m += ans.charAt(i);
		}
		//System.out.println(m);

		for (int i = 0; i < m.length(); i++) {
			if (m.charAt(i) == '0') {
				int n = m.charAt(i) - '0' + 1;
				sum += n * Math.pow(2, i);
//				sum += Math.pow(m.charAt(i) - '0', i);
			}

		}
		return sum;
	}
}
