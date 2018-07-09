package Easy;

import java.util.*;

public class IsomorphicStrings_naive {
	public boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map = new HashMap<>();
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		if (s.length() != t.length())
			return false;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map1.containsKey(ch))
				map1.put(ch, map1.get(ch) + 1);
			else
				map1.put(ch, 1);
			char ch1 = t.charAt(i);
			if (map2.containsKey(ch1))
				map2.put(ch1, map2.get(ch1) + 1);
			else
				map2.put(ch1, 1);
		}
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (map.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
			} else {
				if (!map1.get(s.charAt(i)).equals(map2.get(t.charAt(i)))) {
					return false;
				}
				map.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
	}
}
