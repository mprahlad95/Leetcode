package Easy;

import java.util.*;

public class RootToLeafPaths {
	TreeNode root;
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> paths = new LinkedList<>();
		if (root == null)
			return paths;
		if (root.left == null && root.right == null) {
			paths.add(root.val + "");
			return paths;
		}
		for (String path : binaryTreePaths(root.left)) {
			paths.add(root.val + "->" + path);
		}
		for (String path : binaryTreePaths(root.right)) {
			paths.add(root.val + "->" + path);
		}
		return paths;
	}
	public static void main(String[] args) {
		RootToLeafPaths x = new RootToLeafPaths();
		x.root = new TreeNode(1);
		x.root.left = new TreeNode(2);
		x.root.right = new TreeNode(3);
		x.root.left.left = new TreeNode(4);
		x.root.left.right = new TreeNode(5);
		x.root.right.left = new TreeNode(6);
		x.root.right.right = new TreeNode(7);
		x.binaryTreePaths(x.root);
	}
}
