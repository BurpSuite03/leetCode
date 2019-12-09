package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sum {
	
	public static void main(String args[]) {
	   long start = System.currentTimeMillis();
	   System.out.println(start);
	   List<Integer> list = new ArrayList<>();
	   list.add(2);
	   list.add(7);
	   list.add(11);
	   list.add(15);
	   for(int i =18;i<100000;i++) {
		   list.add(i);
	   }
	   list.add(1);
	   list.add(8);
	   Integer target = 9;
	   List<Map<String, Integer>> list1 = new ArrayList<>();
		for (int i=0;i<list.size();i++) {
             if(list.get(i) <= target) {
            	 Map<String, Integer> map = new HashMap<>();
            	 map.put("num", list.get(i));
            	 map.put("sub", i);
            	 list1.add(map);
             }
		}
		
		for(int i=0;i<list1.size();i++) {
			for(int j=i+1;j<list1.size();j++) {
				if((list1.get(i).get("num")+list1.get(j).get("num")) == target) {
					System.out.println(list1.get(i).get("sub"));
					System.out.println(list1.get(j).get("sub"));
				}
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
