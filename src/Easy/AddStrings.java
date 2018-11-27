package Easy;

public class AddStrings {
	public String addStrings(String num1, String num2) {
		char[] cnum1 = num1.toCharArray(), cnum2 = num2.toCharArray();
		StringBuilder sum = new StringBuilder();
		int l1 = cnum1.length - 1, l2 = cnum2.length - 1, carry = 0, temp = 0;
		while (l1 >= 0 || l2 >= 0) {
			if (l1 >= 0)
				temp += cnum1[l1] - '0';
			if (l2 >= 0)
				temp += cnum2[l2] - '0';
			if (temp > 9) {
				temp = temp % 10;
				carry = 1;
			} else
				carry = 0;
			sum.append(temp);
			l1--;
			l2--;
			temp = carry;
		}
		if (carry == 1)
			sum.append("1");
		return sum.reverse().toString();
	}
}
