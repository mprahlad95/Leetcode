package Medium;

import java.util.*;

public class AddOneRowtoTree {
	public TreeNode addOneRow(TreeNode t, int v, int d) {
		if (d == 1) {
			TreeNode node = new TreeNode(v);
			node.left = t;
			return node;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(t);
		int depth = 1;
		while (!queue.isEmpty() && depth < d - 1) {
			int size = queue.size();
			while (size-- > 0) {
				TreeNode node = queue.remove();
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			depth++;
		}
		while (!queue.isEmpty()) {
			TreeNode node = queue.remove();
			TreeNode temp = node.left;
			node.left = new TreeNode(v);
			node.left.left = temp;
			temp = node.right;
			node.right = new TreeNode(v);
			node.right.right = temp;
		}
		return t;
	}
}
