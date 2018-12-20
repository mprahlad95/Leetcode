package Hard;

import java.util.*;

public class LongestSubstringwithAtMostKDistinctCharacters {
	public int lengthOfLongestSubstringKDistinct(String s, int k) {
		if (s == null || s.length() == 0 || k == 0)
			return 0;
		int left = 0, right = 0, max = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.size() <= k)
				map.put(s.charAt(i), right++);
			if (map.size() > k) {
				int leftIndex = Collections.min(map.values());
				map.remove(s.charAt(leftIndex));
				left = leftIndex + 1;
			}
			max = Math.max(max, right - left);
		}
		return max;
	}
}
