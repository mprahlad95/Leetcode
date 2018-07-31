package Medium;

import java.util.*;

public class LargestNumber {
	public String largestNumber(int[] nums) {
		if (nums == null || nums.length == 0)
			return "";
		String[] s_nums = new String[nums.length];
		for (int i = 0; i < nums.length; i++)
			s_nums[i] = String.valueOf(nums[i]);
		Arrays.sort(s_nums, (s1, s2) -> (s2 + s1).compareTo(s1 + s2)); // Sort strings. Automatically solved.
		if (s_nums[0].charAt(0) == '0')
			return "0";
		StringBuilder sb = new StringBuilder();
		for (String s : s_nums)
			sb.append(s);
		return sb.toString();
	}
}
