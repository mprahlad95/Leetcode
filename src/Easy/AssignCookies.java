package Easy;

import java.util.*;

public class AssignCookies {
	public int findContentChildren(int[] greed, int[] size) {
		if (greed == null || greed.length == 0 || size == null || size.length == 0)
			return 0;
		Arrays.sort(greed);
		Arrays.sort(size);
		int ptr = 0;
		for (int i = 0; ptr < greed.length && i < size.length; i++) {
			if (size[i] >= greed[ptr])
				ptr++;
		}
		return ptr;
	}
}
