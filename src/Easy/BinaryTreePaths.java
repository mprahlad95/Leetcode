package Easy;

import java.util.*;

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<>();
		String path = "";
		if (root == null)
			return list;
		list.addAll(binaryTreePaths(root.left));
		list.addAll(binaryTreePaths(root.right));
		for (int i = 0; i < list.size(); i++) {
			path = root.val + "->" + list.get(i);
			list.set(i, path);
		}
		if (list.size() == 0)
			list.add(String.valueOf(root.val));
		return list;
	}
}
