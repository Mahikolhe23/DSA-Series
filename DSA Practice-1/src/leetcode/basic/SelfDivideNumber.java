package leetcode.basic;

//https://leetcode.com/problems/self-dividing-numbers/solutions/?languageTags=java
import java.util.ArrayList;
import java.util.List;

public class SelfDivideNumber {

	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(1, 22));
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> n = new ArrayList<>();
		outer: for (int i = left; i <= right; i++) {
			for (int j = i; j > 0; j /= 10) {
				int k = j % 10;
				if (k == 0)
					continue outer;
				if (i % k != 0)
					continue outer;
			}
			n.add(i);
		}
		return n;
	}
}
