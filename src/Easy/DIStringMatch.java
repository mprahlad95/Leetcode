package Easy;

import java.util.*;

public class DIStringMatch {
	public int[] diStringMatch(String S) {
		int len = S.length(), dec = 0, inc = 0, min = Integer.MAX_VALUE;
		Set<Integer> set = new HashSet<>();
		set.add(0);
		int[] arr = new int[len + 1];
		for (int i = 0; i < len; i++) {
			char ch = S.charAt(i);
			if (ch == 'I') {
				while (set.contains(inc))
					inc++;
				arr[i + 1] = inc;
				set.add(inc);
			} else {
				while (set.contains(dec))
					dec--;
				arr[i + 1] = dec;
				set.add(dec);
			}
			min = Math.min(min, arr[i + 1]);
		}
		if (min < 0) {
			min *= -1;
			for (int i = 0; i < arr.length; i++) {
				arr[i] += min;
			}
		}
		return arr;
	}
}
