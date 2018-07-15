package Easy;

import java.util.*;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> current, previous = null;
		for (int i = 0; i < numRows; ++i) {
			current = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					current.add(1);
				else
					current.add(previous.get(j - 1) + previous.get(j));
			previous = current;
			res.add(current);
		}
		return res;
	}
}
