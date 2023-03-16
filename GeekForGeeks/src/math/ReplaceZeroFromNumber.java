package math;

//https://practice.geeksforgeeks.org/problems/replace-all-0s-with-5/1?page=1&category[]=Arrays&sortBy=accuracy
public class ReplaceZeroFromNumber {

	public static void main(String[] args) {

	}

	static int convertfive(int num) {
		String temp = Integer.toString(num);
		String ans = "";
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == '0') {
				ans += "5";
			} else
				ans += temp.charAt(i);
		}
		return Integer.parseInt(ans);
	}

}
