package Easy;

import java.util.*;

public class MeetingRooms {
	public boolean canAttendMeetings(Interval[] intervals) {
		if (intervals == null || intervals.length == 0)
			return true;
		Arrays.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval i1, Interval i2) {
				return Integer.compare(i1.start, i2.start);
			}
		});
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i - 1].end > intervals[i].start)
				return false;
		}
		return true;
	}
}
