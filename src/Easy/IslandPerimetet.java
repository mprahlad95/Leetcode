package Easy;

public class IslandPerimetet {
	int perimeter = 0;

	public int islandPerimeter(int[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;

		// Find land perimeter
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1)
					dfs(grid, i, j);
			}
		}
		return perimeter;
	}

	public void dfs(int[][] grid, int i, int j) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1)
			return;

		// Mark visited by changing to -1
		grid[i][j] = -1;

		// Check for number of 0s neighboring, or boundary and add perimeter count

		// Check for neighbors
		if (i < grid.length - 1 && grid[i + 1][j] == 0)
			perimeter++;
		if (i > 0 && grid[i - 1][j] == 0)
			perimeter++;
		if (j < grid[0].length - 1 && grid[i][j + 1] == 0)
			perimeter++;
		if (j > 0 && grid[i][j - 1] == 0)
			perimeter++;

		// Boundary check
		if (j == 0)
			perimeter++;
		if (j == grid[0].length - 1)
			perimeter++;
		if (i == 0)
			perimeter++;
		if (i == grid.length - 1)
			perimeter++;

		// DFS
		dfs(grid, i + 1, j);
		dfs(grid, i - 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);
	}
}
