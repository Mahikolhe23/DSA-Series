package basics;

//https://leetcode.com/problems/arranging-coins/
public class ArrangingCoins {

	public static void main(String[] args) {
		int n = 8;
		System.out.println(arrangeCoins(n));
	}

	public static int arrangeCoins(int n) {
		long num = n;
		int r;
		for (r = 1; r <= num; r++) {
			num = num - r;
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return r - 1;
	}
}
