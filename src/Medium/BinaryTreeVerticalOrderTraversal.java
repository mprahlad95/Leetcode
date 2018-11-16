package Medium;

import java.util.*;

public class BinaryTreeVerticalOrderTraversal {
	class NodewithLevel {
		TreeNode root;
		int level;

		NodewithLevel(TreeNode root, int level) {
			this.root = root;
			this.level = level;
		}
	}

	public List<List<Integer>> verticalOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null)
			return list;
		List<Integer> tempList = new ArrayList<>();
		List<NodewithLevel> NodeLevelList = new ArrayList<>();
		Queue<NodewithLevel> queue = new LinkedList<>();
		queue.add(new NodewithLevel(root, 0));
		while (!queue.isEmpty()) {
			NodewithLevel node = queue.remove();
			TreeNode tempRoot = node.root;
			NodeLevelList.add(node);
			int tempLevel = node.level;
			if (tempRoot.left != null)
				queue.add(new NodewithLevel(tempRoot.left, tempLevel - 1));
			if (tempRoot.right != null)
				queue.add(new NodewithLevel(tempRoot.right, tempLevel + 1));
		}

		Collections.sort(NodeLevelList, new Comparator<NodewithLevel>() {
			@Override
			public int compare(NodewithLevel n1, NodewithLevel n2) {
				return Integer.compare(n1.level, n2.level);
			}
		});

		int left = 0, right = 0;
		while (right < NodeLevelList.size()) {
			while (right < NodeLevelList.size() && NodeLevelList.get(left).level == NodeLevelList.get(right).level) {
				tempList.add(NodeLevelList.get(right).root.val);
				right++;
			}
			list.add(new ArrayList<>(tempList));
			tempList.clear();
			left = right;
		}
		return list;
	}
}
