package Medium;

import java.util.*;

public class KthLargestElementArray {
	public int findKthLargest(int[] nums, int k) {
		if (nums == null || nums.length == 0 || nums.length < k)
			return 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i;
		for (i = 0; i < k; i++) {
			pq.add(nums[i]);
		}
		while (i < nums.length) {
			if (nums[i] > pq.peek()) {
				pq.remove();
				pq.add(nums[i]);
			}
			i++;
		}
		return pq.peek();
	}
}
