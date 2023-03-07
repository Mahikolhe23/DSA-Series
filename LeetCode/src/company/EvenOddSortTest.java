package company;

import java.util.ArrayList;
import java.util.List;

public class EvenOddSortTest {

	public static void main(String[] args) {
		List<Integer> list = List.of(12, 0, 7, 6, 0, 32);
		System.out.println(evenOdd(list));
	}
	//list of even number asc order and 0 in last position
	public static List<Integer> evenOdd(List<Integer> numbers) {
		List<Integer> nums = new ArrayList<Integer>();
		List<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 0 && numbers.get(i) != 0) {
				nums.add(numbers.get(i));
			}
			if (numbers.get(i) == 0)
				ans.add(numbers.get(i));
		}
		nums.addAll(ans);
		return nums;
	}
}
