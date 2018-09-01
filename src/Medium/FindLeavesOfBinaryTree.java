package Medium;

import java.util.*;

public class FindLeavesOfBinaryTree {
	public List<List<Integer>> findLeaves(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null)
			return list;
		while (root != null) {
			List<Integer> leaves = new ArrayList<>();
			if (isLeaf(root, leaves))
				root = null;
			list.add(leaves);
		}
		return list;
	}

	public boolean isLeaf(TreeNode root, List<Integer> leaves) {
		if (root.left == null && root.right == null) {
			leaves.add(root.val);
			return true;
		}
		if (root.left != null) {
			if (isLeaf(root.left, leaves))
				root.left = null;
		}
		if (root.right != null) {
			if (isLeaf(root.right, leaves))
				root.right = null;
		}
		return false;
	}
}
