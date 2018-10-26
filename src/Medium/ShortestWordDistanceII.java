package Medium;

import java.util.*;

public class ShortestWordDistanceII {
	Map<String, ArrayList<Integer>> map;

	public ShortestWordDistanceII(String[] words) {
		map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			String current = words[i];
			if (!map.containsKey(current))
				map.put(current, new ArrayList<>(Arrays.asList(i)));
			else
				map.get(current).add(i);
		}
	}

	public int shortest(String word1, String word2) {
		int top = 0, bottom = 0, min = Integer.MAX_VALUE;
		if (map.containsKey(word1) && map.containsKey(word2)) {
			List<Integer> list1 = new ArrayList<>(map.get(word1)), list2 = new ArrayList<>(map.get(word2));
			while (top < list1.size() && bottom < list2.size()) {
				int topval = list1.get(top), bottomval = list2.get(bottom);
				if (topval < bottomval)
					top++;
				else
					bottom++;
				min = Math.min(min, Math.abs(topval - bottomval));
			}
		}
		return min;
	}
}
