package Medium;

public class FriendCircles_DFS {
	public int findCircleNum(int[][] M) {
		int count = 0;
		for (int i = 0; i < M.length; i++) {
			if (M[i][i] == 1) {
				count++;
				dfs(M, i);
			}
		}
		return count;
	}

	public void dfs(int[][] M, int i) {
		if (M[i][i] == -1)
			return;
		M[i][i] = -1;
		for (int j = 0; j < M[i].length; j++) {
			if (M[i][j] == 1) {
				dfs(M, j);
			}
		}
	}
}
