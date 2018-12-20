package Medium;

import java.util.*;

public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums)
			map.put(num, map.getOrDefault(num, 0) + 1);

		Queue<Integer> pq = new PriorityQueue<>((a, b) -> (map.get(a) - map.get(b)));
		for (int num : map.keySet()) {
			pq.offer(num);
			if (pq.size() > k)
				pq.poll();
		}
		return new ArrayList<>(pq);
	}
}
