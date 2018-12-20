package Easy;

import java.util.*;

public class PreOrderTraversal_Nary {
	public List<Integer> preorder(Node root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			root = stack.pop();
			list.add(root.val);
			for (int i = root.children.size() - 1; i >= 0; i--) {
				stack.push(root.children.get(i));
			}
		}
		return list;
	}
}
