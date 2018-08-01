package Hard;

import java.util.*;

public class SerializeDeserializeBinaryTree {
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		if (root == null)
			return "*,";
		return String.valueOf(root.val) + "," + serialize(root.left) + serialize(root.right);
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		return helper(new LinkedList<String>(Arrays.asList(data.split(","))));
	}

	public TreeNode helper(List<String> list) {
		String s = list.remove(0);
		if (s.equals("*"))
			return null;
		TreeNode node = new TreeNode(Integer.valueOf(s));
		node.left = helper(list);
		node.right = helper(list);
		return node;
	}
}
