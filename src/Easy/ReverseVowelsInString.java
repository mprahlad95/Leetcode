package Easy;

public class ReverseVowelsInString {
	public String reverseVowels(String s) {
		if (s == null || s.length() == 0)
			return "";
		int left = 0, right = s.length() - 1;
		StringBuilder sb = new StringBuilder(s);
		while (left < right) {
			char ch1 = sb.charAt(left), ch2 = sb.charAt(right);
			if ("aeiouAEIOU".indexOf(ch1) == -1)
				left++;
			else if ("aeiouAEIOU".indexOf(ch2) == -1)
				right--;
			else {
				char temp = sb.charAt(left);
				sb.setCharAt(left, sb.charAt(right));
				sb.setCharAt(right, temp);
				left++;
				right--;
			}
		}
		return sb.toString();
	}
}
