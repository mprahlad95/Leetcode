package Medium;

import java.util.*;

public class MinimumArrowsToBurstBalloons {
	public int findMinArrowShots(int[][] points) {
		if (points == null || points.length == 0)
			return 0;
		int arrows = 1;
		// Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
		Arrays.sort(points, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return Integer.compare(a[1], b[1]);
			}
		});
		int firstCommonEnd = points[0][1];
		for (int i = 1; i < points.length; i++) {
			if (points[i][0] > firstCommonEnd) {
				arrows++;
				firstCommonEnd = points[i][1];
			}
		}
		return arrows;
	}
}
