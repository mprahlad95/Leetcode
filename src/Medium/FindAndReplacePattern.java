package Medium;

import java.util.*;

public class FindAndReplacePattern {
	public List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> list = new ArrayList<>();
		if (words == null || words.length == 0 || pattern == null || pattern.length() == 0)
			return list;
		Map<Character, Character> map1 = new HashMap<>();
		Map<Character, Character> map2 = new HashMap<>();
		for (int j = 0; j < words.length; j++) {
			String s = words[j];
			boolean flag = true;
			for (int i = 0; i < pattern.length(); i++) {
				char ch = words[j].charAt(i);
				char ch1 = pattern.charAt(i);
				if (!map1.containsKey(ch1))
					map1.put(ch1, ch);
				if (!map2.containsKey(ch))
					map2.put(ch, ch1);
				if (map1.get(ch1) != ch || map2.get(ch) != ch1) {
					flag = false;
					break;
				}
			}
			if (flag)
				list.add(s);
			map1.clear();
			map2.clear();
		}
		return list;
	}
}
