package Medium;

import java.util.*;

public class BinarySearchTreeIterator {
	public class BSTIterator {
		Queue<Integer> queue;

		public BSTIterator(TreeNode root) {
			queue = new LinkedList<>();
			helper(root);
		}

		public void helper(TreeNode root) {
			if (root == null)
				return;
			helper(root.left);
			queue.add(root.val);
			helper(root.right);
		}

		/** @return whether we have a next smallest number */
		public boolean hasNext() {
			return (!queue.isEmpty());
		}

		/** @return the next smallest number */
		public int next() {
			return queue.remove();
		}
	}
}
