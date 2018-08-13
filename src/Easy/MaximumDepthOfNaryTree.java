package Easy;

import java.util.*;

public class MaximumDepthOfNaryTree {
	public int maxDepth(Node root) {
		if (root == null)
			return 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int depth = 0;
		while (!q.isEmpty()) {
			int level = q.size();//DOESNT WORK
			depth++;
			while (level-- > 0) {
				root = q.remove();
				for (Node tempNode : root.children) {
					q.add(tempNode);
				}
			}
		}
		return depth;
	}
}
