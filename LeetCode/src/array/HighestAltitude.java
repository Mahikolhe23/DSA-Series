package array;

//https://leetcode.com/problems/find-the-highest-altitude/
public class HighestAltitude {

	public static void main(String[] args) {
		int[] gain = { -5, 1, 5, 0, -7 };
		System.out.println(largestAltitude(gain));
	}

	public static int largestAltitude(int[] gain) {
		int[] temp = new int[gain.length + 1];
		temp[0] = 0;
		for (int i = 1; i < temp.length; i++) {
			temp[i] = gain[i - 1] + temp[i - 1];
		}
		int max = temp[0];
		for (int i = 0; i < temp.length; i++) {
			if (max < temp[i]) {
				max = temp[i];
			}
		}
		return max;
	}
}
