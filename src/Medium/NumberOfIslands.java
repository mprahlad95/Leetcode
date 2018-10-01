package Medium;

public class NumberOfIslands {
	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;
		int islands = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					helper(grid, i, j);
					islands++;
				}
			}
		}
		return islands;
	}

	public void helper(char[][] grid, int i, int j) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
			return;
		grid[i][j] = '0';
		helper(grid, i + 1, j);
		helper(grid, i - 1, j);
		helper(grid, i, j + 1);
		helper(grid, i, j - 1);
	}
}
