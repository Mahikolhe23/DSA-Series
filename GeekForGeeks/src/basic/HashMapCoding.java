package basic;

import java.util.HashMap;
import java.util.Map;

public class HashMapCoding {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mahi");
		map.put(2, "Niku");
		map.put(3, "PK");
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			if (e.getKey() == 3) {
				System.out.println("value " + e.getValue());
			}
			if (e.getValue() == "Mahi") {
				System.out.println("Key " + e.getKey());
			}
		}
		String s1 = new String("javaguides");
		String s2 = new String("javaguides");
		System.out.println(s1 == s2);
//		System.out.println(map);
	}
}
