package Hard;

public class TrappingRainWater {
	public int trap(int[] height) {
		if (height == null || height.length == 0)
			return 0;
		int last = 0, area = 0;
		for (int i = 1; i < height.length; i++) {
			if (height[i] >= height[last]) {
				int minHeight = Math.min(height[i], height[last]);
				while (++last < i) {
					area += minHeight - height[last];
				}
			}
		}
		last = height.length - 1;
		for (int i = height.length - 2; i >= 0; i--) {
			if (height[i] > height[last]) {
				int minHeight = Math.min(height[i], height[last]);
				while (--last > i) {
					area += minHeight - height[last];
				}
			}
		}
		return area;
	}
}
