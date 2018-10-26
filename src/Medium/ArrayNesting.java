package Medium;

public class ArrayNesting {
	public int arrayNesting(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			int next = i;
			int count = 0;
			while (nums[next] != -1) {
				count++;
				int temp = next;
				next = nums[next];
				nums[temp] = -1;
			}
			max = Math.max(max, count);
		}
		return max;
	}
}
