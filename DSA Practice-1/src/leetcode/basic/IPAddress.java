package leetcode.basic;

//https://leetcode.com/problems/defanging-an-ip-address/
public class IPAddress {

	public static void main(String[] args) {
		System.out.println(defangIPaddr("Mahi.kolhe.23"));
	}

	public static String defangIPaddr(String address) {
		StringBuilder sb = new StringBuilder(address);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '.') {
				sb.insert(i - 1, '[');
				sb.insert(i + 1, ']');

			}
		}
		String ans = new String(sb);
		return ans;
	}
}
