package Google;

import java.util.*;

public class NextClosestTime {
	public String nextClosestTime(String time) {
		if (time == null || time.length() < 5)
			return "";
		int currentTime = 60 * Integer.parseInt(time.substring(0, 2)) + Integer.parseInt(time.substring(3));
		Set<Integer> set = new HashSet<>();
		char[] units = time.toCharArray();
		for (char c : units) {
			if (c != ':') {
				set.add(c - '0');
			}
		}
		for (int i = currentTime + 1;; i = (i + 1) % 1440) {
			List<Integer> digits = new ArrayList<>();
			digits.add(i / 60 / 10);
			digits.add(i / 60 % 10);
			digits.add(i % 60 / 10);
			digits.add(i % 60 % 10);
			Boolean flag = false;
			for (int d : digits) {
				if (!set.contains(d)) {
					flag = true;
					break;
				}
			}
			if (!flag)
				return String.format("%02d:%02d", i / 60, i % 60);
		}
	}
}
