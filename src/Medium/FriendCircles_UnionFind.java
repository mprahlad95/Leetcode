package Medium;

public class FriendCircles_UnionFind {
	public int findCircleNum(int[][] M) {
		if (M.length == 0)
			return 0;
		int n = M.length;
		int[] friends = new int[n];
		for (int i = 0; i < n; i++)
			friends[i] = i;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (M[i][j] == 1) {
					int studentA = find(friends, i);
					int studentB = find(friends, j);
					friends[studentB] = studentA;
				}
			}
		}

		int circles = 0;
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == i)
				circles++;
		}
		return circles;
	}

	public int find(int friends[], int student) {
		if (friends[student] != student) {
			friends[student] = find(friends, friends[student]);
		}
		return friends[student];
	}
}
