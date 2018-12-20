package Hard;

import java.util.*;

public class LongestSubstringwithAtMostTwoDistinctCharacters {
	public int lengthOfLongestSubstringTwoDistinct(String s) {
		if (s == null || s.length() == 0)
			return 0;
		Map<Character, Integer> map = new HashMap<>();
		int left = 0, right = 0, max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (map.size() <= 2)
				map.put(s.charAt(i), right++);
			if (map.size() > 2) {
				int leftIndex = Collections.min(map.values());
				map.remove(s.charAt(leftIndex));
				left = leftIndex + 1;
			}
			max = Math.max(max, right - left);
		}
		return max;
	}
}
