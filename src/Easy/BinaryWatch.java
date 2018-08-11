package Easy;

import java.util.*;

public class BinaryWatch {
	public static List<String> readBinaryWatch(int num) {
		List<String> list = new ArrayList<>();
		if (num > 8)
			return list;
		if (num == 0) {
			list.add("0:00");
			return list;
		}
		int[] arr = { 8, 4, 2, 1, 32, 16, 8, 4, 2, 1 };
		boolean[] used = new boolean[10];
		helper(0, arr, num, used, list);
		return list;
	}

	public static void helper(int start, int[] arr, int num, boolean[] used, List<String> list) {
		if (num == 0) {
			int hour = 0;
			int minute = 0;
			for (int i = 0; i < 10; i++) {
				if (used[i] == true) {
					if (i < 4)
						hour += arr[i];
					else
						minute += arr[i];
				}
			}
			if (hour > 11 || minute > 59) {
				return;
			} else {
				if (minute < 10) {
					String answer = hour + ":" + "0" + minute;
					list.add(answer);
					return;
				} else {
					String answer = hour + ":" + minute;
					list.add(answer);
					return;
				}
			}
		}
		for (int i = start; i < arr.length; i++) {
			used[i] = true;
			helper(i + 1, arr, num - 1, used, list);
			used[i] = false;
		}
	}
	public static void main(String[] args) {
		System.out.println(readBinaryWatch(5));
	}
}
