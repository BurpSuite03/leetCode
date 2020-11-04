package LeetCode100;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author dtc
 * @date 2020-11-4
 * @project leetCode
 * @ClassName TwoNumSum01
 * @Descriotion
 */
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，
//并返回他们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
public class TwoNumSum01 {
	public static void main(String args[]) {
		int[] arr = {2, 4, 6, 10, 8};
		int target = 14;
		TwoNumSum01 twoNumSum01 = new TwoNumSum01();
		int[] arr1 = twoNumSum01.twoSum(arr, target);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		

	}
	
	public int[] twoSum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(target-arr[i])) {
				return new int[] {map.get(target-arr[i]),i};
			}
			map.put(arr[i], i);
		}
		return new int[] {-1, -1};
	}

}
