package Easy;

import java.util.*;

public class SelfDividingNumber {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		while (left <= right) {
			int num = left;
			while (num > 0) {
				int digit = num % 10;
				if (digit == 0 || left % digit != 0)
					break;
				num /= 10;
			}
			if (num == 0)
				list.add(left);
			left++;
		}
		return list;
	}
}
