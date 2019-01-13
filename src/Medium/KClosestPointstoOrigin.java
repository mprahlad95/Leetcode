package Medium;

import java.util.*;

public class KClosestPointstoOrigin {
	public int[][] kClosest(int[][] points, int K) {
		int[][] ans = new int[K][K];

		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(points.length, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]);
			}
		});

		for (int[] point : points) {
			pq.add(point);
		}

		int index = 0;
		while (K-- > 0)
			ans[index++] = pq.poll();

		return ans;

	}
}
