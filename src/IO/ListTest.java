package IO;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		int tag =0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i-tag)==2 || list.get(i-tag)==4) {
				list.remove(i-tag);
				tag++;
			}
		}
		
		System.out.println(list);
	}

}
