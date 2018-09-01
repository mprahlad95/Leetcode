package Hard;

import java.util.*;

public class MaximalRectangle {
	public int maximalRectangle(char[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return 0;
		int[] arr = new int[matrix[0].length];
		int max = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == '0')
					arr[j] = 0;
				else
					arr[j] += (matrix[i][j] - '0');
			}
			max = Math.max(max, largestRectangleArea(arr));
		}
		return max;
	}

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
