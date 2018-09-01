package Medium;

public class ReverseWordsInStringII {
	public void reverseWords(char[] str) {
		if (str == null || str.length == 0)
			return;
		reverse(str, 0, str.length - 1);
		for (int i = 0, j = 0; i < str.length; i++) {
			if (i == str.length - 1) {
				reverse(str, j, i);
			} else if (str[i] == ' ') {
				reverse(str, j, i - 1);
				j = i + 1;
			}
		}
	}

	public void reverse(char[] str, int start, int end) {
		while (start < end) {
			char temp = str[start];
			str[start++] = str[end];
			str[end--] = temp;
		}
	}
}
