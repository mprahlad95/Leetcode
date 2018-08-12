package Medium;

import java.util.*;

public class SpiralMatrixIII {
	public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
		int rowInc = 1, colInc = 1;
		List<int[]> list = new ArrayList<>();
		boolean travelRight = true, travelDown = true;
		while (list.size() < R * C) {
			for (int i = 0; i < colInc; i++) {
				if (r0 < R && r0 >= 0 && c0 < C && c0 >= 0) {
					list.add(new int[] { r0, c0 });
				}
				if (travelRight) {
					c0++;
				} else {
					c0--;
				}
			}
			travelRight = !travelRight;
			colInc++;

			for (int i = 0; i < rowInc; i++) {
				if (c0 < C && c0 >= 0 && r0 < R && r0 >= 0) {
					list.add(new int[] { r0, c0 });
				}
				if (travelDown) {
					r0++;
				} else {
					r0--;
				}
			}
			travelDown = !travelDown;
			rowInc++;
		}
		int[][] arr = new int[list.size()][2];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}
}
