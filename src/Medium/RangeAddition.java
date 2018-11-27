package Medium;

public class RangeAddition {
	public int[] getModifiedArray(int length, int[][] updates) {
		int[] ans = new int[length];
		if (length == 0 || updates == null || updates.length == 0)
			return ans;
		for (int[] update : updates) {
			int left = update[0], right = update[1], inc = update[2];
			while (left <= right) {
				ans[left++] += inc;
			}
		}
		return ans;
	}
}
