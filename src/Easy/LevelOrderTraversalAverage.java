package Easy;

import java.util.*;

public class LevelOrderTraversalAverage {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> avg = new ArrayList<>();
		if (root == null)
			return avg;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int currentSize = q.size();
			double sum = 0, count = 0;
			while (count++ < currentSize) {
				root = q.remove();
				sum += root.val;
				if (root.left != null)
					q.add(root.left);
				if (root.right != null)
					q.add(root.right);
			}
			avg.add(sum / currentSize);
		}
		return avg;
	}
}
