package Medium;

import java.util.*;

public class MaximumWidthOfBinaryTree {
	public int widthOfBinaryTree(TreeNode root) {
		if (root == null)
			return 0;
		Map<TreeNode, Integer> map = new HashMap<>();
		Queue<TreeNode> q = new LinkedList<>();
		int currentWidth = 0, maxWidth = 0;
		q.add(root);
		map.put(root, 1);
		while (!q.isEmpty()) {
			int size = q.size(), start = 0, end = 0;
			for (int i = 0; i < size; i++) {
				root = q.remove();
				if (i == 0) {
					start = map.get(root);
				}
				if (i == size - 1) {
					end = map.get(root);
				}
				if (root.left != null) {
					q.add(root.left);
					map.put(root.left, map.get(root) * 2); // left child location = 2 * parent location
				}
				if (root.right != null) {
					q.add(root.right);
					map.put(root.right, map.get(root) * 2 + 1); // right child location = 2 * parent location + 1
				}
			}
			currentWidth = end - start + 1;
			maxWidth = Math.max(maxWidth, currentWidth);
		}
		return maxWidth;
	}
}
