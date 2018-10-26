package Easy;

import java.util.*;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
		if (words.length != pattern.length())
			return false;
		Map<Character, String> map = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			if (!map.containsKey(ch)) {
				if (map.values().contains(words[i]))
					return false;
				map.put(ch, words[i]);
			} else if (!map.get(ch).equals(words[i]))
				return false;
		}
		return true;
	}
}
