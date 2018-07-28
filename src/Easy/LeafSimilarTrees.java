package Easy;

import java.util.*;

public class LeafSimilarTrees {
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		findLeaf(root1, list1);
		findLeaf(root2, list2);
		return list1.equals(list2);
	}

	public void findLeaf(TreeNode root, ArrayList<Integer> list) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			list.add(root.val);
		}
		findLeaf(root.left, list);
		findLeaf(root.right, list);
	}
}
