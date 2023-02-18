package sort;

public class SB {

	public static void main(String[] args) {
		StringBuilder in = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			char ch = (char) ('a' + i);
			in.append(ch);
		}
		System.out.println(in.toString());
	}
}
