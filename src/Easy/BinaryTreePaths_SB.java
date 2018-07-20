package Easy;

import java.util.*;

public class BinaryTreePaths_SB {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> paths = new LinkedList<>();
		if (root == null)
			return paths;
		StringBuilder temp = new StringBuilder();
		helper(root, temp, paths);
		return paths;
	}

	public void helper(TreeNode root, StringBuilder temp, List<String> paths) {
		if (root == null)
			return;
		int len = temp.length();
		if (root.left == null && root.right == null) {
			temp.append(root.val);
			paths.add(temp.toString());
			temp.setLength(len);
		} else {
			temp.append(root.val).append("->");
		}
		helper(root.left, temp, paths);
		helper(root.right, temp, paths);
		temp.setLength(len);
		return;
	}
}
