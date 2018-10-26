package Medium;

import java.util.*;

public class WallsAndGates {
	public void wallsAndGates(int[][] rooms) {
		if (rooms == null || rooms.length == 0)
			return;
		int blocked = -1;
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[0].length; j++) {
				if (rooms[i][j] == 0)
					q.add(new int[] { i, j });
			}
		}

		int[][] direction = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
		while (!q.isEmpty()) {
			int temp[] = q.remove();
			int currentrow = temp[0], currentcol = temp[1];
			for (int i = 0; i < 4; i++) {
				int nextrow = currentrow + direction[i][0], nextcol = currentcol + direction[i][1];
				if (nextrow >= 0 && nextcol >= 0 && nextrow < rooms.length && nextcol < rooms[0].length
						&& rooms[nextrow][nextcol] != blocked) {
					if (rooms[nextrow][nextcol] > rooms[currentrow][currentcol] + 1) {
						rooms[nextrow][nextcol] = rooms[currentrow][currentcol] + 1;
						q.add(new int[] { nextrow, nextcol });
					}
				}
			}
		}
	}
}
