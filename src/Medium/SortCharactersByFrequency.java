package Medium;

import java.util.*;

public class SortCharactersByFrequency {
	public String frequencySort(String s) {
		if (s == null || s.length() == 0)
			return "";
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		// Store map into a list
		List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
		// Sort the list based on descending order of values
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Map.Entry<Character, Integer> m1, Map.Entry<Character, Integer> m2) {
				return Integer.compare(m2.getValue(), m1.getValue());
			}
		});
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : list) {
			int freq = entry.getValue();
			while (freq-- > 0)
				sb.append(entry.getKey());
		}
		return sb.toString();
	}
}
