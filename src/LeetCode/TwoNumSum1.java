package LeetCode;

import java.util.LinkedList;

public class TwoNumSum1 {
	public static void main(String args[]) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		for(int i=0; i<3; i++) {
			list1.add((int) (Math.random()*(10-1)+1));
			list2.add((int) (Math.random()*(10-1)+1));
		}
		
		int temp =0;
		int i3 = 0;
		LinkedList<Integer> list3 = new LinkedList<>();
		for(int i=0; i<3; i++) {
			int i1 = list1.get(i);
			int i2 = list2.get(i);
			
			int sum = i1 + i2 + temp;
			if(i == list1.size()-1) {
				list3.add(sum);
			}else {
				i3 = sum%10;
				temp = sum/10;
				list3.add(i3);
			}
			
		}
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
	}
}
