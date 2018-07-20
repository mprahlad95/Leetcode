package Medium;

import java.util.*;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] arr) {
		List<Integer> result = new ArrayList<>();
		if (arr == null || arr.length == 0)
			return result;
		int leftBound = 0;
		int rightBound = arr[0].length - 1;
		int bottomBound = arr.length - 1;
		int upperBound = 0;

		while (leftBound <= rightBound && upperBound <= bottomBound) {
			for (int col = leftBound; col <= rightBound; col++) {
				result.add(arr[upperBound][col]);
			}
			upperBound++;

			for (int row = upperBound; row <= bottomBound; row++) {
				result.add(arr[row][rightBound]);
			}
			rightBound--;

			for (int col = rightBound; upperBound <= bottomBound && col >= leftBound; col--) {
				result.add(arr[bottomBound][col]);
			}
			bottomBound--;

			for (int row = bottomBound; leftBound <= rightBound && row >= upperBound; row--) {
				result.add(arr[row][leftBound]);
			}
			leftBound++;
		}
		return result;
	}
}
