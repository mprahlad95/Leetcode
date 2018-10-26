package Easy;

import java.util.*;

public class HappyNumber {
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		while (set.add(n)) {
			int sum = 0;
			while (n > 0) {
				int temp = n % 10;
				sum += temp * temp;
				n /= 10;
			}
			if (sum == 1)
				return true;
			n = sum;
		}
		return false;
	}
}
