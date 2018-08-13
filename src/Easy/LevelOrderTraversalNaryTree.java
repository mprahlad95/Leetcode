package Easy;

import java.util.*;

public class LevelOrderTraversalNaryTree {
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null)
			return list;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int current_size = q.size();
			List<Integer> current_list = new ArrayList<>();
			while (current_size-- > 0) {
				root = q.remove();
				current_list.add(root.val);
				for (Node tempNode : root.children) {
					q.add(tempNode);
				}
			}
			list.add(current_list);
		}
		return list;
	}
}
