package Medium;

public class NumberOfCornerRectangles {
	public int countCornerRectangles(int[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					for (int j1 = j + 1; j1 < grid[0].length; j1++) {
						if (grid[i][j1] == 1) {
							for (int i1 = i + 1; i1 < grid.length; i1++) {
								if (grid[i1][j] == 1 && grid[i1][j1] == 1) {
									count++;
								}
							}
						}
					}
				}
			}
		}
		return count;
	}
}
