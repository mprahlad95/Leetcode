package Easy;

import java.util.*;

public class CountBinarySubstrings {
	public int countBinarySubstrings(String s) {
		// Store length of consecutive 0s and 1s
		List<Integer> list = new ArrayList<>();
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1))
				count++;
			else {
				list.add(count);
				count = 1;
			}
		}
		list.add(count);
		count = 0;
		// Find min of all consecutive 0s and 1s
		for (int i = 1; i < list.size(); i++)
			count += Math.min(list.get(i), list.get(i - 1));
		return count;
	}
}
