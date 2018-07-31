package Hard;

import java.util.*;

public class LongestConsecutiveSubsequence {
	public static int longestConsecutive(int[] nums) {
		int max = 0;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			int count = 1;
			int num = nums[i];
			while (set.contains(--num)) {// Check and Delete all decrementing consecutive numbers from set
				count++;
				set.remove(num);
			}
			num = nums[i];
			while (set.contains(++num)) {// Check and Delete all incrementing consecutive numbers from set
				count++;
				set.remove(num);
			}
			max = Math.max(max, count);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 3, 8, 4, 1, 5 };
		System.out.println(longestConsecutive(arr));
	}
}
