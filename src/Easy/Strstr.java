package Easy;

public class Strstr {
	public static int strStr(String haystack, String needle) {
		if (haystack.length() == 0 && needle.length() == 0 || haystack.equals(needle))
			return 0;
		if (haystack.length() == 0)
			return -1;
		int len = needle.length();
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.length() >= i + len && haystack.substring(i, i + len).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(Strstr.strStr("needle", "ll"));
	}
}
