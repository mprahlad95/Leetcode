package Easy;

import java.util.*;

public class LongestPalindrome {
	public int longestPalindrome(String s) {
		Set<Character> set = new HashSet<>();
		for (char ch : s.toCharArray()) {
			if (!set.add(ch))
				set.remove(ch);
		}
		if (set.size() != 0)
			return s.length() - set.size() + 1;
		return s.length();
	}
}
