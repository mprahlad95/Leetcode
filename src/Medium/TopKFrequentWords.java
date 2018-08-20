package Medium;

import java.util.*;

public class TopKFrequentWords {
	public List<String> topKFrequent(String[] words, int k) {
		List<String> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a,
				b) -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			pq.add(entry);
		}
		while (k-- > 0) {
			list.add(pq.poll().getKey());
		}
		return list;
	}
}
