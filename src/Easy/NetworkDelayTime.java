package Easy;

import java.util.*;

public class NetworkDelayTime {
	public int networkDelayTime(int[][] times, int N, int K) {
		Map<Integer, Integer> distance = new HashMap<>();
		Map<Integer, List<int[]>> graph = new HashMap<>();

		for (int[] edge : times) {
			if (!graph.containsKey(edge[0]))
				graph.put(edge[0], new ArrayList<int[]>());
			graph.get(edge[0]).add(new int[] { edge[1], edge[2] });
		}

		for (int node = 1; node <= N; node++)
			distance.put(node, Integer.MAX_VALUE);

		distance.put(K, 0);
		boolean[] visited = new boolean[N + 1];

		while (true) {
			int currentNode = -1;
			int currentDist = Integer.MAX_VALUE;
			for (int i = 1; i <= N; i++) {
				if (!visited[i] && distance.get(i) < currentDist) {
					currentDist = distance.get(i);
					currentNode = i;
				}
			}

			if (currentNode < 0)
				break;
			visited[currentNode] = true;
			if (graph.containsKey(currentNode))
				for (int[] val : graph.get(currentNode))
					distance.put(val[0], Math.min(distance.get(val[0]), distance.get(currentNode) + val[1]));
		}
		return (distance.values().contains(Integer.MAX_VALUE)) ? -1 : Collections.max(distance.values());
	}
}
