package Hard;

import java.util.*;

public class LargestAreaInHistogram {
	public int largestRectangleArea(int[] heights) {
		if (heights == null || heights.length == 0)
			return 0;
		Stack<Integer> s = new Stack<>();
		int area = 0, maxArea = 0, i = 0;
		while (i < heights.length) {
			if (s.isEmpty() || heights[s.peek()] <= heights[i]) {
				s.push(i++);
			} else {
				int top = s.pop();
				if (s.isEmpty()) {
					area = heights[top] * i;
				} else {
					area = heights[top] * (i - s.peek() - 1);
				}
				maxArea = Math.max(area, maxArea);
			}
		}
		while (!s.isEmpty()) {
			int top = s.pop();
			if (s.isEmpty()) {
				area = heights[top] * i;
			} else {
				area = heights[top] * (i - s.peek() - 1);
			}
			maxArea = Math.max(area, maxArea);
		}
		return maxArea;
	}
}
