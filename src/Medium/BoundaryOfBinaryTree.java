package Medium;

import java.util.*;

public class BoundaryOfBinaryTree {
	List<Integer> list = new ArrayList<>();

	public List<Integer> boundaryOfBinaryTree(TreeNode root) {
		if (root == null)
			return list;
		list.add(root.val);
		dfsleft(root.left);
		dfsleaves(root.left);
		dfsleaves(root.right);
		dfsright(root.right);
		return list;
	}

	public void dfsleft(TreeNode root) {
		if (root == null || (root.left == null && root.right == null))
			return;
		list.add(root.val);
		if (root.left == null)
			dfsleft(root.right);
		else
			dfsleft(root.left);
	}

	public void dfsleaves(TreeNode root) {
		if (root == null)
			return;
		dfsleaves(root.left);
		dfsleaves(root.right);
		if (root.left == null && root.right == null) {
			list.add(root.val);
		}
	}

	public void dfsright(TreeNode root) {
		if (root == null || (root.left == null && root.right == null))
			return;
		if (root.right == null)
			dfsright(root.left);
		else
			dfsright(root.right);
		list.add(root.val);
	}
}
