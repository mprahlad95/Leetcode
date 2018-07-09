package Easy;

public class TrimBST_recursive {
	public TreeNode trimBST(TreeNode root, int L, int R) {
		if (root == null)
			return null;
		if (root.val < L)
			return trimBST(root.right, L, R);//move right. all subsequent left are less than current element
		if (root.val > R)
			return trimBST(root.left, L, R);//move left. all subsequent left are greater than current element
		root.left = trimBST(root.left, L, R);
		root.right = trimBST(root.right, L, R);
		return root;
	}
}
