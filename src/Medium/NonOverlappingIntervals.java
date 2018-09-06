package Medium;

import java.util.*;

public class NonOverlappingIntervals {
	public int eraseOverlapIntervals(Interval[] intervals) {
		if (intervals == null || intervals.length == 0)
			return 0;
		Arrays.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval i1, Interval i2) {
				return Integer.compare(i1.end, i2.end);
			}
		});
		Interval previous = intervals[0];
		int ans = 0;
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i].start >= previous.end)
				previous = intervals[i];
			else
				ans++;
		}
		return ans;
	}
}
