package Medium;

import java.util.*;

public class CourseSchedule {
	public boolean canFinish(int n, int[][] prerequisites) {
		@SuppressWarnings("unchecked")
		List<Integer>[] graph = new ArrayList[n];

		for (int i = 0; i < n; i++)
			graph[i] = new ArrayList<Integer>();

		for (int[] edge : prerequisites) {
			int from = edge[1], to = edge[0];
			graph[from].add(to);
		}

		boolean visited[] = new boolean[n], finished[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (!dfs(graph, visited, finished, i))
				return false;
		}

		return true;
	}

	public boolean dfs(List<Integer>[] graph, boolean[] visited, boolean[] finished, int start) {
		if (finished[start])
			return true;
		if (visited[start])
			return false;
		visited[start] = true;

		List<Integer> adj = graph[start];

		for (int i = 0; i < adj.size(); i++) {
			if (!dfs(graph, visited, finished, adj.get(i)))
				return false;
		}
		finished[start] = true;
		return true;
	}
}
