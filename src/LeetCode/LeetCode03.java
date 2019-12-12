package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Description 给定一个字符串，查出其中不含重复字符的最长字串
 * @author Administrator
 *
 */
public class LeetCode03 {
	public static void main(String args[]) {
		String s = "abcdefcea";
		LeetCode03 leetCode03 = new LeetCode03();
		
		int res1 = leetCode03.lengthOfLongestSubstring1(s);
		int res2 = leetCode03.lengthOfLongestSubstring2(s);
		int res3 = leetCode03.lengthOfLongestSubstring3(s);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}
	
	//hashMap
	public int lengthOfLongestSubstring1(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int res = 0, left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                left = Math.max(left, hashMap.get(s.charAt(i)));
            }
            res = Math.max(res, i - left + 1);

            hashMap.put(s.charAt(i), i + 1);
        }
        return res;
    }
	
	//hashSet
	public int lengthOfLongestSubstring2(String s) {
		int res = 0, left = 0, right = 0;
		HashSet<Character> t = new HashSet<Character>();

		while (right < s.length()) {
			if (!t.contains(s.charAt(right))) {
				t.add(s.charAt(right));
				right++;
				res = Math.max(res, t.size());
			} else {
				t.remove(s.charAt(left));
				left++;
			}
		}
		return res;
	}
	 
	//chatSet
	public int lengthOfLongestSubstring3(String s) {
		int[] m = new int[256];
		int res = 0, left = 0;

		for (int i = 0; i < s.length(); i++) {
			left = Math.max(left, m[s.charAt(i)]);
			res = Math.max(res, i - left + 1);
			m[s.charAt(i)] = i + 1;
		}
		return res;
	}
}
