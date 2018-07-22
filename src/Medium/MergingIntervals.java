package Medium;

import java.util.*;

public class MergingIntervals {
	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> list = new ArrayList<>();
		if (intervals == null || intervals.size() < 2)
			return intervals;
		Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return Integer.compare(o1.start, o2.start);
			}
		});
		Interval previous = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			Interval current = intervals.get(i);
			if (current.start <= previous.end) {
				previous.end = Math.max(previous.end, current.end);
				previous = new Interval(previous.start, previous.end);
			} else {
				list.add(previous);
				previous = current;
			}
		}
		list.add(previous);
		return list;
	}
}
