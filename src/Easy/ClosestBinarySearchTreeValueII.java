package Easy;

import java.util.*;

public class ClosestBinarySearchTreeValueII {
	public List<Integer> closestKValues(TreeNode root, double target, int k) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		Map<Double, Integer> map = new TreeMap<>();
		while (!q.isEmpty()) {
			root = q.remove();
			if (map.containsKey(Math.abs(target - root.val))) {
				map.put(Math.abs(target - root.val) + 0.000001, root.val);
			} else
				map.put(Math.abs(target - root.val), root.val);
			if (root.left != null)
				q.add(root.left);
			if (root.right != null)
				q.add(root.right);
		}
		for (Map.Entry<Double, Integer> entry : map.entrySet()) {
			if (k-- > 0)
				list.add(entry.getValue());
		}
		return list;
	}
}
