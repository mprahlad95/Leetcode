package Easy;

public class LemonadeChannge {
	class Solution {
		public boolean lemonadeChange(int[] bills) {
			if (bills == null || bills.length == 0)
				return true;
			int five = 0, ten = 0;
			for (int i = 0; i < bills.length; i++) {
				if (bills[i] == 5) {
					five++;
				}
				if (bills[i] == 10) {
					if (five == 0)
						return false;
					five--;
					ten++;
				}
				if (bills[i] == 20) {
					if (five == 0)
						return false;
					if (five >= 1 && ten >= 1) {
						ten--;
						five--;
					} else if (five >= 3 && ten == 0) {
						five -= 3;
					} else
						return false;
				}
			}
			return true;
		}
	}
}
