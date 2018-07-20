package Medium;

import java.util.*;

public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}
		ValueComparator bvc = new ValueComparator(map);
		Map<Integer, Integer> sortedMap = new TreeMap<>(bvc);
		sortedMap.putAll(map);
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(sortedMap.entrySet());
		List<Integer> result = new ArrayList<>();
		int i = 0;
		for (Map.Entry<Integer, Integer> n : list) {
			if (i == k) {
				break;
			}
			result.add(n.getKey());
			i++;
		}
		return result;

	}

	class ValueComparator implements Comparator<Integer> {
		private Map<Integer, Integer> map;

		public ValueComparator(Map<Integer, Integer> map) {
			this.map = map;
		}

		public int compare(Integer a, Integer b) {
			if (map.get(a) >= map.get(b)) {
				return -1;
			} else {
				return 1;
			}
		}
	}
}
