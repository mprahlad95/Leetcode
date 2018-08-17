package Medium;

public class CreateTreefromInorderPostorder {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder == null || postorder == null)
			return null;
		return createTree(inorder, inorder.length - 1, 0, postorder, postorder.length - 1);
	}

	public TreeNode createTree(int[] inorder, int start, int end, int[] postorder, int index) {
		if (start < end || index < 0)
			return null;
		TreeNode root = new TreeNode(postorder[index]);
		int position = start;
		for (int i = start; i >= end; i--) {
			if (inorder[i] == root.val) {
				position = i;
				break;
			}
		}
		root.right = createTree(inorder, start, position + 1, postorder, index - 1);
		root.left = createTree(inorder, position - 1, end, postorder, index - (start - position) - 1);
		return root;
	}
}
