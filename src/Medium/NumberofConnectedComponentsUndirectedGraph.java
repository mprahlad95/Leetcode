package Medium;

public class NumberofConnectedComponentsUndirectedGraph {
	public int countComponents(int n, int[][] edges) {
		int[] parent = new int[n];
		for (int i = 0; i < n; i++)
			parent[i] = i;

		int components = 0;
		for (int i = 0; i < edges.length; i++) {
			int xRoot = find(parent, edges[i][0]);
			int yRoot = find(parent, edges[i][1]);
			parent[yRoot] = xRoot;
		}

		for (int i = 0; i < parent.length; i++)
			if (parent[i] == i)
				components++;
		return components;
	}

	public int find(int[] parent, int i) {
		if (parent[i] != i)
			parent[i] = find(parent, parent[i]);
		return parent[i];
	}
}
