package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoNumSum {
	public static void main(String args[]) {
		int[] num = new int[100000];
		for(int i=0; i<= 99996; i++) {
			num[i] = i+10;
		}
		num[99997] = 2;
		num[99998] = 7;
		
		List<Map<String, Integer>> list = new ArrayList<>();
		Long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		for (int i = 0; i < num.length; i++) {
            if(num[i] < 9) {
            	Map<String, Integer> map = new HashMap<>();
            	map.put("index", i);
            	map.put("value", num[i]);
            	list.add(map);
            }
		}
		
		for(int i=0; i<list.size()-1; i++) {
			for(int j=i+1; j<list.size(); j++) {
				Integer result = list.get(i).get("value")+list.get(j).get("value");
				if(result == 9) {
					System.out.println(list.get(i).get("value"));
					System.out.println(list.get(j).get("value"));
					System.out.println();
					System.out.println(list.get(i).get("index"));
					System.out.println(list.get(j).get("index"));
				}
			}
		}
		
		Long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println(endTime-startTime);
	}
}
