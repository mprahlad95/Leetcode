package Easy;

public class StringCompression {
	public int compress(char[] chars) {
		int currentcount = 1, newindex = 0, i;
		for (i = 1; i < chars.length; i++) {
			if (chars[i] == chars[i - 1])
				currentcount++;
			// Check if previous character is not a digit, unequal or last character
			if (chars[i] != chars[i - 1]) {
				// Store character
				chars[newindex++] = chars[i - 1];
				// Convert frequency into character array
				char[] count = String.valueOf(currentcount).toCharArray();
				// Adding character followed by frequency
				if (currentcount > 1) {
					for (int loop = 0; loop < count.length; loop++)
						chars[newindex++] = count[loop];
					currentcount = 1;
				}
			}
		}
		// Last character
		if (i == chars.length) {
			chars[newindex++] = chars[i - 1];
			if (currentcount > 1) {
				char[] count = String.valueOf(currentcount).toCharArray();
				for (int loop = 0; loop < count.length; loop++)
					chars[newindex++] = count[loop];
			}
		}
		return newindex;
	}
}
