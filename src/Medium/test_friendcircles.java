package Medium;

import java.util.*;

public class test_friendcircles {
	public static void displayFriends(int[] friends) {
		System.out.println("friends state : ");

		for (int i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + " ");
		}

		System.out.println();
	}

	public static int findCircleNum(int[][] M) {
		if (M.length == 0)
			return 0;

		int n = M.length;
		int[] friends = new int[n];

		for (int i = 0; i < n; i++)
			friends[i] = i;

		displayFriends(friends);

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (M[i][j] == 1) {
					int studentA = find(friends, i);
					int studentB = find(friends, j);

					friends[studentB] = studentA;
					displayFriends(friends);
				}
			}
		}

		HashSet<Integer> circles = new HashSet<Integer>();

		// most important line below, delete this to get WA
		// for(int i = 0; i < friends.length; i++) friends[i] = find(friends, i);

		displayFriends(friends);

		for (int i = 0; i < friends.length; i++) {
			circles.add(friends[i]);
		}

		return circles.size();
	}

	public static int find(int friends[], int student) {
		if (friends[student] != student) {
			friends[student] = find(friends, friends[student]);
		}

		return friends[student];
	}

	public static void main(String args[]) {
		int[][] grid = { { 1, 0, 0, 1 }, { 0, 1, 1, 0 }, { 0, 1, 1, 1 }, { 1, 0, 1, 1 } };

		System.out.println("circles = " + findCircleNum(grid));
	}
}
