package Medium;

public class IsBipartiteGraph {
	public boolean isBipartite(int[][] graph) {
		int[] colors = new int[graph.length];
		for (int v = 0; v < graph.length; v++) {
			if (colors[v] == 0 && !dfs(graph, colors, 1, v))
				return false;
		}
		return true;
	}

	public boolean dfs(int[][] graph, int[] colors, int color, int v) {
		if (colors[v] != 0)
			return (colors[v] == color);
		colors[v] = color;
		for (int u : graph[v]) {
			if (!dfs(graph, colors, -color, u))
				return false;
		}
		return true;
	}
}
