package Easy;

public class DiameterOfBST {
	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null)
			return 0;
		int ldia = diameterOfBinaryTree(root.left);
		int rdia = diameterOfBinaryTree(root.right);
		int lheight = height(root.left);
		int rheight = height(root.right);
		return Math.max(Math.max(ldia, rdia), lheight + rheight);
	}

	public int height(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(1 + height(root.left), 1 + height(root.right));
	}
}
