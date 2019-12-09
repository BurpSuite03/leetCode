package list;

import java.util.HashMap;
import java.util.Map;

public class List1 {
	public static void main(String args[]) {
		String s = "kbjayegegnckjazbapjtheuig";
		Map<String, Integer> map = new HashMap<>();
		Boolean flag = false;
		int count = 0;
		int start = 1;
		int end = s.length()-1;
		for (int i = start; i < end; i++) {
			flag = false;
			for (int j = i - 1; j >= start; j--) {
				char s1 = s.charAt(i);
				char s2 = s.charAt(j);
				if (s1 == s2) {
					start = j + 1;
					if (i - j > count) {
						count = i - j;
					}
					map.put("start", j + 1);
					map.put("end", i);
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		System.out.println(count);
		System.out.println(map.get("start"));
		System.out.println(map.get("end"));
	}
}
