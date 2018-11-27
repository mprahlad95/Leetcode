package Easy;

public class AddBinary {
	public String addBinary(String a, String b) {
		// Make both lengths equal by preprending 0s
		while (a.length() > b.length())
			b = "0" + b;
		while (a.length() < b.length())
			a = "0" + a;

		char[] res = new char[Math.max(a.length(), b.length())];
		char carry = '0';
		int lenA = a.length() - 1, lenB = b.length() - 1, index = res.length - 1;

		while (lenA >= 0 && lenB >= 0) {
			char chA = a.charAt(lenA), chB = b.charAt(lenB);
			if (chA == '1' && chB == '1') {
				if (carry == '1') {
					res[index] = '1';
					carry = '1';
				} else {
					res[index] = '0';
					carry = '1';
				}
			} else if (chA == '1' && chB == '0' || chA == '0' && chB == '1') {
				if (carry == '1') {
					res[index] = '0';
					carry = '1';
				} else if (carry == '0') {
					res[index] = '1';
					carry = '0';
				}
			} else {
				if (carry == '0')
					res[index] = '0';
				else {
					res[index] = '1';
					carry = '0';
				}
			}
			lenA--;
			lenB--;
			index--;
		}
		if (carry == '1')
			return "1" + String.valueOf(res);
		else
			return String.valueOf(res);
	}
}
