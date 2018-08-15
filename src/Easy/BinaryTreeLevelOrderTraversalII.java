package Easy;

import java.util.*;

public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null)
			return list;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int level = q.size();
			List<Integer> tempList = new ArrayList<>();
			while (level-- > 0) {
				root = q.remove();
				tempList.add(root.val);
				if (root.left != null)
					q.add(root.left);
				if (root.right != null)
					q.add(root.right);
			}
			list.add(0, tempList);// Add to first index and move rest
		}
		return list;
	}
}
