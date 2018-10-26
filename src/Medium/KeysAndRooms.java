package Medium;

import java.util.*;

public class KeysAndRooms {
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		Stack<Integer> dfs = new Stack<>();
		Set<Integer> visited = new HashSet<>();
		dfs.add(0);
		visited.add(0);
		while (!dfs.isEmpty()) {
			int i = dfs.pop();
			for (int j : rooms.get(i)) {
				if (!visited.contains(j)) {
					dfs.add(j);
					visited.add(j);
				}
			}
		}
		return rooms.size() == visited.size();
	}

}
