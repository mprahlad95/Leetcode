package Easy;

public class MaximumDistanceToClosestPerson {
	public int maxDistToClosest(int[] seats) {
		int lastOneIndex = -1, maxDist = 0;
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == 0)
				continue;
			if (lastOneIndex == -1) {
				maxDist = Math.max(maxDist, i);
			} else {
				maxDist = Math.max(maxDist, (i - lastOneIndex) / 2);
			}
			lastOneIndex = i;
		}
		if (seats[seats.length - 1] == 0) {
			maxDist = Math.max(maxDist, seats.length - 1 - lastOneIndex);
		}
		return maxDist;
	}
}
