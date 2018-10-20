package Medium;

import java.util.*;

public class TaskScheduler {
	public int leastInterval(char[] tasks, int n) {
		if (n == 0)
			return tasks.length;

		Map<Character, Integer> map = new HashMap<>();
		for (char ch : tasks)
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		Queue<Integer> pq = new PriorityQueue<>(map.size(), new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return Integer.compare(b, a);
			}
		});

		for (int entry : map.values())
			pq.add(entry);

		Map<Integer, Integer> coolDown = new HashMap<>();
		int currTime = 0;
		while (!pq.isEmpty() || !coolDown.isEmpty()) {
			if (coolDown.containsKey(currTime - n - 1)) {
				pq.add(coolDown.remove(currTime - n - 1));
			}
			if (!pq.isEmpty()) {
				int freqleft = pq.poll() - 1;
				if (freqleft > 0)
					coolDown.put(currTime, freqleft);
			}
			currTime++;
		}
		return currTime;
	}
}
