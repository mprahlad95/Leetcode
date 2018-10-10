package Easy;

public class ReverseOnlyLetters {
	public String reverseOnlyLetters(String S) {
		if (S == null || S.length() == 0)
			return "";
		int right = S.length() - 1, left = 0;
		StringBuilder sb = new StringBuilder(S);
		while (left < right) {
			if (!Character.isAlphabetic(sb.charAt(left)))
				left++;
			else if (!Character.isAlphabetic(sb.charAt(right)))
				right--;
			else {
				char ch = sb.charAt(left);
				sb.setCharAt(left, sb.charAt(right));
				sb.setCharAt(right, ch);
				left++;
				right--;
			}
		}
		return sb.toString();
	}
}
