package Medium;

public class RedundantConnection {
	public int[] findRedundantConnection(int[][] edges) {
		int ans[] = new int[1];
		int parent[] = new int[1001];
		for (int i = 0; i < parent.length; i++)
			parent[i] = i;

		for (int[] edge : edges) {
			int xRoot = find(parent, edge[0]);
			int yRoot = find(parent, edge[1]);
			if (xRoot == yRoot)
				ans = edge;
			parent[yRoot] = xRoot;
		}
		return ans;
	}

	public int find(int[] parent, int x) {
		if (parent[x] != x)
			parent[x] = find(parent, parent[x]);
		return parent[x];
	}
}
