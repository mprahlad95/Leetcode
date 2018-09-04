package Easy;

public class LemonadeChannge {
	public boolean lemonadeChange(int[] bills) {
		int fives = 0;
		int tens = 0;
		for (int bill : bills) {
			switch (bill) {
			case 5:
				fives++;
				break;
			case 10:
				fives--;
				tens++;
				if (fives < 0) {
					return false;
				}
				break;
			case 20:
				if (tens > 0 && fives > 0) {
					tens--;
					fives--;
					break;
				} else if (fives > 2) {
					fives -= 3;
					break;
				}
				return false;
			}
		}
		return true;
	}
}
