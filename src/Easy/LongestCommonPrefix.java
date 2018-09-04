
package Easy;

class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		String pre = strs[0];
		int i = 1;
		while (i < strs.length) {
			while (strs[i].indexOf(pre) != 0) {
				System.out.println(strs[i].indexOf(pre));
				pre = pre.substring(0, pre.length() - 1);// prune from end until common prefix is reached
			}
			i++;
		}
		return pre;
	}

	public static void main(String[] args) {
		String[] arr = { "prahlad", "prehled", "prahled" };
		System.out.println(longestCommonPrefix(arr));
	}
}
