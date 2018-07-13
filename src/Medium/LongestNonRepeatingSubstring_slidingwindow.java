package Medium;

import java.util.*;

public class LongestNonRepeatingSubstring_slidingwindow {
	public static int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int i, j, max = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (i = 0, j = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				j = Math.max(map.get(ch), j); // Highest index of last repeating character - aBcDacBcdf. Index d > Index
												// b, when 2nd b is encountered. Previous instance of current character
												// vs last repeating character.
			}
			max = Math.max(max, i - j + 1);// To pass cases with no repeated elements
			map.put(ch, i + 1); // To pass cases with no repeated elements
		}
		System.out.println(map);
		return max;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("aabcdabcxyzcdf"));
	}
}
