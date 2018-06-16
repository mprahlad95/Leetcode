package Easy;

public class Strstr {
	public int strStr(String haystack, String needle) {
		int len = needle.length();
		int i;
		for (i = 0; i < haystack.length(); i++) {
			if (haystack.substring(i, i + len).equals(needle)) {
				break;
			}
			i = -1;
		}
		return i;
	}
}
