package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8FeaturesTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i * 2);
		}
		System.out.println(list);
		List<Integer> temp = new ArrayList<>();
		temp = list.stream().filter(x -> x >= 10).collect(Collectors.toList());
		System.out.println(temp);
		temp = list.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(temp);
	}
}
