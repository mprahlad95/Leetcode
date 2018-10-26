package Medium;

import java.util.*;

public class Flatted2DVector {
	Queue<Integer> queue;

	public Flatted2DVector(List<List<Integer>> vec2d) {
		queue = new LinkedList<>();
		for (int i = 0; i < vec2d.size(); i++) {
			for (int j = 0; j < vec2d.get(i).size(); j++) {
				queue.add(vec2d.get(i).get(j));
			}
		}
	}

	public Integer next() {
		return queue.remove();
	}

	public boolean hasNext() {
		return (!queue.isEmpty());
	}
}
