package array;

import java.util.ArrayList;

//https://leetcode.com/problems/baseball-game/
public class BaseballGame {

	public static void main(String[] args) {
		String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		System.out.println(calPoints(ops));
	}

	public static int calPoints(String[] operations) {
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < operations.length; i++) {
			char[] c = operations[i].toCharArray();
			char ind = c[0];
			if (Character.isDigit(ind))
				list.add(ind - '0');
			else {
				switch (ind) {
				case '+': {
					list.add(list.get(i - 1) + list.get(i - 2));
					break;
				}
				case 'C':
					list.remove(i - 1);
					break;
				case 'D':
					list.add(list.get(i - 1) * 2);
					break;
				}
			}
		}
		return sum;
	}
}