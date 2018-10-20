package Medium;

import java.util.*;

public class MinimumTimeDifference {
	public int findMinDifference(List<String> timePoints) {
		if (timePoints == null || timePoints.size() == 0 || timePoints.size() > 1440)
			return 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < timePoints.size(); i++) {
			int currentTime = Integer.parseInt(timePoints.get(i).substring(0, 2)) * 60
					+ Integer.parseInt(timePoints.get(i).substring(3));
			if (currentTime <= 720)
				list.add(currentTime + 1440);
			list.add(currentTime);
		}
		Collections.sort(list);
		int mindif = Integer.MAX_VALUE;
		for (int i = 1; i < list.size(); i++) {
			mindif = Math.min(mindif, list.get(i) - list.get(i - 1));
		}
		return mindif;
	}
}
