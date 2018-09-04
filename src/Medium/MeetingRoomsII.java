package Medium;

import java.util.*;

public class MeetingRoomsII {
	public int minMeetingRooms(Interval[] intervals) {
		if (intervals == null || intervals.length == 0)
			return 0;
		// Arrays.sort(intervals, (a,b)->a.start-b.start);
		Arrays.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval i1, Interval i2) {
				return Integer.compare(i1.start, i2.start);
			}
		});
		// PriorityQueue<Interval> pq = new PriorityQueue<>((a,b)->a.end-b.end);
		PriorityQueue<Interval> pq = new PriorityQueue<>(intervals.length, new Comparator<Interval>() {
			@Override
			public int compare(Interval i1, Interval i2) {
				return Integer.compare(i1.end, i2.end);
			}
		});
		pq.add(intervals[0]);
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i].start >= pq.peek().end) {
				pq.remove();
			}
			pq.add(intervals[i]);
		}
		return pq.size();
	}
}
