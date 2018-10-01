package Easy;

public class MaxAreaofIsland {
	public int maxAreaOfIsland(int[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;
		int maxArea = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1)
					maxArea = Math.max(maxArea, findArea(grid, i, j, 0));
			}
		}
		return maxArea;
	}

	public int findArea(int[][] grid, int i, int j, int area) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
			return area;
		grid[i][j] = 0;
		return 1 + findArea(grid, i + 1, j, 0) + findArea(grid, i, j + 1, 0) + findArea(grid, i - 1, j, 0)
				+ findArea(grid, i, j - 1, 0);
	}
}
