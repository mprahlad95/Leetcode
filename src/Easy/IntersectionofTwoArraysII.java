package Easy;

import java.util.*;

public class IntersectionofTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
			return new int[0];
		List<Integer> set = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		for (int num : nums1) {
			set.add(num);
		}
		int k = 0;
		for (int num : nums2) {
			if (set.contains(num)) {
				list.add(num);
				set.remove(new Integer(num));// auto-boxing to remove object, not index
			}
		}
		int[] arr = new int[list.size()];
		for (int num : list) {
			arr[k++] = num;
		}
		return arr;
	}
}
