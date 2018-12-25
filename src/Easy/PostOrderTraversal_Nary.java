package Easy;

import java.util.*;

public class PostOrderTraversal_Nary {
	public List<Integer> postorder(Node root) {
		LinkedList<Integer> list = new LinkedList<>();
		if (root == null)
			return list;
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			root = stack.pop();
			list.addFirst(root.val);
			for (Node child : root.children)
				stack.push(child);
		}
		return list;
	}
}
