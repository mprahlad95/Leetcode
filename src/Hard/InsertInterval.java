package Hard;

import java.util.*;

public class InsertInterval {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> result = new ArrayList<>();
		if (intervals == null || intervals.size() == 0) {
			result.add(newInterval);
			return result;
		}
		int start = newInterval.start, end = newInterval.end;
		for (int i = 0; i < intervals.size(); i++) {
			Interval current = intervals.get(i);
			if ((start >= current.start && start <= current.end) || (end >= current.start && end <= current.end)) {
				start = Math.min(start, current.start);
				end = Math.max(end, current.end);
			} else if (start > current.end) {
				result.add(current);
			} else if (end < current.start) {
				result.add(new Interval(start, end));
				start = current.start;
				end = current.end;
			}
		}
		result.add(new Interval(start, end));
		return result;
	}
}
