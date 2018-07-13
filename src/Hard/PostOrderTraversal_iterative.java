package Hard;

import java.util.*;

public class PostOrderTraversal_iterative {
	public List<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> arr = new ArrayList<>();
		if (root == null)
			return arr;
		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();
		s1.push(root);
		while (!s1.isEmpty()) {
			root = s1.pop();
			s2.push(root);
			if (root.left != null)
				s1.push(root.left);
			if (root.right != null)
				s1.push(root.right);
		}
		while (!s2.isEmpty()) {
			root = s2.pop();
			arr.add(root.val);
		}
		return arr;
	}
}
