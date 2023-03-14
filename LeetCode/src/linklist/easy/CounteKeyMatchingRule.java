package linklist.easy;

import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/count-items-matching-a-rule/
public class CounteKeyMatchingRule {
	public static void main(String[] args) {
		List<List<String>> items = Arrays.asList(
				Arrays.asList("phone", "blue", "pixel"),
				Arrays.asList("computer", "silver", "phone"), 
				Arrays.asList("phone", "gold", "iphone"));
		String ruleKey = "type";
		String ruleValue = "phone";
		System.out.println(countMatches(items, ruleKey, ruleValue));
	}

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
		for (int i = 0; i < items.size(); i++) {
				if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
					count++;
				if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue))
					count++;
				if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue))
					count++;
		}
		return count;
	}
}
