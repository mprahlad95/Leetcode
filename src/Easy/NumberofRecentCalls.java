package Easy;

import java.util.*;

public class NumberofRecentCalls {
	Queue<Integer> queue;

	public NumberofRecentCalls() {
		queue = new LinkedList<>();
	}

	public int ping(int t) {
		while (!queue.isEmpty() && queue.peek() < (t - 3000)) {
			queue.remove();
		}
		queue.add(t);
		return queue.size();
	}
}
