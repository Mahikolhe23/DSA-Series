package string;

//https://leetcode.com/problems/check-distances-between-same-letters/
public class CheckDistanceBetweenSameLetters {

	public static void main(String[] args) {
		String s = "aa";
		int[] distance = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		System.out.println(checkDistances(s, distance));
	}

	public static boolean checkDistances(String s, int[] distance) {
		for (int i = 0; i < s.length(); i++) {
			int a1 = getIndex(s, s.charAt(i));
			int a2 = getIndex(s, s.charAt(i));
			if ((a2 - a1 == distance[i]))
				return true;
		}
		return false;
	}

	public static int getIndex(String c, char m) {
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) == m)
				return i;
		}
		return 0;
	}
}
