package company;

import java.util.ArrayList;

public class MinimumChild {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(0);
		list.add(0);
		System.out.println(min(3, 1, list));
	}

	public static int min(int n, int x, ArrayList<Integer> arr) {
		int c = 0;
		for (int i = 0; i < arr.size(); i++) {
			int p = arr.get(i);
			for (int j = 0; j < arr.size(); j++) {
				if (p != -1 && arr.get(p) > x) {
					c++;
				}
			}
		}
		return c;
	}
}
