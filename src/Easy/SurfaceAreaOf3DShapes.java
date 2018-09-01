package Easy;

public class SurfaceAreaOf3DShapes {
	public int surfaceArea(int[][] grid) {
		int area = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j] > 0)
					area += 4 * grid[i][j] + 2;
				if (i > 0)
					area -= 2 * Math.min(grid[i][j], grid[i - 1][j]); //up
				if (j > 0)
					area -= 2 * Math.min(grid[i][j], grid[i][j - 1]); //left
			}
		}
		return area;
	}
}
