package Easy;

public class RomanToInt {
	public int romanToInt(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'C') {
				if (i < s.length() - 1) {
					if (s.charAt(i + 1) == 'D') {
						sum += 400;
						i++;
					} else if (s.charAt(i + 1) == 'M') {
						sum += 900;
						i++;
					} else if (s.charAt(i + 1) == 'C') {
						sum += 200;
						i++;
					}
				} else
					sum += 100;
			} else if (s.charAt(i) == 'X') {
				if (i < s.length() - 1) {
					if (s.charAt(i + 1) == 'L') {
						sum += 40;
						i++;
					} else if (s.charAt(i + 1) == 'C') {
						sum += 90;
						i++;
					} else if (s.charAt(i + 1) == 'X') {
						sum += 20;
						i++;
					}
				} else
					sum += 10;
			} else if (s.charAt(i) == 'I') {
				if (i < s.length() - 1) {
					if (s.charAt(i + 1) == 'V') {
						sum += 4;
						i++;
					} else if (s.charAt(i + 1) == 'X') {
						sum += 9;
						i++;
					} else if (s.charAt(i + 1) == 'I') {
						sum += 2;
						i++;
					}
				} else
					sum += 1;
			} else if (s.charAt(i) == 'M') {
				sum += 1000;
			} else if (s.charAt(i) == 'D') {
				sum += 500;
			} else if (s.charAt(i) == 'V') {
				sum += 5;
			} else if (s.charAt(i) == 'L') {
				sum += 50;
			}
		}
		return sum;
	}
}
