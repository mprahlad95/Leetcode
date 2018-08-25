package Easy;

import java.util.*;

public class MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
		paragraph = paragraph.toLowerCase();
		String[] words = paragraph.split("\\W+");
		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		for (String word : banned) {
			if (map.containsKey(word))
				map.remove(word);
		}
		int max = Integer.MIN_VALUE;
		String res = "";
		for (String word : map.keySet()) {
			if (map.get(word) > max) {
				max = map.get(word);
				res = word;
			}
		}
		return res;
	}
}
