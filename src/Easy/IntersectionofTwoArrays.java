package Easy;

import java.util.*;

public class IntersectionofTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
			return new int[0];
		Set<Integer> set = new HashSet<>();
		Set<Integer> intersection = new HashSet<>();
		for (int num : nums1) {
			set.add(num);
		}
		int k = 0;
		for (int num : nums2) {
			if (set.contains(num))
				intersection.add(num);
		}
		int[] arr = new int[intersection.size()];
		for (int num : intersection) {
			arr[k++] = num;
		}
		return arr;
	}
}
