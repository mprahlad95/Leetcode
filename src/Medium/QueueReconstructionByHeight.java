package Medium;

import java.util.*;

public class QueueReconstructionByHeight {
	public int[][] reconstructQueue(int[][] people) {
		if (people == null || people.length == 0)
			return new int[0][0];

		Arrays.sort(people, new Comparator<int[]>() {
			@Override
			public int compare(int[] p1, int[] p2) {
				if (p1[0] == p2[0])
					return Integer.compare(p1[1], p2[1]); // if equal h value, sort in ascending, according to k
				return Integer.compare(p2[0], p1[0]);
			}
		});

		List<int[]> list = new ArrayList<>();
		for (int[] person : people)
			list.add(person[1], person);

		return list.toArray(new int[0][0]);
	}
}
