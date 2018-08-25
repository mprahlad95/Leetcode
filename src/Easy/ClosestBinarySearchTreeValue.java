package Easy;

import java.util.*;

public class ClosestBinarySearchTreeValue {
	public int closestValue(TreeNode root, double target) {
		if (root == null)
			return 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		Map<Double, Integer> map = new TreeMap<>();
		while (!q.isEmpty()) {
			root = q.remove();
			map.put(Math.abs(target - root.val), root.val);
			if (root.left != null)
				q.add(root.left);
			if (root.right != null)
				q.add(root.right);
		}
		for (Map.Entry<Double, Integer> entry : map.entrySet()) {
			return entry.getValue();
		}
		return 0;
	}
}
